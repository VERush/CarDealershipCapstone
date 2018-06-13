package com.finalcapstone.CarDealershipCapstone;
/*
 * Car Dealership Capstone
 * Showcasing API creation
 * Allison Farr, Ben McBrayer, Jonah Wooten, Victoria Rush
 * April 2018 Grand Circus Java Bootcamp
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finalcapstone.CarDealershipCapstone.entity.Car;
import com.finalcapstone.CarDealershipCapstone.repo.CarRepository;

@RestController
public class RestCarController {

	@Autowired
	CarRepository cr;

	@GetMapping("/carlist")
	public List<Car> getCarList(@RequestParam(value = "make", required = false) String make,
			@RequestParam(value = "model", required = false) String model,
			@RequestParam(value = "year", required = false) String year,
			@RequestParam(value = "color", required = false) String color) {
		int bitMask = 0;

		if (!make.isEmpty()) {
			bitMask+=16;
		}
			
		if (!model.isEmpty()) {
			bitMask+=8;
		}
		
		if (year > 1000) {
			bitMask+=4;	
		}
		
		if (!color.isEmpty()) {
			bitMask+=2;	
		}
		
			switch (bitMask) {
			case 2: 
				return cr.findByColor(color);
			case 4:
					return cr.findByYear(year);
			case 6: 
					return cr.findByYearAndColor(year, color);
			case 8: 
				return cr.findByModel(model);
			case 10:
				return cr.findByModelAndColor(model, color);
			case 12:
				return cr.findByModelAndYear(model, year);
			case 14:
				return cr.findByModelAndYearAndColor(model, year, color);
			case 16:
				return cr.findByMake(make);
			case 18:
				return cr.findByMakeAndColor(make, color);
			case 20:
				return cr.findByMakeAndYear(make, year);
			case 22:
				return cr.findByMakeAndYearAndColor(make, year, color);
			case 24:
				return cr.findByMakeAndModel(make, model);
			case 26:
				return cr.findByMakeAndModelAndColor(make, model, color);
			case 28:
				return cr.findByMakeAndModelAndYear(make, model, year);
			default:
				return cr.findByMakeAndModelAndYearAndColor(make, model, year, color);
			}	
	}
		
}

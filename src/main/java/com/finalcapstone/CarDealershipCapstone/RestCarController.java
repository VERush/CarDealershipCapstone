package com.finalcapstone.CarDealershipCapstone;

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
	
	@GetMapping("/carmake")
	public List<Car> carMake(@RequestParam("make") String make) {
		
		
		return cr.findByMake(make);
	}
	
	@GetMapping("/carmodel")
	public List<Car> carModel(@RequestParam("model") String model) {
		
		
		return cr.findByModel(model);
	}
	
	@GetMapping("/caryear")
	public List<Car> carYear(@RequestParam("year") int year) {
		
		
		return cr.findByYear(year);
	}
	
	@GetMapping("/carcolor")
	public List<Car> carColor(@RequestParam("color") String color) {
		
		
		return cr.findByColor(color);
	}
	
	
	
	
	
	
	
}

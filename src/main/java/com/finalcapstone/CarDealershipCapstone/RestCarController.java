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

	@GetMapping("/carlist")
	public List<Car> getCarList(@RequestParam(value = "make", required = false) String make,
			@RequestParam(value = "model", required = false) String model,
			@RequestParam(value = "year", required = false) int year,
			@RequestParam(value = "color", required = false) String color) {

		if (make.isEmpty()) {
			if (model.isEmpty()) {
				if (year < 1000) {
					return cr.findByColor(color);
				} else
					return cr.findByYearAndColor(year, color);
			} else
				return cr.findByModelAndYearAndColor(model, year, color);
		}

		if (model.isEmpty()) {
			if (year < 1000) {
				if (color.isEmpty())
					return cr.findByMake(make);
			} else
				return cr.findByMakeAndColor(make, color);
		} else
			return cr.findByMakeAndYearAndColor(make, year, color);

		if (year < 1000) {
			if (color.isEmpty()) {
				if (make.isEmpty()) {
					return cr.findByModel(model);
				} else
					return cr.findByMakeAndModel(make, model);
			} else
				return cr.findByMakeAndModelAndColor(make, model, color);
		}

		if (color.isEmpty()) {
			if (make.isEmpty()) {
				if (model.isEmpty()) {
					return cr.findByYear(year);
				} else
					return cr.findByModelAndYear(model, year);
			} else
				return cr.findByMakeAndModelAndYear(make, model, year);
		}

		if ((!make.isEmpty()) && (year > 1000) && (model.isEmpty()) && (color.isEmpty())) {
			return cr.findByMakeAndYear(make, year);
		}

		if ((!model.isEmpty()) && (!color.isEmpty()) && (make.isEmpty()) && (year < 1000)) {
			return cr.findByModelAndColor(model, color);
		}

		else return cr.findByMakeAndModelAndYearAndColor(make, model, year, color);
	}

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

	@GetMapping("/carmakemodel")
	public List<Car> carColor(@RequestParam("make") String make, @RequestParam("model") String model) {

		return cr.findByMakeAndModel(make, model);
	}

}

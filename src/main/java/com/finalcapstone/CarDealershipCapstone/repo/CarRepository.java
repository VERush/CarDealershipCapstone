package com.finalcapstone.CarDealershipCapstone.repo;
/*
 * Car Dealership Capstone
 * Showcasing API creation
 * Allison Farr, Ben McBrayer, Jonah Wooten, Victoria Rush
 * April 2018 Grand Circus Java Bootcamp
 */

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.finalcapstone.CarDealershipCapstone.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	List<Car> findByMake(String make);
	
	List<Car> findByModel(String model);
	
	List<Car> findByYear(int year);
	
	List<Car> findByColor(String color);
	
	List<Car> findByMakeAndModel(String make, String model);
	
	List<Car> findByMakeAndYear(String make, int year);
	
	List<Car> findByMakeAndColor(String make, String color);
	
	List<Car> findByModelAndYear(String model, int year);
	
	List<Car> findByModelAndColor(String model, String color);
	
	List<Car> findByYearAndColor(int year, String color);
	
	List<Car> findByMakeAndModelAndYear(String make, String model, int year);
	
	List<Car> findByMakeAndModelAndColor(String make, String model, String color);
	
	List<Car> findByMakeAndYearAndColor(String make, int year, String color);
	
	List<Car> findByModelAndYearAndColor(String model, int year, String color);
	
	List<Car> findByMakeAndModelAndYearAndColor(String make, String model, int year, String color);
	

}

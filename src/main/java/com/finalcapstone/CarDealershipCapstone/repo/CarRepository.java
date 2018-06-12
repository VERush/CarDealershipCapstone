package com.finalcapstone.CarDealershipCapstone.repo;

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
	
}

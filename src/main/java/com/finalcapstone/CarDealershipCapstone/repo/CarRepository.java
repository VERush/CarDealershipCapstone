package com.finalcapstone.CarDealershipCapstone.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.finalcapstone.CarDealershipCapstone.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

	List<Car> findByMake(String make);
	
	List<Car> findByLastModel(String model);
	
	List<Car> findByYear(int year);
	
	List<Car> findByColor(String color);
}

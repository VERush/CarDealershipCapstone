package com.finalcapstone.CarDealershipCapstone.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

	Optional<Car> findByMake(String make);
	
	Optional<Car> findByLastModel(String model);
	
	Optional<Car> findByYear(int year);
	
	Optional<Car> findByColor(String color);
}

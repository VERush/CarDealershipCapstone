package com.finalcapstone.CarDealershipCapstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "car")
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int carid;
	@Column(name= "make")
	private String make;
	@Column(name= "model")
	private String model;
	@Column(name= "year")
	private int year;
	@Column(name= "color")
	private String color;
	
	public Car() {
		
	}

	public Car(int carid, String make, String model, int year, String color) {
		super();
		this.carid = carid;
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car carid=" + carid + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color;
				
	}

	public Car(String make, String model, int year, String color) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	
	
}

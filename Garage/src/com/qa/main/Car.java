package com.qa.main;

public class Car extends Vehicle {

	//variables
	
	@Override
	public String type() { 
		return "Car";
	}
	
	@Override	
	public int wheels() {
		return 5;
	}
	
	@Override
	public int seats() {
		return 7;		
	}
	
	@Override
	public String color() {
		return "Yellow";
	}
	
	@Override
	public String toString() {
		return "Car [type()=" + type() + ", wheels()=" + wheels() + ", seats()=" + seats() +",color()=" + color() + "]"; 
	
	}
	
	
}
		


package com.qa.main;

public  class Motorbike extends Vehicle {

	@Override
	public String type() {
	return "Car";
	}
	
	@Override
	public int wheels() {
		return 2;		
	}
	
	@Override
	public int seats() {
		return 1;
	}
	
	@Override
	public String color() {
		return "Red";
		
	}
	
	@Override
	public String toString() {
		return "Motorbike [type()=" + type() + ", wheels()=" + wheels() + ", seats()=" + seats() +",color()=" + color() + "]";
	}
	}

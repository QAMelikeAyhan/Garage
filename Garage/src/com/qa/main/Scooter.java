package com.qa.main;

public class Scooter extends Vehicle{
	
	@Override
	public String type() {
		return "Scooter";
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
		return "White";
	}
	
	@Override
	public String toString() {
		return "Scooter [type()=" + type() + ", wheels()=" + wheels() + ",seats()=" + seats() +",color()=" + color() + "]";
	}
	
}

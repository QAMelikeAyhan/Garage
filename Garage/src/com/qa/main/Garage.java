package com.qa.main;

import java.util.List;
import java.util.ArrayList;

public class Garage {

	public List<Vehicle> vehicleList = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
		}
	
	public void removeByType(String type) {
		
		vehicleList.removeIf( i -> (i.type().equals(type)));
		System.out.println(vehicleList);
	}
	
public void fixByType(String type) {
		
		for ( Vehicle i : vehicleList ) {
			
			int bill = 0;
			
			if(i.type().contentEquals(type)) {
				bill = i.seats() * i.wheels();
				System.out.println(i + " Bill: £" + bill);
			} 
			
		}
		
	}
	
	public void emptyGarage() {
		
		vehicleList.clear();
		
		System.out.println("Garage is empty! " + vehicleList);
		
	}
	
	public void calculateBill() {
		for ( Vehicle i : vehicleList) {
			int bill = 0;
			
			if ( i.getClass().getSimpleName().equals("Car")) {
				bill = 1 * i.seats() *i.wheels();
			} else if ( i.getClass().getSimpleName().equals("Motorbike")) {
				bill = 2 * i.seats() * i.wheels();
			} else if (i.getClass().getSimpleName().equals("Scooter"))	{
				bill = 3 * i.seats() *i.wheels();
				
				
			}
			System.out.println(i + " Bill: £" + bill);
	
			
		}
	}
}
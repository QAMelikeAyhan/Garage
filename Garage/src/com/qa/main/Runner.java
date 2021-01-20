package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Vehicle car1 = new Car();
		Vehicle motorbike1 = new Motorbike();
		Vehicle scooter1 = new Scooter();
		
				
		Garage garageManager = new Garage();
		garageManager.addVehicle(car1);
		garageManager.addVehicle(motorbike1);
		garageManager.addVehicle(scooter1);
		
		
		garageManager.calculateBill();
		
		garageManager.removeByType("bus");
		
		garageManager.fixByType("car");
		
		garageManager.emptyGarage();
		
		
		
		
		
		
	}

}

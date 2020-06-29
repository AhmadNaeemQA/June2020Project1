package GarageEx;

import java.util.ArrayList;

public class Runner {
	
	public static void main (String [] args) {
		Car c1 = new Car();
		c1.setTopSpeed(250);
		c1.setType("Super Car");
		c1.setMake("Lambo");
		c1.setModel("Aventador");
		
		Motorcycle m1 = new Motorcycle();
		m1.setTopSpeed(300);
		m1.setMake("Yamaha");
		m1.setModel("R1");
		
		Lorry l1 = new Lorry();
		l1.setMake("Merc");
		l1.setModel("Transit");
		l1.setMaxLoad(1200);
		
		ArrayList<Vehicle> Garage = new ArrayList<Vehicle>();
		
		Garage.add(c1);
		Garage.add(m1);
		Garage.add(l1);
		
		bill(Garage);
		
		
	}
	
	public static void bill(ArrayList<Vehicle> Garage) {
		double costs[] = new double[Garage.size()];
		for (int i = 0; i< Garage.size(); i++) {
			double total = 0;
			if (Garage.get(i).getNumOfWheels()==2) {
				total = total + 100;
			}
			else if (Garage.get(i).getNumOfWheels()==4) {
				total = total + 1000;
			}
			else {
				total = total + 3000;
			}
			
			if (Garage.get(i).getTopSpeed()>100) {
				total = total * 3;
			}
			else {
				total = total * 1.5;
			}
			
			costs[i] = total;
			
		}
		
		for (int i = 0; i < costs.length; i++) {
			System.out.println(Garage.get(i).getMake());
			System.out.println(costs[i]);
		}
	}

	
}



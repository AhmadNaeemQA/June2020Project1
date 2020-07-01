package GarageEx;

import java.util.ArrayList;

public class Garage {
	
	protected static ArrayList<Vehicle> Garage = new ArrayList<Vehicle>();
	
	public static void add(Vehicle vehicle){
		Garage.add(vehicle);
	}
	
	public static Vehicle getVehicle(int i) {
		return Garage.get(i);
	}
	
	public static int size() {
		return Garage.size();
	}
	
	public static void calculateBill() {
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
	
	public static void removeByMake(String make) {
		for (int i =0; i<Garage.size();i++) {
			if (Garage.get(i).getMake().equalsIgnoreCase(make)) {
				Garage.remove(i);
			}
		}
	}
	public static void getAll() {
		for (int i =0; i<Garage.size();i++) {
			System.out.println(Garage.get(i).getMake() +" , "+ Garage.get(i).getModel());
		}
	}
	
	public static void empty() {
			Garage.clear();
	}
	
	
}

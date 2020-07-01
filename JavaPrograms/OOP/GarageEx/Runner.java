package GarageEx;


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
	
		
		Garage.calculateBill();
		
		Garage.removeByMake("Lambo");
		Garage.getAll();
		
		Garage.empty();


		
		
		
		
	}


	
}



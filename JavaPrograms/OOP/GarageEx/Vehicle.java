package GarageEx;

public abstract class Vehicle {
	protected String make;
	protected String model;
	protected int topSpeed;
	protected int numOfWheels;
	
	public Vehicle(String make, String model, int topSpeed, int numOfWheels) {
		super();
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.numOfWheels = numOfWheels;
	}
	
	public Vehicle() {
		
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

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
	

	
}

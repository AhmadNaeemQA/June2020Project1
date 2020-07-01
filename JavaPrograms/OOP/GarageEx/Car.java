package GarageEx;

public class Car extends Vehicle {
	
	final int numOfWheels = 4;
	private String type;
	
	public Car() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getSound() {
		if ((type.equalsIgnoreCase("Super car")) | (type.equalsIgnoreCase("Sports Car"))){
			return ("BRUMMMMM");
		}
		else if (type.equalsIgnoreCase("hatchback")) {
			return ("brum brum");
		}
		else {
			return ("Enter valid car type first");
		}
	}
	
	

}

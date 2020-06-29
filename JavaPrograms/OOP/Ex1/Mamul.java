package Ex1;

public class Mamul extends Land {
	private String furType;
	private String climate;
	final int numLegs = 4;
	
	
	public Mamul() {
		
	}

	public String getFurType() {
		return furType;
	}

	public void setFurType(String furType) {
		this.furType = furType;
	}
	
	public String getClimate() {
		if (furType.equalsIgnoreCase("thick")) {
			this.climate = ("Cold Climate");
			return (climate);
		}
		else if (furType.equalsIgnoreCase("thin")) {
			this.climate = ("Hot Climate");
			return (climate);
		}
		else {
			return ("Set fur type first");
		}
	}
	

	public String getSound() {
		if (foodchain.equalsIgnoreCase("preditor")) {
			return ("ROOAAAR");
		}
		else if (foodchain.equalsIgnoreCase("prey")) {
			return ("Leave me alone pls, Im sorry");
		}
		else {
			return ("Set food chain to get sound");
		}
	}

}

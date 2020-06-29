package Ex1;

public class Bird extends Animal {
	
	final int numLegs = 2;
	private double wingSpam;
	
	public Bird() {
		
	}
	
	@Override
	public String sound() {
		if (foodchain.equals("preditor")) {
			return ("CEW CEW");
		}
		else if (foodchain.equals("prey")) {
			return ("Quack Quack");
		}
		else {
			return ("Set food chain to get sound");
		}
	}
	
	public double getWingSpam() {
		return wingSpam;
	}

	public void setWingSpam(double wingSpam) {
		this.wingSpam = wingSpam;
	}

	public String getFoodchain() {
		return foodchain;
	}

	public void setFoodchain(String foodchain) {
		this.foodchain = foodchain;
	}
	
	public int getnumLegs() {
		return numLegs;
	}
	
	
	
	

}

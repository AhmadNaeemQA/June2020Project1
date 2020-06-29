package Ex1;

public class Fish extends Animal {
	
	private int timeUnderWater;
	private int numOfFins;
	final int numLegs = 0;

	public Fish() {
		
	}

	public int getTimeUnderWater() {
		return timeUnderWater;
	}

	public void setTimeUnderWater(int timeUnderWater) {
		this.timeUnderWater = timeUnderWater;
	}

	public int getNumOfFins() {
		return numOfFins;
	}

	public void setNumOfFins(int numOfFins) {
		this.numOfFins = numOfFins;
	}
	
	@Override
	public String sound() {
		return ("Fish dont make sounds FOOL");
		}
	}
	
	

package solid_goldilocks;

public class seat implements seat_behaviour {
	private int maxChairWeight;
	private int foodTemp;

	public seat(int maxChairWeight, int foodTemp) {
		this.maxChairWeight = maxChairWeight;
		this.foodTemp = foodTemp;
		table.add(this);

	}

	public seat() {

	}

	public int getMaxChairWeight() {
		return maxChairWeight;
	}

	public void setMaxChairWeight(int maxChairWeight) {
		this.maxChairWeight = maxChairWeight;
	}

	public int getFoodTemp() {
		return foodTemp;
	}

	public void setFoodTemp(int foodTemp) {
		this.foodTemp = foodTemp;
	}

	public void toString() {
		System.out.println(this.getMaxChairWeight());
		System.out.println(this.getFoodTemp());
	}

	public boolean chairBreak(int weight) {
		if (maxChairWeight < weight) {
			return false;
		}
		return true;

	}

	public boolean foodEaten(int temp) {
		if (foodTemp > temp) {
			return true;
		}
		return false;

	}

}

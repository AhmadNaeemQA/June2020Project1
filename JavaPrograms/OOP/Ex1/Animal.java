package Ex1;

// Class name is animal and has 3 private attributes
public class Animal {
	private String name = ("defult");
	private String colour = ("defult");
	private int numLegs;
	protected String foodchain = ("defult");
	
	// contrustor used to create new objects of type animal
	public Animal (String name, String type, String colour){
		this.name = name;
		this.colour = colour;
	}
	
	// overload contructor used when a new instance of type animal is crated but without any parameteres
	public Animal() {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getnumLegs() {
		return this.numLegs;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public void setName(String name) {
		this.name = name;
		return;
	}
	
	public void setnumLegs(int numLegs) {
		this.numLegs = numLegs;
		return;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
		return;
	}
	
	
	public int getNumLegs() {
		return numLegs;
	}

	public String getFoodchain() {
		return foodchain;
	}

	public void setFoodchain(String foodchain) {
		this.foodchain = foodchain;
	}

	public String sound() {
		return ("Sound");
	}
}

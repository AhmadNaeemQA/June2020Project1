package Ex1;

// Class name is animal and has 3 private attributes
public class Animal {
	private String name = ("defult");
	private String type = ("defult");
	private String colour = ("defult");
	
	// contrustor used to create new objects of type animal
	public Animal (String name, String type, String colour){
		this.name = name;
		this.type = type;
		this.colour = colour;
	}
	
	// overload contructor used when a new instance of type animal is crated but without any parameteres
	public Animal() {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public void setName(String name) {
		this.name = name;
		return;
	}
	
	public void setType(String type) {
		this.type = type;
		return;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
		return;
	}
}

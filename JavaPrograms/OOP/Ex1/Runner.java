package Ex1;

public class Runner {
	
	public static void main (String [] args) {
		Animal a1 = new Animal("Josh", "dog", "black");
		System.out.println(a1.getName());
		System.out.println(a1.getType());
		System.out.println(a1.getColour());
		
		Animal a2 = new Animal();
		a2.setName("Mike");
		a2.setType("cat");
		a2.setColour("white");
		System.out.println(a2.getName());
		System.out.println(a2.getType());
		System.out.println(a2.getColour());
	}
}

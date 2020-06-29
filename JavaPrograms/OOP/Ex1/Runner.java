package Ex1;

public class Runner {
	
	public static void main (String [] args) {
		Bird penguin = new Bird();
		penguin.setWingSpam(40.5);
		penguin.setName("Penguin one");
		penguin.setFoodchain("prey");
		System.out.println(penguin.getName() +" has "+ penguin.getnumLegs() +" legs and goes "+ penguin.sound());
		
		Fish cod = new Fish();
		cod.setNumOfFins(4);
		cod.setTimeUnderWater(600);
		cod.setFoodchain("prey");
		cod.setName("Cod one");
		System.out.println(cod.getName() +" has "+ cod.getnumLegs() +" legs and go "+ cod.sound());
		System.out.println("They can stay under water for "+ cod.getTimeUnderWater() +" seconds");
		
		Mamul lion = new Mamul();
		lion.setName("Lion one");
		lion.setFoodchain("Preditor");
		lion.setTopSpeed(40);
		lion.setFurType("Thin");
		System.out.println(lion.getName() +" has "+ lion.getnumLegs() +" legs and go "+ lion.sound());
		System.out.println("Their fur type is "+ lion.getFurType() +" and so they can be found in " +lion.getClimate());
	}
}

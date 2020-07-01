package LibraryEx;

public class Runner {
	public static void main(String [] args) {
		Books b1 = new Books();
		b1.setId(1);
		b1.setName("Harry Potter");
		b1.setAuthor("JK Rowling");
		b1.setGenre("Adventure");
		b1.setPrice(12);
		
		Books b2 = new Books();
		b2.setId(2);
		b2.setName("Harry potter 2");
		b2.setAuthor("JK Rowling");
		b2.setGenre("Sci-fi");
		b2.setPrice(10);
		
		Books b3 = new Books();
		b3.setId(3);
		b3.setName("Harry Potter 3");
		b3.setAuthor("JK Rowling");
		b3.setGenre("Adventure and Sci-fi");
		b3.setPrice(15);
		
		System.out.println(b3.getName());
		b3.update(b3, "name", "New Harry Potter");
		System.out.println(b3.getName());
	}
}

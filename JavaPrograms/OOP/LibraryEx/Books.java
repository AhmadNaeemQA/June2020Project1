package LibraryEx;

import java.util.ArrayList;

public class Books extends Items {
	
	protected String author;
	protected String genre;
	ArrayList<Items> bookLibrary = new ArrayList<Items>();
	ArrayList<Items> bookAway = new ArrayList<Items>();
	
	public Books() {
		bookLibrary.add(this);
	}
	
	

	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	@Override
	public void checkIn(int Id) {
		int i = getIndexFromID(Id);
		bookLibrary.add(bookAway.get(i));
		bookAway.remove(i);
		return;
	}

	@Override
	public void checkOut(int Id) {
		int i = getIndexFromID(Id);
		bookAway.add(bookLibrary.get(i));
		bookLibrary.remove(i);
		
	}

	@Override
	public void add(Items item) {
		bookLibrary.add(item);
	}

	@Override
	public void remove(int Id) {
		int i = getIndexFromID(Id);
		if (bookLibrary.get(i).getId() == Id) {
			bookLibrary.remove(i);
		}
		else if (bookAway.get(i).getId() == Id) {
			bookAway.remove(i);
		}	
	}


	public void update(Books book, String field, String newValue) {
		if (field.equalsIgnoreCase("price")) {
			book.setPrice(Integer.parseInt(newValue));
		}
		else if (field.equalsIgnoreCase("name")) {
			book.setName(newValue);
		}
		else if (field.equalsIgnoreCase("author")) {
			book.setAuthor(newValue);
		}
		else if (field.equalsIgnoreCase("genre")) {
			book.setGenre(newValue);
		}
		else {
			System.out.println("Please choose valid values");
		}
		
	}
	
	public int getIndexFromID(int id) {
		for (int i = 0; i<bookAway.size(); i++) {
			if (bookAway.get(i).getId() == Id) {
				return i;
			}
		}
		for (int i = 0; i<bookLibrary.size(); i++) {
			if (bookLibrary.get(i).getId() == Id) {
				return i;
			}
		}
		return -1;

	}
}

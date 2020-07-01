package LibraryEx;

import java.util.ArrayList;

public class Journals extends Items {
	
	protected String author;
	protected String type; //autobiography or biography
	ArrayList<Items> journalLibrary = new ArrayList<Items>();
	ArrayList<Items> journalAway = new ArrayList<Items>();
	
	public Journals() {
		journalLibrary.add(this);
	}
	
	
	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	public int getIndexFromID(int id) {
		for (int i = 0; i<journalAway.size(); i++) {
			if (journalAway.get(i).getId() == Id) {
				return i;
			}
		}
		for (int i = 0; i<journalLibrary.size(); i++) {
			if (journalLibrary.get(i).getId() == Id) {
				return i;
			}
		}
		return -1;

	}

	@Override
	public void checkIn(int Id) {
		int i = getIndexFromID(Id);
		journalLibrary.add(journalAway.get(i));
		journalAway.remove(i);
		return;
		
	}
	@Override
	public void checkOut(int Id) {
		int i = getIndexFromID(Id);
		journalAway.add(journalLibrary.get(i));
		journalLibrary.remove(i);
		
	}
	@Override
	public void add(Items item) {
		journalLibrary.add(item);
		
	}
	@Override
	public void remove(int Id) {
		int i = getIndexFromID(Id);
		if (journalLibrary.get(i).getId() == Id) {
			journalLibrary.remove(i);
		}
		else if (journalAway.get(i).getId() == Id) {
			journalAway.remove(i);
		}	
		
	}
	
	public void update(Journals book, String field, String newValue) {
		if (field.equalsIgnoreCase("price")) {
			book.setPrice(Integer.parseInt(newValue));
		}
		else if (field.equalsIgnoreCase("name")) {
			book.setName(newValue);
		}
		else if (field.equalsIgnoreCase("author")) {
			book.setAuthor(newValue);
		}
		else if (field.equalsIgnoreCase("type")) {
			book.setType(newValue);
		}
		else {
			System.out.println("Please choose valid values");
		}
		
	}


}

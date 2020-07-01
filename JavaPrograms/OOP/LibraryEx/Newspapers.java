package LibraryEx;

import java.util.ArrayList;

public class Newspapers extends Items {
	
	protected String date;
	ArrayList<Items> newsPaperLibrary = new ArrayList<Items>();
	ArrayList<Items> newsPaperAway = new ArrayList<Items>();

	
	public Newspapers() {
		newsPaperLibrary.add(this);
	}
	

	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}
	
	public int getIndexFromID(int id) {
		for (int i = 0; i<newsPaperAway.size(); i++) {
			if (newsPaperAway.get(i).getId() == Id) {
				return i;
			}
		}
		for (int i = 0; i<newsPaperLibrary.size(); i++) {
			if (newsPaperLibrary.get(i).getId() == Id) {
				return i;
			}
		}
		return -1;

	}


	@Override
	public void checkIn(int Id) {
		int i = getIndexFromID(Id);
		newsPaperLibrary.add(newsPaperAway.get(i));
		newsPaperAway.remove(i);
		return;
	}


	@Override
	public void checkOut(int Id) {
		int i = getIndexFromID(Id);
		newsPaperAway.add(newsPaperLibrary.get(i));
		newsPaperLibrary.remove(i);
		
	}


	@Override
	public void add(Items item) {
		newsPaperLibrary.add(item);
		
	}


	@Override
	public void remove(int Id) {
		int i = getIndexFromID(Id);
		if (newsPaperLibrary.get(i).getId() == Id) {
			newsPaperLibrary.remove(i);
		}
		else if (newsPaperAway.get(i).getId() == Id) {
			newsPaperAway.remove(i);
		}	
		
	}
	
	public void update(Newspapers book, String field, String newValue) {
		if (field.equalsIgnoreCase("price")) {
			book.setPrice(Integer.parseInt(newValue));
		}
		else if (field.equalsIgnoreCase("name")) {
			book.setName(newValue);
		}
		else if (field.equalsIgnoreCase("date")) {
			book.setDate(newValue);
		}
		else {
			System.out.println("Please choose valid values");
		}
		
	}

}

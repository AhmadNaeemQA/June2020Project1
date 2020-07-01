package LibraryEx;

public abstract class Items {
	
	protected int Id;
	protected String name;
	protected int price;

	public abstract void checkIn(int Id);
	public abstract void checkOut(int Id);
	public abstract void add(Items item);
	public abstract void remove(int Id);
	
	public Items(String name, int price, int Id) {
		super();
		this.Id = Id;
		this.name = name;
		this.price = price;
		
	}
	public Items() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}

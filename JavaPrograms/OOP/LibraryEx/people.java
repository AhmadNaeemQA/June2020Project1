package LibraryEx;

import java.util.ArrayList;

public class people implements Interface1 {
	protected String id;
	protected String name;
	protected String email;
	protected ArrayList<people> users = new ArrayList<people>();
	
	@Override
	public void registerPerson(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
		users.add(this);
		
	}
	@Override
	public void deletePerson(String id) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == id) {
				users.remove(i);
			}
		}
		
		
	}
	@Override
	public void updatePerson(String id, String oldValue, String newValue) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == oldValue){
				users.get(i).setId(newValue);
			}
			if (users.get(i).getName() == oldValue) {
				users.get(i).setName(newValue);
			}
			if (users.get(i).getEmail() == oldValue) {
				users.get(i).setEmail(newValue);
			}
		}
		
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}

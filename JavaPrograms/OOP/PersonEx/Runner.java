package PersonEx;

public class Runner {
	
	public static void main (String [] args) {
		Person user1 = new Person("Ahmad", "21", "Manager");
		Person user2 = new Person("Ali", "22", "Receptionist");
		System.out.println(user1.getString());
		System.out.println(user2.getString());
		
		String[][] users = {{user1.getName(), user1.getAge(), user1.getJobTitle()}, {user2.getName(), user2.getAge(), user2.getJobTitle()}};
		System.out.println(users[0][0]);
	}
}

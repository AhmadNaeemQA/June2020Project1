package PersonEx;

public class Person {
	
	private String name;
	private String age;
	private String jobTitle;
	
	public Person(String name, String age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getString() {
		return ("Name: " + name + " Age: "+ age + " Job Title: "+ jobTitle);
	}
	
	
}

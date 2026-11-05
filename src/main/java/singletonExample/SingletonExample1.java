package singletonExample;

public class SingletonExample1 {
	
	private static SingletonExample1 obj;
	
	private String name;
	private String city;
	private String company;
	
	// private so that no one can create the object of this class
	private SingletonExample1() {
		
	}
	
	//public so that anyone can access the singleton object
	public static SingletonExample1 getInstance() {
		if(obj == null) {
			obj = new SingletonExample1();
		}
		return obj;
	}
	
	//Getter method
	public String getName() {
		return this.name;
	}
	public String getCity() {
		return this.city;
	}
	public String getCompany() {
		return this.company;
	}
	
	//Setter method
	public void setName(String name) {
		 this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}

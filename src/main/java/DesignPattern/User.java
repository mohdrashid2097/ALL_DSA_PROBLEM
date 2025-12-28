package DesignPattern;

public class User {
	
	//Required field
	private String name;
	private int age;
	
	// Optional field
	private String country;
	private String profession;
	private boolean active;
	
	User(UserBuilder builder){
		this.name = builder.name;
		this.age = builder.age;
		this.country = builder.country;
		this.profession = builder.profession;
		this.active = builder.active;
		
	}
	
	public String toString() {
		return "User [ name: "+name+" Age: "+age+" Country: "+country+" Profession: "+profession+" active: "+active+" ]";
	}
	
	public static class UserBuilder{
		private String name;
		private int age;
		private String country;
		private String profession;
		private boolean active;
		
		public UserBuilder(String name, int age){
			this.name = name;
			this.age = age;
		}
		
		public UserBuilder country(String country) {
			this.country = country;
			return this;
		}
		public UserBuilder profession(String profession) {
			this.profession = profession;
			return this;
		}
		public UserBuilder active(boolean active) {
			this.active = active;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
		
	}
	

	
}

package immutableThing;

public  class ImmutableStudent {
	public static void main(String[] args) {
		
		Student s = new Student(12,"Rashid","Kichha");
		System.out.println(s.getName());
		System.out.println(s.getRollNumber());
		System.out.println(s.getAddress());
		
		Student s1 = new Student(12,"Hemant","Kichha");
		System.out.println(s1.getName());
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getAddress());
	}
}

final class Student{
	private final int rollNum;
	private final String name;
	private final String add;
	
	Student(int roolNum, String name,String add){
		this.rollNum = roolNum;
		this.name = name;
		this.add = add;
	}
	
	public int getRollNumber() {
		return rollNum;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return add;
	}
	//Note there is no setter method so we cannot change the value of its instance variable;
	
}

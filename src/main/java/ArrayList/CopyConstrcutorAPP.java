package ArrayList;

public class CopyConstrcutorAPP {
	
	private String name;
	private int age;
	
	public CopyConstrcutorAPP(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public CopyConstrcutorAPP(CopyConstrcutorAPP copy) {
		this.name = copy.name;
		this.age = copy.age;
	}
	
	public void display() {
		System.out.println("Name:" + name +" "+ "Age: "+age);
	}
	

}



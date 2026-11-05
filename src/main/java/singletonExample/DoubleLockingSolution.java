package singletonExample;

public class DoubleLockingSolution {
	
	private static volatile DoubleLockingSolution obj;
	private String name;
	
	private DoubleLockingSolution() {
		
	}
	
	//Get instance
	public static DoubleLockingSolution getInstance() {
		if(obj == null) {
			synchronized(DoubleLockingSolution.class) {
				obj = new DoubleLockingSolution();
			}
		}
		return obj;
	}
	
	//Getter method
	public String getName() {
		return name;
	}
	
	//Setter method
	public void setName(String name) {
		this.name = name;
	}

}

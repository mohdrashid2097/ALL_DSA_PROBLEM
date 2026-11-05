package singletonExample;

public class EagerInitialization {
	
	private static EagerInitialization obj = new EagerInitialization();
	
	private String name;
	
	private EagerInitialization() {
		
	}
	
	// GetInstance object
	public static EagerInitialization getInstance() {
		return obj;
	}
	
	// Getter
	public String getName() {
		return name;
	}
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}

}

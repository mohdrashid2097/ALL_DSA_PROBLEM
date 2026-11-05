package singletonExample;

public class LazyInitialization {
	
	private static LazyInitialization obj;
	
	private String name;
	
	private LazyInitialization() {
		
	}
	
	// GetInstance object
	public static LazyInitialization getInstance() {
		
		if(obj == null) {
			obj = new LazyInitialization();
		}
		
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



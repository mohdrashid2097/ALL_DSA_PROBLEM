package singletonExample;

public class SynchronizedLazyInitialization {
	
private static SynchronizedLazyInitialization obj;
	
	private String name;
	
	private SynchronizedLazyInitialization() {
		
	}
	
	// GetInstance object
	public synchronized static SynchronizedLazyInitialization getInstance() {
		
		if(obj == null) {
			obj = new SynchronizedLazyInitialization();
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

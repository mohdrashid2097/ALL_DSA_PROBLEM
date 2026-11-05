package singletonExample;

public class DemoMethod {
	
	public static void main(String[] args) {
		
//		HealthMonitoring obj = HealthMonitoring.getInstance();
//		obj.setHeartRate(70);
//		System.out.println("Get HeartBeat: "+obj.getHeartRate());
//		obj.setHeartRate(80);
//		System.out.println("Get Next HeartBeat: "+obj.getHeartRate());
		
//		SingletonExample1 obj1 = SingletonExample1.getInstance();
//		obj1.setName("Mohan");
//		obj1.setCity("Noida");
//		obj1.setCompany("Accenture");
//		System.out.println("Name: "+obj1.getName());
//		System.out.println("City: "+obj1.getCity());
//		System.out.println("Company: "+obj1.getCompany());
//		obj1.setCompany("TCS");
//		System.out.println("Company: "+obj1.getCompany());
		
		//EargerInitialization
//		EagerInitialization obj2 = EagerInitialization.getInstance();
//		obj2.setName("Hello");
//		System.out.println("Eager Initialization: "+ obj2.getName());
		
		//Lazy initialization
//		LazyInitialization obj3 = LazyInitialization.getInstance();
//		obj3.setName("Rakesh");
//		System.out.println("Lazy Initialization: "+obj3.getName());
		
		// synchronized block
//		SynchronizedLazyInitialization obj4 = SynchronizedLazyInitialization.getInstance();
//		obj4.setName("Mohan");
//		System.out.println("Synchronized block: "+obj4.getName());
		
//		// Double check lock solution
//		DoubleLockingSolution obj5 = DoubleLockingSolution.getInstance();
//		obj5.setName("Hi");
//		System.out.println("DoubleLockingSolution Name: "+obj5.getName());
		
		// bill pugh solution
		BillPughSolutionBest obj6 = BillPughSolutionBest.getInstance();
		obj6.setName("Rakesh");
		System.out.println("BillPughSolutionBest Name: "+obj6.getName());
	}

}

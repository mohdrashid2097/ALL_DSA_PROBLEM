package singletonExample;

public class BillPughSolutionBest {
	
	private String name;
	
	private BillPughSolutionBest() {
		
	}
	
	public static BillPughSolutionBest getInstance() {
		return BillPughBestObject.obj;
	}
	
	//Setter method
	public void setName(String name) {
		this.name = name;
	}
	//Getter method
	public String getName() {
		return name;
	}
	
	
	private static class BillPughBestObject{
		private static BillPughSolutionBest obj = new BillPughSolutionBest();
	}

}

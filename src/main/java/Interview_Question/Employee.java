package Interview_Question;

public class Employee {
	
	String name;
	Double salary;
	String compName;
	
	public Employee(String name, Double salary, String compName) {
		super();
		this.name = name;
		this.salary = salary;
		this.compName = compName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}
	
	
	
	

}

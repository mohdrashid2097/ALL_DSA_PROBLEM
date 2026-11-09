package Iterator_MultiThreading_Java;

import java.util.Objects;

public class Employee {
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		//type cast object
		
		Employee emp = (Employee) obj;
		return this.id == emp.id;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return id == other.id && Objects.equals(name, other.name);
//	}
	
	

}

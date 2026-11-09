package Iterator_MultiThreading_Java;

import java.util.Objects;

public class EmployeeOverrideHashCode {
	
	int id;
	String name;
	
	public EmployeeOverrideHashCode(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	

}

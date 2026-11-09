package Iterator_MultiThreading_Java;

import java.util.Objects;

public class FixedEmployeeNow {
	
	int id;
	String name;
	
	public FixedEmployeeNow(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			return false;
		}
		
		FixedEmployeeNow emp = (FixedEmployeeNow)obj;
		return this.id == emp.id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

}

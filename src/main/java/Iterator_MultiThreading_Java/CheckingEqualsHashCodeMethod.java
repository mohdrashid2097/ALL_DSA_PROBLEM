package Iterator_MultiThreading_Java;

import java.util.HashSet;

public class CheckingEqualsHashCodeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// InCorrect implementation: Override equals() methods
		System.out.println("InCorrect implementation: Override equals() methods");
		Employee emp1 = new Employee(1, "A");
		Employee emp2 = new Employee(1, "B");
		
		System.out.println(emp1.equals(emp2)); // both are equals
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		HashSet<Employee> set = new HashSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		System.out.println(set.size());
		
		// Problem
		// Both objects are stored even though e1.equals(e2) returns true.
		
		//The problem is that the default Object.hashCode() is not based on employee ID. 
		// It is not required to return the same hash code for two different objects.
		
		// Correct implementation: Override both methods
//		System.out.println("Correct implementation: Override both methods");
//		
//		FixedEmployeeNow e1 = new FixedEmployeeNow(1, "A");
//		FixedEmployeeNow e2 = new FixedEmployeeNow(1, "B");
//		
//		System.out.println(e1.equals(e2)); // both are equals
//		System.out.println(e1.hashCode());
//		System.out.println(e2.hashCode());
//		System.out.println(e1.hashCode()==e2.hashCode());  // hashCode is equal for both object
//		
//		HashSet<FixedEmployeeNow> set1 = new HashSet<FixedEmployeeNow>();
//		set1.add(e1);
//		set1.add(e2);
//		System.out.println(set1.size());
		
		System.out.println("Override .hashCode() Method but not .equals() method");
		EmployeeOverrideHashCode e1 = new EmployeeOverrideHashCode(1,"A");
		EmployeeOverrideHashCode e2 = new EmployeeOverrideHashCode(1,"A");
		System.out.println(e1.equals(e2));
		System.out.println("e1 hashCode: "+e1.hashCode());
		System.out.println("e2 hashCode: "+e2.hashCode());
		
		HashSet<EmployeeOverrideHashCode> hs = new HashSet<EmployeeOverrideHashCode>();
		hs.add(e1);
		hs.add(e2);
		System.out.println("Size of HashSet: "+hs.size());
		
	}

}

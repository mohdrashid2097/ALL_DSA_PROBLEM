package Interview_Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmplyeesStream {

	public static void main(String[] args) {
		
		List<Employee> emp = Arrays.asList(
				new Employee("Rashid",1200.00,"acc","IT"),
				new Employee("Danish",1500.00,"tcs","IT"),
				new Employee("Mohit",1600.00,"acc","IT"),
				new Employee("Rohit",1800.00,"infosys","Software"),
				new Employee("kumar",2000.00,"tata","Software"),
				new Employee("Gagan",2200.00,"google","Electrical"),
				new Employee("Gagan",3200.00,"google","Electrical")
				);
		
		//1. Get Employees Whose Salary is Greater Than 15000 and Name Starts With ‘R’
		List<Employee> res1 = emp.stream().filter(e-> e.salary > 1200 && e.name.toLowerCase().startsWith("r"))
				.collect(Collectors.toList());
		//res1.forEach(e-> System.out.println("Employee Infos: "+e.name+" : "+e.salary+" : "+e.compName));
		//System.out.println("Question1: "+res1.get(0).name+" : "+res1.get(0).salary);
		
		//2. Give a 40% Salary Hike to Each Employee and Print
		List<Employee> res2 = emp.stream().map( e-> new Employee(e.name,e.salary*1.4,e.compName,e.depart)).collect(Collectors.toList());
		//res2.forEach(e -> System.out.println("Employee Infos: "+e.name+" : "+e.salary+" : "+e.compName));
		
		//3. Find the Employee with the Maximum Salary
		Double maxSalariedEmployee = emp.stream().max(Comparator.comparingDouble(Employee::getSalary)).get().getSalary();
		//System.out.println("maxSalariedEmployee: "+maxSalariedEmployee);
		
		//4. Find the Employee with the miniimum Salary
		Double miniSalariedEmployee = emp.stream().min(Comparator.comparingDouble(Employee::getSalary)).get().getSalary();
		//System.out.println("miniSalariedEmployee: "+miniSalariedEmployee);
		
		//5 sum the salary of employee if there are more than one row for the same employee
		Map<String,Double> res3 = emp.stream().collect(Collectors.groupingBy(e->e.name,Collectors.summingDouble(e->e.getSalary())));
		//System.out.println("Salary sum of an Employee: "+res3);
		
		//6 you have a list of employees. How would you group them by department and then count the number of employees in eacxh department.
		Map<String,Long> totalEmpEachDepart = emp.stream().collect(Collectors.groupingBy(e->e.depart,Collectors.counting()));
		System.out.println("TotalEmpInEachDepart: "+totalEmpEachDepart);
		
		//6 you have a list of employees in each department
		Map<String,List<String>> empInEachDepart = emp.stream().collect(Collectors.groupingBy(e->e.depart, Collectors.mapping(Employee::getName, Collectors.toList())));
		empInEachDepart.forEach((depart,empList) ->{
			System.out.println(depart+" : "+empList);
		});
		
		
		
		
		
		
	}

}

package Interview_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> people = Arrays.asList(
				 	new Person("Rashid", 25),
	                new Person("Amit", 18),
	                new Person("Rahul", 30),
	                new Person("John", 35),
	                new Person("David", 22),
	                new Person("Ali", 19),
	                new Person("Mohan", 38)
				);
		
		List<Person> filterPersonByAge = people.stream().filter(p->p.getAge()>30 && p.getAge()<40).collect(Collectors.toList());
		filterPersonByAge.forEach(System.out::println);

	}

}

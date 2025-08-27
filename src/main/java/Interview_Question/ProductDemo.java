package Interview_Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Products> products = Arrays.asList(
		            new Products("Apple", 2.0, 10),
		            new Products("Apple", 2.0, 15),
		            new Products("Banana", 1.5, 20),
		            new Products("Banana", 1.5, 10),
		            new Products("Mango", 3.0, 5)
		        );
		 
		 // Find the product with the total sales amount. 
		 Map<String, Double> res = products.stream().collect(Collectors.groupingBy(
				 p->p.getName(), Collectors.summingDouble(p->p.getPrice()*p.getQuantity())));
		 res.forEach((product,total_amount) -> System.out.println(product +" "+total_amount));
		 
		 //2nd add one method to that class like getTotal amount in products class
		 Map<String,Double> res1 = products.stream().collect(Collectors.groupingBy(p->p.getName(), Collectors.summingDouble(p->p.getTotalAmount())));
		 res1.forEach((product,total_amount) -> System.out.println(product +" "+total_amount));
		 
		 System.out.println();
		 
		// Find the product with the total highest sales amount. 
		 Map<String, Double> res3 = products.stream().collect(Collectors.groupingBy(
				 p->p.getName(), Collectors.summingDouble(p->p.getPrice()*p.getQuantity())))
				 .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				 .limit(2).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		 res3.forEach((product,total_amount) -> System.out.println(product +" "+total_amount));
		 
		 
	}

}

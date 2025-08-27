package Interview_Question;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class FruitCount {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 20, new BigDecimal("19.99")),
            new Item("orange", 10, new BigDecimal("29.99")),
            new Item("watermelon", 10, new BigDecimal("29.99")),
            new Item("papaya", 20, new BigDecimal("9.99")),
            new Item("apple", 10, new BigDecimal("9.99")),
            new Item("banana", 10, new BigDecimal("19.99")),
            new Item("apple", 20, new BigDecimal("9.99"))
        );

        // Using Streams to compute total quantity per fruit
        Map<String, Integer> fruitCount = items.stream()
            .collect(Collectors.groupingBy(
               item->item.itemName,
                Collectors.summingInt(item -> item.itemQuantity)
            ));

        // Printing the output
       // fruitCount.forEach((fruit, count) -> System.out.println(fruit + " -> " + count));
        
        //1. Count total quantity of each fruit:
        Map<String,Integer> res1 = items.stream()
        		.collect(Collectors.groupingBy(item->item.itemName,Collectors.summingInt(item->item.itemQuantity)));
        //System.out.println("Res1: "+res1);
        
        //2. Filter items with quantity > 10:
        List<Item> res2 = items.stream().filter(item -> item.itemQuantity > 10).collect(Collectors.toList());
        //res2.forEach(item-> System.out.println(item));
        
        //3. Get distinct fruit names:
        Set<String> res3 = items.stream().map(item->item.itemName).collect(Collectors.toSet());
        System.out.println("Res3: "+res3);
        
        List<String> res4 = items.stream().map(item->item.itemName).distinct().collect(Collectors.toList());
        System.out.println("Res4: "+res3);
        
        //4. Sort items by quantity:
        List<Item> sortedByQuantity = items.stream().sorted(Comparator.comparing(Item::getItemQuantity)).collect(Collectors.toList());
        
        
        //5. Total quantity of all fruits combined:
        int totalQuantity = items.stream().mapToInt(item->item.getItemQuantity()).sum();
        //System.out.println("totalQuantity: "+totalQuantity);
        
        //7. Find fruit with highest total quantity:
        String topFruit = items.stream()
        		.collect(Collectors.groupingBy(item->item.getItemName(), Collectors.summingInt(item->item.getItemQuantity())))
        		.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("null");
        //System.out.println("topFruit: "+topFruit);
        
        //8. Filter fruits with price < 20:
        List<Item> cheapFruits = items.stream().filter(item-> item.getItemPrice().compareTo(new BigDecimal("20")) < 0)
        		.collect(Collectors.toList());
        //System.out.println("cheapFruits:  "+cheapFruits );
        
        //9. Average price of all fruits:
        double avgPrice = items.stream().map(item->item.getItemPrice()).mapToDouble(BigDecimal::doubleValue )
        		.average().orElse(0.0);
        //System.out.println("avgPrice: "+avgPrice);
        
        //10. Count of unique fruit types:
        long uniqueFruits  = items.stream().map(item->item.getItemName()).distinct().count();
        //System.out.println("Count uniqueFruits: "+uniqueFruits );
        
        //1 -> way
        //11. Sort fruit names alphabetically with total quantity:
        Map<String,Integer> sortedFruits = items.stream().collect(Collectors.groupingBy(item->item.getItemName(),TreeMap::new,Collectors.summingInt(item->item.itemQuantity)));
       // System.out.println("sortedFruits: "+sortedFruits);
    
      //2 -> way
       Map<String,Integer>  sortedFruits2 = items.stream().collect(Collectors.groupingBy(item->item.getItemName(),Collectors.summingInt(item->item.itemQuantity)))
        .entrySet().stream().sorted((o1,o2)->o1.getKey().compareTo(o2.getKey()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue,newValue)->oldValue, LinkedHashMap::new));
        //System.out.println("sortedFruits2 : "+sortedFruits);
    
     //12. Top 2 most frequent fruits (by quantity):
        List<String> top2Fruits  = items.stream().collect(Collectors.groupingBy(item->item.getItemName(),Collectors.summingInt(item->item.getItemQuantity())))
        .entrySet().stream().sorted((o1,o2)->o2.getValue()-o1.getValue()).limit(2).map(Map.Entry::getKey).collect(Collectors.toList());
        //System.out.println("top2Fruits : "+top2Fruits );
        
     //13. Group by name and price → sum quantities:   
        Map<String,Map<BigDecimal,Integer>> groupedByNameAndPrice = items.stream().collect(
        		Collectors.groupingBy(item->item.getItemName(),
        		  Collectors.groupingBy(item->item.itemPrice, 
        				  Collectors.summingInt(item->item.getItemQuantity())
        )));
        
        System.out.println("groupedByNameAndPrice : "+groupedByNameAndPrice );
       
       //14. Convert to Map → name → totalPrice (price × quantity):
        
        Map<String, BigDecimal> nameToTotalPrice = items.stream()
        	    .collect(Collectors.groupingBy(Item::getItemName,
        	        Collectors.reducing(BigDecimal.ZERO,
        	            i -> i.getItemPrice().multiply(new BigDecimal(i.getItemQuantity())),
        	            BigDecimal::add)));
        System.out.println("nameToTotalPrice: "+nameToTotalPrice);
        
        
    
    }
}


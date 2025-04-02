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
        fruitCount.forEach((fruit, count) -> System.out.println(fruit + " -> " + count));
    }
}


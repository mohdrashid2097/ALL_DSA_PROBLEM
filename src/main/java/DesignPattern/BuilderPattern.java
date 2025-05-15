package DesignPattern;

public class BuilderPattern {

	public static void main(String[] args) {
		
		// Builder Design Pattern
		
		Pizza pizza = new Pizza.Builder("Large")
                .addCheese()
                .addTomatoes()
                .addPepperoni()
                .build();

		System.out.println(pizza);

	}

}

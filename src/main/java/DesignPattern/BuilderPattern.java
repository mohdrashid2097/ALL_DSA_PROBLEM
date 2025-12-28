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
		
		User user = new User.UserBuilder("Mohd Rashid", 28)
				.country("India")
				.profession("Software Engineering")
				.active(true)
				.build();
		
		System.out.println(user);

	}

}

package DesignPattern;

public class AbstractFactoryDemo {
	
	public static void main(String[] args) {
		// Abstract factory design pattern
		// Creates families of related objects without specifying their concrete classes.
		// Abstract Factory provides an interface to create a family of related objects without specifying their concrete classes.
		
		AnimalFactory dogFactory = new DogFactory();
		Animal dog = dogFactory.createAnimal();
		dog.makeSound();
		
		AnimalFactory catFactory = new CatFactory();
		Animal cat = catFactory.createAnimal();
		cat.makeSound();
	}
}

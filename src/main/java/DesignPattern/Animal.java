package DesignPattern;

public interface Animal {
	void makeSound();
}
class Dog implements Animal{
	public void makeSound() {
		System.out.println("Bark");
	}
}
class Cat implements Animal {
	public void makeSound() {
		System.out.println("Meow");
	}
}

abstract class AnimalFactory{
	abstract Animal createAnimal();
}
class DogFactory extends AnimalFactory{
	public Animal createAnimal() {
		return new Dog();
	}
}
class CatFactory extends AnimalFactory{
	public Animal createAnimal() {
		return new Cat();
	}
}

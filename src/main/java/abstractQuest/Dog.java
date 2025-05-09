package abstractQuest;

public class Dog extends Animal{
	Dog(){System.out.println("Dog class constructor!");}
	@Override
	void breathe() {System.out.println("makeSound method implemented in Dog");}
	
	//test 
	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.breathe(); //concrete method from abstract class
		myDog.makesound(); //overridden method
	}
	
}


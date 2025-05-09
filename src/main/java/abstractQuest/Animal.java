package abstractQuest;

public abstract class Animal {
	// constrcutor
	Animal(){System.out.println("Animal Constructor!");}
	//abstract method
	abstract void breathe();
	//concrete method
	void makesound() {System.out.println("Animal class concrete method");}
}


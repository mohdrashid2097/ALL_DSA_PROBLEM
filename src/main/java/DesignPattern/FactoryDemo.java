package DesignPattern;

public class FactoryDemo{
	public static void main(String[] args) {
		//Abstract Factory Design pattern
		//Provides an interface for creating objects, but allows subclasses to decide which class to instantiate
		
		Shape shape = ShapeFactory.getShape("Circle");
		shape.draw();
		
		Shape shape2 = ShapeFactory.getShape("Rectangle");
		shape2.draw();
	}
}

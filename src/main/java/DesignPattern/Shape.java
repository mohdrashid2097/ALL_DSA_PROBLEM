package DesignPattern;

public interface Shape {
	void draw();
}

class Circle implements Shape{
	public void draw() {
		System.out.println("This is a circle!");
	}
}

class Rectangle implements Shape{
	public void draw() {
		System.out.println("This is a Rectangle!");
	}
}

class ShapeFactory {
	public static Shape getShape(String type) {
		if(type.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if(type.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}


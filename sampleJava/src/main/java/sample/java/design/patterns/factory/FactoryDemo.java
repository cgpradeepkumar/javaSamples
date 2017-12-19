package sample.java.design.patterns.factory;

/*
 *  Factory Pattern
 *  
 *  best way to create an object.
 *  create objects without exposing the creation logic to client.
 *  refer new objects with the help of a common interface.
 * 
 */

public class FactoryDemo {
	
	public static void main(String arg[]) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape1 = factory.createShape(ShapeType.CIRCLE);
		shape1.draw();
		
		Shape shape2 = factory.createShape(ShapeType.RECTANGLE);
		shape2.draw();
	}
}

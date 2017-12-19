package sample.java.design.patterns.prototype;

public class PrototypePatternDemo {
	
	/*
	 * Prototype Pattern
	 * 
	 * create duplicate objects
	 * best way to create objects where directly creating object is costly
	 * when we have to keep performance in mind
	 * 
	 */

	public static void main(String arg[]) {
		ShapeCache.loadCache();
		try {
			Shape shape1 = ShapeCache.getShape(1);
			System.out.println(shape1.getType());
			shape1.draw();
			
			Shape shape2 = ShapeCache.getShape(2);
			System.out.println(shape2.getType());
			shape2.draw();
			
			shape2.setId(1);
			System.out.println(shape2.getType());
			shape2.draw();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

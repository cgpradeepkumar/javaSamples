package sample.java.design.patterns.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		super.setType(ShapeType.RECTANGLE);
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle.draw()");
	}

}

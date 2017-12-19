package sample.java.design.patterns.prototype;

public class Circle extends Shape {

	public Circle() {
		super.setType(ShapeType.CIRCLE);
	}

	@Override
	public void draw() {
		System.out.println("Circle.draw()");
	}

}

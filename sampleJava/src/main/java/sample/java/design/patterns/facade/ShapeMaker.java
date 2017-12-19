package sample.java.design.patterns.facade;

import sample.java.design.patterns.factory.Circle;
import sample.java.design.patterns.factory.Rectangle;
import sample.java.design.patterns.factory.Shape;

public class ShapeMaker {

	private Shape circle, rectangle;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
}

package sample.java.design.patterns.facade;

public class FacadePatternDemo {
	
	/*
	 * Facade Pattern
	 * 
	 * hides the complexity of the system.
	 * 
	 * performs the orchestration and delegation to actual system
	 * 
	 */

	public static void main(String arg[]) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
	}
}

package sample.java.design.patterns.factory;

import org.apache.log4j.Logger;

public class Circle implements Shape {

	private Logger logger = Logger.getLogger(Circle.class);
	
	@Override
	public void draw() {
		logger.info("Enter Circle.draw");
		
		logger.info("Exit Circle.draw");
	}

}

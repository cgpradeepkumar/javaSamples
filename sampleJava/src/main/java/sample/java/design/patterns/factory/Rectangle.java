package sample.java.design.patterns.factory;

import org.apache.log4j.Logger;

public class Rectangle implements Shape {

	private Logger logger = Logger.getLogger(Rectangle.class);
	
	@Override
	public void draw() {
		logger.info("Enter Rectangle.draw");
		
		logger.info("Exit Rectangle.draw");
	}

}

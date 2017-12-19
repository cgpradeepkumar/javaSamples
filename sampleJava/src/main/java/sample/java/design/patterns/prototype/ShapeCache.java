package sample.java.design.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	
	private static Map<Integer, Shape> cache = new HashMap<Integer, Shape>();
	
	public static void loadCache() {
		Shape circle = new Circle();
		circle.setId(1);
		cache.put(circle.getId(), circle);
		
		Shape rectangle = new Rectangle();
		rectangle.setId(2);
		cache.put(rectangle.getId(), rectangle);
	}

	public static Shape getShape(int shapeId) throws CloneNotSupportedException {
		
		Shape cachedShape = cache.get(shapeId);
		
		return (Shape) cachedShape.clone();
	}
}

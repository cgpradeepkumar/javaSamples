package sample.java.design.patterns.prototype;

public abstract class Shape implements Cloneable {

	private int id;
	
	private ShapeType type;
	
	public abstract void draw();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ShapeType getType() {
		return type;
	}

	public void setType(ShapeType type) {
		this.type = type;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

enum ShapeType {
	CIRCLE, RECTANGLE;
}
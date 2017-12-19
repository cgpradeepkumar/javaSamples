package sample.java.design.patterns.builder;

public abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public String toString() {
		return name() + " | " + packing() + " | " + price();
	}
}

package sample.java.design.patterns.builder;

public abstract class Burger implements Item {
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public String toString() {
		return name() + " | " + packing() + " | " + price();
	}
}

package sample.java.design.patterns.builder;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Vegitable Burger";
	}

	@Override
	public float price() {
		return 25.0f;
	}

}

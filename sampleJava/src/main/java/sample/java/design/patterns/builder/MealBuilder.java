package sample.java.design.patterns.builder;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal veg = new Meal();
		veg.addItem(new VegBurger());
		veg.addItem(new Coke());
		return veg;
	}
	
	public Meal prepareNonVegMeal() {
		Meal nonVeg = new Meal();
		nonVeg.addItem(new ChickenBurger());
		nonVeg.addItem(new Pepsi());
		return nonVeg;
	}
}

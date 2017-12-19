package sample.java.design.patterns.builder;

public class BuilderPatternDemo {
	
	/*
	 * Builder Pattern
	 * 
	 * best way to construct complex objects using simple objects
	 * step-by-step approach
	 * 
	 */

	public static void main(String arg[]) {
		MealBuilder builder = new MealBuilder();
		
		Meal nonVegMeal = builder.prepareNonVegMeal();
		System.out.println("---Non Vegitarian Meal---");
		nonVegMeal.showItems();
		System.out.println("Cost =" + nonVegMeal.getCost());
		
		Meal vegMeal = builder.prepareVegMeal();
		System.out.println("---Vegitarian Meal---");
		vegMeal.showItems();
		System.out.println("Cost = " + vegMeal.getCost());
	}
}

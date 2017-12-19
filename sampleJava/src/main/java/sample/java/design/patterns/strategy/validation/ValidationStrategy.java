package sample.java.design.patterns.strategy.validation;

public interface ValidationStrategy {

	<T extends UserInput> boolean validate(T userInput);
	
	ValidationType getValidationType();
}

package sample.java.design.patterns.strategy.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ValidationContext {

	private Set<ValidationStrategy> strategies;
	
	public ValidationType execute(UserInput userInput) {
		for (ValidationStrategy strategy : strategies) {
			if (!strategy.validate(userInput)) {
				return strategy.getValidationType();
			}
		}
		return null;
	}
	
	public List<ValidationType> executeAll(UserInput userInput) {
		List<ValidationType> validationTypes = new ArrayList<ValidationType>();
		for (ValidationStrategy strategy : strategies) {
			if(!strategy.validate(userInput)) {
				validationTypes.add(strategy.getValidationType());
			}
		}
		return validationTypes;
	}
	
	public void setStrategies(Set<ValidationStrategy> strategies) {
		this.strategies = strategies;
	}
}

package sample.java.design.patterns.strategy.validation;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ValidationStrategyDemo {
	
	public static void main(String arg[]) {
		
		ValidationContext context = new ValidationContext();
		
		Set<ValidationStrategy> strategies = new LinkedHashSet<ValidationStrategy>();
		strategies.add(UserValidationStrategy.DATE_OF_BIRTH);
		strategies.add(UserValidationStrategy.CITY);
		context.setStrategies(strategies);
		
		UserInput input = new UserInput();
		input.setCity("");
		input.setDateOfBirth(null);
		ValidationType validationType = context.execute(input);
		System.out.println(validationType);
		
		System.out.println("--------------------------------------------");
		List<ValidationType> validationTypes = context.executeAll(input);
		for (ValidationType validationType2 : validationTypes) {
			System.out.println(validationType2);
		}
	}

}

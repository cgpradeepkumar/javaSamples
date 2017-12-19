package sample.java.design.patterns.strategy.validation;

public enum UserValidationStrategy implements ValidationStrategy {

	DATE_OF_BIRTH(ValidationType.DATE_OF_BIRTH) {
		@Override
		public <T extends UserInput> boolean validate(T userInput) {
			if (userInput.getDateOfBirth() == null)
				return false;
			else
				return true;
		}
	},

	CITY(ValidationType.CITY) {
		@Override
		public <T extends UserInput> boolean validate(T userInput) {

			if (userInput.getCity() == null || userInput.getCity().isEmpty()) {
				return false;
			} else {
				return true;
			}
		}
	},

	UNSUPPORTED(ValidationType.UNSUPPORTED) {
		@Override
		public <T extends UserInput> boolean validate(T userInput) {
			return false;
		}
	};

	private ValidationType validationType;

	private UserValidationStrategy(ValidationType validationType) {
		this.validationType = validationType;
	}

	@Override
	public ValidationType getValidationType() {
		return validationType;
	}
}

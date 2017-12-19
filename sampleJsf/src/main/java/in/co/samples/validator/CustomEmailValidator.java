package in.co.samples.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("customEmailValidator")
public class CustomEmailValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object object)
			throws ValidatorException {
		
		String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String input = (String) object;
		
		UIInput uiInput = (UIInput) component.getAttributes().get("selected");
		
		
		Object o = uiInput.getSubmittedValue();
		
		Pattern emailPattern = Pattern.compile(pattern);
		
		if (o instanceof Boolean) {
			Boolean selected = (Boolean) o;
			if (selected) {
				Matcher matcher = emailPattern.matcher(input);
				
				if (input == null || "".equals(input)) {
					FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Value required", "Please enter a valid email");
					throw new ValidatorException(message);
				}
				
				if (!matcher.matches()) {
					FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Invalid Email", "Please enter a valid email");
					throw new ValidatorException(message);
				}
			}
		}
	}

}

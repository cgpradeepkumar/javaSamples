package sample.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowMessageController {

	@RequestMapping(method = RequestMethod.GET)
	public String showMessage(ModelMap map) {
		String message = "Hello Spring MVC";
		map.addAttribute("message", message);
		return "showMessage";
	}
}

package ldnr.miam_miam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AjouterController {

	@RequestMapping(value = { "/ajouter_pizza" }, method = RequestMethod.GET)
	public String index(Model model) {
		

		return "ajouter_pizza";
	}
	
	
	
	@RequestMapping(value = { "/ajouter_boisson" }, method = RequestMethod.GET)
	public String index3(Model model) {
		

		return "ajouter_boisson";
	}
}

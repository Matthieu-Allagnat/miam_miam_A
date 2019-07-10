package ldnr.miam_miam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NosProduitsController {
	@RequestMapping(value = { "/nos_produits" }, method = RequestMethod.GET)
	public String index(Model model) {

		return "nos_produits";
	}
}

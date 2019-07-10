package ldnr.miam_miam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GerantController {
	@RequestMapping(value = { "/gerant" }, method = RequestMethod.GET)
	public String index(Model model) {

		return "gerant";
	}
}

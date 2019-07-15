package ldnr.miam_miam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ldnr.miam_miam.model.Client;
import ldnr.miam_miam.model.Gerant;

@Controller
public class GerantController {

	

	@Autowired
	GerantRepository repo2;

	/*@RequestMapping(value = { "/gerant" }, method = RequestMethod.GET)
	public String index(Model model) {

		return "gerant";
	}*/

	
	
	/*@RequestMapping("/connexion")
	public String index3(@ModelAttribute Client client, Model model) {

		Model loginForm = model.addAttribute("login", client.getLogin());
		String loginForm2=loginForm.toString();
		Model passwordForm = model.addAttribute("password", client.getPassword());
		String passwordForm2=passwordForm.toString();

		
		Iterable<Gerant> gerants = repo2.findAll();
		model.addAttribute("gerants", gerants);

		for (Gerant gerantbdd : gerants) {
			if ((gerantbdd.getLogin().equals(loginForm2)) && gerantbdd.getPassword().equals(passwordForm2)){
				return "gerant";
			}	
		}
		return "test";
	}*/
}

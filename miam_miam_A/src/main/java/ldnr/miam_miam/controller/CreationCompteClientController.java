package ldnr.miam_miam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreationCompteClientController {
	@Autowired
	private CreationCompteClientRepository repo;

	@RequestMapping(value = { "/creation_compte_client" }, method = RequestMethod.GET)
	public String index(Model model) {
		// if everything is valid
		// model.addAttribute("client" , client)
		// repo.save(client)
		// return "compte_client_cree"
		// else return "creer_un_compte"
		return "compte_client_cree";
	}
}

package ldnr.miam_miam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConnexionClientController {
	
	@Autowired
	private ConnexionClientRepository repo;

	@RequestMapping(value = { "/connexion_client" }, method = RequestMethod.GET)
	public String index(Model model) {
		
		// if (submitted_pass == repo.findByLogin() )  y'a pas FindByLogin, y'a findById mais il faudrait mettre le login en ID de client?
		// créer une session pour le client ? 
		// "return carte"
		// else return "connexion" avec un message connexion invalide
		return "carte";
	}
}
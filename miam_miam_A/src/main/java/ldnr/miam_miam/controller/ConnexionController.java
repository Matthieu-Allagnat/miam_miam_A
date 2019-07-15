package ldnr.miam_miam.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ldnr.miam_miam.model.Client;

@Controller
public class ConnexionController {

	@Autowired
	ClientRepository repo;

	@RequestMapping("/connexion")
	public String index2(@ModelAttribute Client client, Model model) {
		String path = "rien";
		model.addAttribute("login", client.getLogin());
		model.addAttribute("password", client.getPassword());

		Map<String, Object> loginForm = model.asMap();
		Map<String, Object> passwordForm = model.asMap();

		Iterable<Client> clients = repo.findAll();
		model.addAttribute("clients", clients);

		for (Client clientbdd : clients) {
			String loginbdd = clientbdd.getLogin();
			String passwordbdd = clientbdd.getPassword();
			boolean isGerantbdd = clientbdd.isGerant();
			// System.out.println(clientbdd.getLogin());
			// System.out.println(clientbdd.getPassword());
			// System.out.println(clientbdd.isGerant());
			// System.out.println("login : " + loginForm.get("login"));
			// System.out.println("password : " + passwordForm.get("password"));

			System.out.println("login?" + loginbdd.equals(loginForm.toString()));
			System.out.println("pwd?" + passwordbdd.equals(passwordForm.toString()));

			System.out.println("isGereant?" + (isGerantbdd == true));

			System.out.println(loginbdd + " ? " + loginForm.get("login").toString());
			System.out.println(passwordbdd + " ? " + passwordForm.get("password").toString());
			System.out.println(isGerantbdd + " ? ");

			if ((loginbdd.equals(loginForm.get("login").toString()))
					&& (passwordbdd.equals(passwordForm.get("password").toString()))) {
				if (isGerantbdd == true) {
					return "gerant";
				} else if (isGerantbdd == false) {
					return "index";
				} else {
					return "error_page";
				}
			}
		}
		return "error_page";
	}

	@RequestMapping(value = { "/connexion_page" }, method = RequestMethod.GET)
	public String index(Model model) {

		return "connexion_page";
	}

}

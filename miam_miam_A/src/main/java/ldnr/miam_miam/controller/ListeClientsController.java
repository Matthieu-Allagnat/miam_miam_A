package ldnr.miam_miam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ldnr.miam_miam.model.Client;


@Controller
public class ListeClientsController {
	private static List<Client> clients = new ArrayList<Client>();

	static {
		clients.add(new Client(1, "bob", "dupond", "boby", "sultan", "sultan", "31400", "31 rue des pommiers", "Toulouse", "0561254578", "bob.d@gmail.com", 2));
		clients.add(new Client(2, "josiane", "Mercier", "jojo", "dalida", "dalida", "31200", "27 rue de la gare", "l'Union", "0672254377", "josy.m@gmail.com", 4));
		clients.add(new Client(3, "bernard", "Duchemol", "bebert", "dudu", "dudu", "31000", "1 place du capitol", "Toulouse", "0626589745", "bernard.dudu@gmail.com", 9));
	}

	@RequestMapping(value = { "/liste_clients" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("clients", clients);

		return "liste_clients";
	}
}

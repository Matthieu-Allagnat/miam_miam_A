package ldnr.miam_miam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ldnr.miam_miam.model.Client;


@Controller
public class ListeClientsController {
	
	@Autowired
	ClientRepository repo;
	

	 @RequestMapping("/liste_clients")
	  public String index(Model model) {
	        Iterable<Client> clients = repo.findAll();
	        model.addAttribute("clients", clients);
	        return "liste_clients";
	   }
	
	
}

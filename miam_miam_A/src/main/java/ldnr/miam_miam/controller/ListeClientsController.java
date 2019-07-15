package ldnr.miam_miam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	 
	 
	 @RequestMapping("/creer_compte")
	  public String index2(@ModelAttribute Client client, Model model) {
	        
	        model.addAttribute("firstName", client.getFirstName());
	        model.addAttribute("lastName", client.getLastName());
	        model.addAttribute("login", client.getLogin());
	        model.addAttribute("password", client.getPassword());
	        model.addAttribute("verifPassword", client.getVerifPassword());
	        model.addAttribute("postalCode", client.getPostalCode());
	        model.addAttribute("address", client.getAddress());
	        model.addAttribute("city", client.getCity());
	        model.addAttribute("phoneNumber", client.getPhoneNumber());
	        model.addAttribute("emailAddress", client.getEmailAddress());
	        repo.save(client);
	        return "index";
	   }
	
	
}

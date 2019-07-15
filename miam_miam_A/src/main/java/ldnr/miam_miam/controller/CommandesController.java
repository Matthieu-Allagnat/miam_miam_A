package ldnr.miam_miam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ldnr.miam_miam.model.Commande;

@Controller
public class CommandesController {

	@Autowired
	PizzaRepository pizzaRepo;
	@Autowired
	CommandesRepository commandeRepo;
	/*
	 * Commande commande ; boolean estNouveau = false; HttpSession session =
	 * request.getSession();
	 * 
	 * commande = (Commande) session.getAttribute("commande");
	 * 
	 * // Récupération de la configuration (création si nécessaire) if (commande ==
	 * null) { commande = new Commande(); estNouveau = true; }
	 */
	@RequestMapping(value = { "/commander_pizza" }, method = RequestMethod.GET)
	public String index(Model model, @RequestParam String pizza_name, @RequestParam Double pizza_price,
			@ModelAttribute Commande commande) {
		commande.setPizza(pizza_name);
		commande.setPrice(commande.getPrice() + pizza_price);
		// TODO : récupérer pizza_id au lieu de pizza_name
		// Et faire un commande.pizza = pizzaRepo.getByID(pizza_id);
		// Mais ça ne marche pas parcque getById return un Optional<Pizza> au lieu d'une
		// Pizza;
		model.addAttribute("commande", commande);
		return "pizza_commandee";
	}

	@RequestMapping(value = { "/commander_boisson" }, method = RequestMethod.GET)
	public String index2(Model model, @RequestParam String boisson_name, @RequestParam Double boisson_price,
			@ModelAttribute Commande commande) {
		commande.setBoisson(boisson_name);
		commande.setPrice(commande.getPrice() + boisson_price);
		// TODO : récupérer pizza_id au lieu de pizza_name
		// Et faire un commande.pizza = pizzaRepo.getByID(pizza_id);
		// Mais ça ne marche pas parcque getById return un Optional<Pizza> au lieu d'une
		// Pizza;
		model.addAttribute("commande", commande);
		return "boisson_commandee";
	}

	@RequestMapping(value = {"/panier_client"}, method = RequestMethod.GET)
	public String index4(Model model) {
		return "panier_client";
	}
	@RequestMapping(value = { "/persistence_commande" }, method = RequestMethod.GET)
	public String index3(Model model, @ModelAttribute Commande commande) {
		
		model.addAttribute("price",commande.getPrice());
		model.addAttribute("pizza",commande.getPizza());
		model.addAttribute("boisson",commande.getBoisson());
		model.addAttribute("toDeliver",commande.getToDeliver());
		
		commandeRepo.save(commande);
		
		return "commande_persistee";
	}
}

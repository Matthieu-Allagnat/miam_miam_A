package ldnr.miam_miam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ldnr.miam_miam.model.Boisson;

@Controller
public class AjouterController {

	private BoissonRepository boissonRepo;
	@RequestMapping(value = { "/ajouter_pizza" }, method = RequestMethod.GET)
	public String index(Model model) {

		return "ajouter_pizza";
	}

	@RequestMapping(value = { "/ajouter_boisson" }, method = RequestMethod.GET)
	public String index3(Model model) {

		return "ajouter_boisson";
	}

	@RequestMapping(value = { "/persistence_boisson" }, method = RequestMethod.GET)
	public String persistenceBoisson(@ModelAttribute("nouvelleBoisson") Boisson nouvelleBoisson,Model model) {
	
		model.addAttribute("boissonName",nouvelleBoisson.getName());
		model.addAttribute("price",nouvelleBoisson.getPrice());
		//model.addAttribute("id",nouvelleBoisson.getId());
		boissonRepo.save(nouvelleBoisson);
		
		return "redirect:ajouter_modifier_supprimer";
	}
}

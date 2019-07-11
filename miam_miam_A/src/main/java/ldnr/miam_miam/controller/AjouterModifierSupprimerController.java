package ldnr.miam_miam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ldnr.miam_miam.model.Pizza;

@Controller
public class AjouterModifierSupprimerController {
	
	private static List<Pizza> pizzas = new ArrayList<Pizza>();
	 
    static {
        pizzas.add(new Pizza("margarita", "s", 12 ));
        pizzas.add(new Pizza("4 fromages", "xl", 15));
        pizzas.add(new Pizza("buffalo", "m", 13));
        pizzas.add(new Pizza("thon", "xl", 16));
    }
	
	@RequestMapping(value = { "/ajouter_modifier_supprimer" }, method = RequestMethod.GET)
    public String index(Model model) {
		model.addAttribute("pizzas", pizzas);
 
        return "ajouter_modifier_supprimer";
    }
}

package ldnr.miam_miam.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ldnr.miam_miam.model.Commande;
import ldnr.miam_miam.model.Pizza;

@Controller
public class ListeCommandesController {
	
	private static List<Commande> commandes = new ArrayList<Commande>();
	 
    static {
        commandes.add(new Commande(1, 58.00, true, false, "13_06_2019", "menu magarita", "4_fromage", "coca" ));
        commandes.add(new Commande(3, 47.00, true, false, "15_06_2019", "menu chorizzo", "calzone", "orangina" ));
        commandes.add(new Commande(5, 42.00, false, true, "16_06_2019", "menu reine", "chevre", "biere" ));
        commandes.add(new Commande(6, 60.00, false, true, "13_06_2019", "menu calzone", "fruit de mer", "evian" ));
    }
	
	@RequestMapping(value = { "/liste_commandes" }, method = RequestMethod.GET)
    public String index(Model model) {
		model.addAttribute("pizzas", commandes);
 
        return "liste_commandes";
    }
}

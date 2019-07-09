package ldnr.miam_miam.controller.gerant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ldnr.miam_miam.model.Gerant;

@Controller
public class GerantController {
	/*@RequestMapping("accueilGerant")
	public String accueilGerant() {
		return "Index de gestion";
	}*/
	
	 private static List<Gerant> persons = new ArrayList<Gerant>();
	 
	    static {
	        persons.add(new Gerant("Bill", "Gates"));
	        persons.add(new Gerant("Steve", "Jobs"));
	    }
	 
	    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	    public String index(Model model) {
	 
	        String message = "Hello Spring Boot + JSP";
	 
	        model.addAttribute("message", message);
	 
	        return "index";
	    }
	 
	    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
	    public String viewPersonList(Model model) {
	 
	        model.addAttribute("persons", persons);
	 
	        return "personList";
	    }
}

package ldnr.miam_miam.controller.gerant;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class GerantController {
	@RequestMapping("accueilGerant")
	public String accueilGerant() {
		return "Index de gestion";
	}
	
	@RequestMapping(value = {"/gerant" }, method = RequestMethod.GET)
	public String index(Model model) {

		String message = "test gerant";

		model.addAttribute("message", message);

		return "gerant";
	}
	
	
}

package ldnr.miam_miam.controller.gerant;

import org.springframework.web.bind.annotation.RequestMapping;

public class GerantController {
	@RequestMapping("accueilGerant")
	public String accueilGerant() {
		return "Index de gestion";
	}
}

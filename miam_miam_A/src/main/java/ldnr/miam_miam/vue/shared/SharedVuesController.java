package ldnr.miam_miam.vue.shared;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SharedVuesController {

	@RequestMapping("index")
	public String index() {
		return "Bienvenue à la Pizzeria Miam-Miam !";
	}
}

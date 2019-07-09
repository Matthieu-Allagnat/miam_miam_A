package ldnr.miam_miam.controller.client;

import org.springframework.web.bind.annotation.RequestMapping;

public class ClientController {
	@RequestMapping("panierClient")
	public String panierClient() {
		return "Page du panier client";
	}


}

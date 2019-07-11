package ldnr.miam_miam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"ldnr.miam_miam"})
public class MiamMiamAApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiamMiamAApplication.class, args);
	}

}

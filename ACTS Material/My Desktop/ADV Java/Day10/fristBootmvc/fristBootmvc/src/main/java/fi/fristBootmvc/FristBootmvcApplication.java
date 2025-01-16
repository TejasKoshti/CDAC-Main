package fi.fristBootmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"fi.fristBootmvc.controllers"})
@EntityScan(basePackages = {"fi.fristBootmvc.entity"})
public class FristBootmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FristBootmvcApplication.class, args);
	}

}

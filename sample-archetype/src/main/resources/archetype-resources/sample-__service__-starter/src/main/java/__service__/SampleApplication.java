package pt.sample.${service};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"pt.sample.${service}.rest.controllers.impl",
		"pt.sample.${service}.domain.services.impl",
		"pt.sample.${service}.data"
})
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

}

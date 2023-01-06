package br.com.imperiopet.estetica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class EsteticaApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return "Teste API Estetica";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EsteticaApplication.class, args);
	}
}

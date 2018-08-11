package com.aedefecium_solutio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPetClinicApplication {

	public static void main(String[] args) {
		System.out.println("Mensaje 1");
		SpringApplication.run(SpringPetClinicApplication.class, args);
	}
}

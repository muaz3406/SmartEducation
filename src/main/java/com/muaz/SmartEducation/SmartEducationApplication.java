package com.muaz.SmartEducation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.muaz.SmartEducation.repository")
@SpringBootApplication
public class SmartEducationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartEducationApplication.class, args);
	}
}

package com.card.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.card")
@EnableJpaRepositories("com.card.repository")
@EntityScan(basePackages = "com.card.entity")
@SpringBootApplication
public class CardManagementSystemApplication {

	public static void main(String[] args) {
		
		Logger log = LoggerFactory.getLogger(CardManagementSystemApplication.class);
		SpringApplication.run(CardManagementSystemApplication.class, args);
		log.info("Card Management Application started ithod any issues");
	}

}

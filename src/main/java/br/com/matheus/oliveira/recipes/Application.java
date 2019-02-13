package br.com.matheus.oliveira.recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="br.com.matheus.oliveira.recipes.controllers")
@EnableJpaRepositories("br.com.matheus.oliveira.recipes.repositories")
@EntityScan("br.com.matheus.oliveira.recipes.entities")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

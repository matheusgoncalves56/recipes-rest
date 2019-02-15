package br.com.matheus.oliveira.recipes.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.matheus.oliveira.recipes.entities.Recipe;
import br.com.matheus.oliveira.recipes.repositories.RecipeRepository;

@RestController
public class RecipeController {
	private static final Logger log = LoggerFactory.getLogger(RecipeController.class);

	@Autowired
	private RecipeRepository recipeRepository;
	
	@RequestMapping(value = "/listarTodos", method = RequestMethod.GET)
	public ResponseEntity<?> listarTodos() {
		try {
			Iterable<Recipe> recipes = recipeRepository.findAll();

			List<Recipe> resultado = new ArrayList<>();
			recipes.forEach(resultado::add);

			return new ResponseEntity<List<Recipe>>(resultado, HttpStatus.OK);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public void setRecipeRepository(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

}

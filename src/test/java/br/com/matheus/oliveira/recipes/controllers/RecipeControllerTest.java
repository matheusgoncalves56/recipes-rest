package br.com.matheus.oliveira.recipes.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.assertj.core.internal.Lists;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.matheus.oliveira.recipes.builders.RecipeBuilder;
import br.com.matheus.oliveira.recipes.entities.Recipe;
import br.com.matheus.oliveira.recipes.repositories.RecipeRepository;

public class RecipeControllerTest {
	private RecipeController recipeController;
	private RecipeRepository recipeRepository;
	
	@Before
	public void setup() {
		recipeController = new RecipeController();
		recipeRepository = mock(RecipeRepository.class);
		recipeController.setRecipeRepository(recipeRepository);
	}
	
	@Test
	public void shouldListAllRecipes() {
		Recipe recipe = new RecipeBuilder().build();
		List<Recipe> recipes = Arrays.asList(recipe);

		when(recipeRepository.findAll()).thenReturn(recipes);
		ResponseEntity<?> listarTodos = recipeController.listarTodos();
		
		HttpStatus status = listarTodos.getStatusCode();
		List<Recipe> allRecipes = (List<Recipe>) listarTodos.getBody();
		
		assertThat(allRecipes, is(recipes));
		assertThat(status, is(HttpStatus.OK));
	}
	
}

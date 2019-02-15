package br.com.matheus.oliveira.recipes.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.matheus.oliveira.recipes.entities.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}

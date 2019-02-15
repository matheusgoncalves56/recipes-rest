package br.com.matheus.oliveira.recipes.builders;

import java.util.ArrayList;
import java.util.List;

import br.com.matheus.oliveira.recipes.entities.Ingredient;
import br.com.matheus.oliveira.recipes.entities.Recipe;

public class RecipeBuilder {

	private Long id = 1l;
	private String name = "Meatball Nirvana";
	private String description = "These meatballs are a compilation of many, many meatball recipes to finally achieve what I was looking for... Meatball Nirvana! Cover with your favorite red sauce and serve with pasta or in crusty garlic bread rolls.";
	private List<Ingredient> ingredients = new ArrayList<>();

		
	public  RecipeBuilder withId(Long id) {
		this.id = id;
		return this;
	}
	
	public Recipe build() {
		return new Recipe(id, name, description, ingredients);
	}
}

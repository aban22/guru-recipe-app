package guru.springframework.gururecipeapp.services;

import java.util.Set;

import guru.springframework.gururecipeapp.domain.Recipe;

public interface RecipeService {

	Set<Recipe> getRecipes();
}

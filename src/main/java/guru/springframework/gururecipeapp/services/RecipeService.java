package guru.springframework.gururecipeapp.services;

import java.util.Set;

import guru.springframework.gururecipeapp.commands.RecipeCommand;
import guru.springframework.gururecipeapp.domain.Recipe;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
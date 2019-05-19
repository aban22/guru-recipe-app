package guru.springframework.gururecipeapp.services.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import guru.springframework.gururecipeapp.domain.Recipe;
import guru.springframework.gururecipeapp.repositories.RecipeRepository;

public class RecipeServiceImplTest {

	private RecipeServiceImpl recipeService;
	
	@Mock
	private RecipeRepository recipeRepository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		recipeService = new RecipeServiceImpl(recipeRepository);
	}
	
	@Test
	public void getRecipes() {
		
		Recipe recipe = new Recipe();
		Set<Recipe> recipesData = new HashSet<Recipe>();
		recipesData.add(recipe);
		
		when(recipeRepository.findAll()).thenReturn(recipesData);
		
		Set<Recipe> recipes = recipeService.getRecipes();
		
		assertEquals(1, recipes.size());
		verify(recipeRepository, times(1)).findAll();
	}
}

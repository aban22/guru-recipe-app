package guru.springframework.gururecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.gururecipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}

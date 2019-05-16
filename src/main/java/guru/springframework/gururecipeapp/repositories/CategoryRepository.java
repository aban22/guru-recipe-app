package guru.springframework.gururecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.gururecipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}

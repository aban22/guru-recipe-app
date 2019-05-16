package guru.springframework.gururecipeapp.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.gururecipeapp.domain.Category;
import guru.springframework.gururecipeapp.domain.UnitOfMeasure;
import guru.springframework.gururecipeapp.repositories.CategoryRepository;
import guru.springframework.gururecipeapp.repositories.UnitOfMeasureRepository;

@Controller
public class IndexController {

	private CategoryRepository categoryRepository;
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
		this.categoryRepository = categoryRepository;
		this.unitOfMeasureRepository = unitOfMeasureRepository;
	}
	
	@RequestMapping({"", "/", "/index"})
	public String getIndexPage() {
		Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
		Optional<UnitOfMeasure> UnitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		System.out.println("Category id is: " + categoryOptional.get().getId());
		System.out.println("UnitOfMeasure id is: " + UnitOfMeasureOptional.get().getId());
		return "index";
	}
}

package guru.springframework.gururecipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.gururecipeapp.services.RecipeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@Controller
public class IndexController {

	private RecipeService recipeService;
	
	@RequestMapping({"", "/", "/index"})
	public String getIndexPage(Model model) {
		log.debug("Getting Index page");
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}
}

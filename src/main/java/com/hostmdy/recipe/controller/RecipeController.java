package com.hostmdy.recipe.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hostmdy.recipe.domain.Recipe;
import com.hostmdy.recipe.service.RecipeService;

@Controller
@RequestMapping("/recipe")
public class RecipeController {
	
	private final RecipeService recipeService;

	public RecipeController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}
	
	@GetMapping("/{recipeId}/show")
	public String showRecipeDetails(@PathVariable Long recipeId,Model model) {
		Optional<Recipe> recipeOpt = recipeService.getRecipeById(recipeId);
		
		if(recipeOpt.isEmpty()) {
			throw new NullPointerException("recipe is not found!");
		}
		
		model.addAttribute("recipe", recipeOpt.get());
		return "recipe/recipe-details";
	}
	
}

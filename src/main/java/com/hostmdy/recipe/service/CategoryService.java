package com.hostmdy.recipe.service;

import java.util.Optional;

import com.hostmdy.recipe.domain.Category;

public interface CategoryService {
	Optional<Category> getCategoryById(Long categoryId);
	
	Optional<Category> getCategoryByName(String name);
}

package com.hostmdy.recipe.service;

import java.util.Optional;

import com.hostmdy.recipe.domain.Category;
import com.hostmdy.recipe.domain.UnitOfMeasure;

public interface UomService {
	Optional<UnitOfMeasure> getUomById(Long uomId);
	
	Optional<UnitOfMeasure> getUomByName(String name);
}

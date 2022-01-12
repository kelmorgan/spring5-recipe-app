package com.kelmorgan.spring5recipeapp.services;

import com.kelmorgan.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}

package com.kelmorgan.spring5recipeapp.repositories;

import com.kelmorgan.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}

package com.kelmorgan.spring5recipeapp.controllers;

import com.kelmorgan.spring5recipeapp.domain.Category;
import com.kelmorgan.spring5recipeapp.domain.UnitOfMeasure;
import com.kelmorgan.spring5recipeapp.repositories.CategoryRepository;
import com.kelmorgan.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Tablespoon");

        System.out.println("Cat id is: "+ categoryOptional.get().getId());
        System.out.println("unit id is: "+ unitOfMeasureOptional.get().getId());
        return "index";
    }
}

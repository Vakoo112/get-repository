/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.api.test.controllers.v1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import test.api.test.repositories.CategoryRepository;

/**
 *
 * @author vako
 */
@Controller
public class CategoryController {
    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
     @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", categoryRepository.findAll());
     return "example"; 
    }
}

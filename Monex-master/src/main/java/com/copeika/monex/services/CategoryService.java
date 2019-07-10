package com.copeika.monex.services;


import com.copeika.monex.models.Category;
import com.copeika.monex.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

     public Category addCategory(String name) {
         return categoryRepository.addCategory(name);
     }

     public Category renameCategory(String name, String after_name){
        return categoryRepository.renameCategory(name, after_name);
     }

     public Category fetchCategory(String name){
        return categoryRepository.fetchCategory(name);
     }

     public Category setLimit(String name, Integer limit) {
         return categoryRepository.setLimit(name, limit);
     }

     public Category addMonetaryExpenditures(String name, Integer money_expenditures) {
         return categoryRepository.addMonetaryExpenditures(name, money_expenditures);
     }

     public void deleteCategory(String name){
        categoryRepository.deleteCategory(name);
     }

     public Category refreshMonetaryExpenditures(String name) {
         return categoryRepository.refreshMonetaryExpenditures(name);
     }

     public Collection<Category> getAllCategories(){
        return categoryRepository.getAllBooks();
     }
}

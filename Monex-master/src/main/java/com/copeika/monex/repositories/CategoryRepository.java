package com.copeika.monex.repositories;

import com.copeika.monex.models.Category;

import java.util.Collection;

public interface CategoryRepository {
    Category addCategory(String name);
    void deleteCategory(String name);
    Category renameCategory(String name, String after_name);
    Category fetchCategory(String name);
    Category setLimit(String name, Integer limit);
    Category addMonetaryExpenditures(String name, Integer money_expenditures);
    Category refreshMonetaryExpenditures(String name);
    Collection<Category> getAllBooks();
}

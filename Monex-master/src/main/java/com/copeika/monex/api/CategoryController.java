package com.copeika.monex.api;

import com.copeika.monex.models.Category;
import com.copeika.monex.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class CategoryController {
    private static final String CATEGORY_PATH = "/categories";

    @Autowired
    private CategoryService service;

    @PostMapping(value = CATEGORY_PATH)
    public ResponseEntity<?> addCategory(
            @RequestParam String name
    ) {
        Category result = service.addCategory(name);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping(CATEGORY_PATH + "/{name}")
    public ResponseEntity<?> deleteCategory(
            @PathVariable String name) {
        service.deleteCategory(name);
        return ResponseEntity.ok().build();
    }

    @GetMapping(CATEGORY_PATH + "/{name}")
    public ResponseEntity<Category> fetchCategory(
            @PathVariable String name) {
        Category result = service.fetchCategory(name);
        return ResponseEntity.ok(result);
    }

    @GetMapping(CATEGORY_PATH )
    public ResponseEntity<Collection<Category>> getAllCategories() {
        Collection<Category> categories = service.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @PatchMapping(value = CATEGORY_PATH + "/{name}", params = "after_name")
    public ResponseEntity<Category> renameCategory(
            @PathVariable String name,
            @RequestParam String after_name
            ) {
        Category result = service.renameCategory(name, after_name);
        return ResponseEntity.ok(result);
    }

    @PatchMapping(value = CATEGORY_PATH + "/{name}", params = "limit")
    public ResponseEntity<Category> setLimit(
            @PathVariable String name,
            @RequestParam Integer limit
    ) {
        Category result = service.setLimit(name, limit);
        return ResponseEntity.ok(result);
    }

   @PatchMapping(value = CATEGORY_PATH + "/{name}")
    public ResponseEntity<Category> addMonetaryExpenditures(
            @PathVariable String name,
            @RequestBody Integer money
    ) {
        Category result = service.addMonetaryExpenditures(name, money);
        return ResponseEntity.ok(result);
    }

    @GetMapping(value = CATEGORY_PATH + "/{name}", params = "refresh_money")
    public ResponseEntity<Category> refreshMonetaryExpenditures(
            @PathVariable String name
    ) {
        Category result = service.refreshMonetaryExpenditures(name);
        return ResponseEntity.ok(result);
    }
}

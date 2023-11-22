package com.example.demo.category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
	Category findById(int id);
	Optional<List<Category>> findAllCategory();
	Optional<List<Category>> findByTitle(String title);
	Category createCategory(Category category);
	void deleteCategoryById(int category_id);
	void deleteAllCategory();
	
}

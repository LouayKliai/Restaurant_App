package com.example.demo.category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceIplement implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public Category findById(int id) {
		return categoryRepository.findById(id).orElse(null);
	}

	@Override
	public Optional<List<Category>> findAllCategory() {
		return Optional.of(categoryRepository.findAll());
	}

	@Override
	public Optional<List<Category>> findByTitle(String title) {
		return categoryRepository.findByTitle(title);
	}

	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategoryById(int category_id) {
		categoryRepository.deleteById(category_id);
	}

	@Override
	public void deleteAllCategory() {
		categoryRepository.deleteAll();
		
	}

}

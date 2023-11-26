package com.example.demo.meal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class MealServiceImplement implements MealService {
	@Autowired
	MealRepository mealRepository;
	@Override
	public Meal createMeal(Meal meal) {
		return mealRepository.save(meal);
	}

	@Override
	public Meal findMealById(int meal_id) {
		return mealRepository.findById(meal_id).orElse(null);
	}

	@Override
	public Meal findMealByTitle(String meal_title) {
		return mealRepository.findByTitile(meal_title);
	}

	@Override
	public List<Meal> findMealByPrice(double meal_price) {
		return mealRepository.findByPrice(meal_price);
	}

	@Override
	public List<Meal> findAllMeal() {
		return mealRepository.findAll();
	}

	@Override
	public void deleteMealById(int meal_id) {
		mealRepository.deleteById(meal_id);
		
	}

	@Override
	public void deleteAllMeal() {
		mealRepository.deleteAll();
		
	}

	@Override
	public void deleteMealByTitle(String meal_title) {
		mealRepository.deleteMealByTitle(meal_title);
		
	}

	@Override
	public Meal updateMeal(int meal_id) {
		return mealRepository.updateMealById(meal_id);
	}

}

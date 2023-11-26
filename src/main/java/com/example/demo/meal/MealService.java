package com.example.demo.meal;

import java.util.List;

public interface MealService {

	Meal createMeal(Meal meal);
	Meal findMealById(int meal_id);
	Meal findMealByTitle(String meal_title);
	List<Meal> findMealByPrice(double meal_price);
	List<Meal> findAllMeal();
	void deleteMealById(int meal_id);
	void deleteAllMeal();
	void deleteMealByTitle(String meal_title);
	Meal updateMeal(int meal_id);
}

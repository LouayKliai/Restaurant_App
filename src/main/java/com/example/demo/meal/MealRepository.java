 package com.example.demo.meal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface MealRepository extends JpaRepository<Meal, Integer> { 
	Meal findByTitile(String meal_title);
	List<Meal> findByPrice(double meal_price);
	void deleteMealByTitle(String meal_title);
	Meal updateMealById(int meal_id);
}

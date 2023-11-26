package com.example.demo.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface MenuRepository extends JpaRepository<Menu, Integer> { 
	List<Menu> findByTitle(String menu_title);
	Menu updateById(int menu_id);
}

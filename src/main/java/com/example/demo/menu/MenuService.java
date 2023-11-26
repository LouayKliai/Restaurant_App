package com.example.demo.menu;

import java.util.List;

public interface MenuService {
	Menu createMenu(Menu menu);
	void deleteMenuById(int menu_id);
	void deleteAllMenu();
	Menu findMenuById(int menu_id);
	List<Menu> findMenuByTitle(String menu_id);
	List<Menu> findAllMenu();
	Menu updateMenu(int meal_id);
}

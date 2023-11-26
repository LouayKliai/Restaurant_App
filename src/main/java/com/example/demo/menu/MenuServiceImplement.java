package com.example.demo.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class MenuServiceImplement implements MenuService{
	@Autowired
	MenuRepository menuRepository;
	
	@Override
	public Menu createMenu(Menu menu) {
		return menuRepository.save(menu);
	}


	@Override
	public void deleteAllMenu() {
		menuRepository.deleteAll();
		
	}

	@Override
	public Menu findMenuById(int menu_id) {
		return menuRepository.findById(menu_id).orElse(null);
	}

	@Override
	public List<Menu> findMenuByTitle(String menu_title) {
		return menuRepository.findByTitle(menu_title);
	}

	@Override
	public List<Menu> findAllMenu() {
		return menuRepository.findAll();
	}

	@Override
	public Menu updateMenu(int meal_id) {
		return menuRepository.updateById(meal_id);
	}


	@Override
	public void deleteMenuById(int menu_id) {
		menuRepository.deleteById(menu_id);
		
	}

}

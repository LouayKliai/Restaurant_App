package com.example.demo.option;

import java.util.List;

import com.example.demo.menu.Menu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter

public class Option {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String price;
	private String description;
	//menu_id int 
	@ManyToMany(mappedBy = "options")
	private List<Menu> menus;
	
}

package com.example.demo.option;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
	//@ManyToMany
	//private Menu menu;
	
}

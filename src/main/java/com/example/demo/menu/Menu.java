package com.example.demo.menu;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Menu {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String title;
	private int option_id;
			

}
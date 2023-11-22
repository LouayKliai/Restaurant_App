package com.example.demo.menu;

import com.example.demo.option.Option;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
	//private int option_id;
	//@ManyToMany
	//private Option option;
			

}

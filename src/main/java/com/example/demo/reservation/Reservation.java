package com.example.demo.reservation;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
public class Reservation {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private Date date;
	private int client_number;
	private String time;
	private boolean is_allergy;
	private String lastName;
	private String firstName;
	private String phone;
	private String email;
			
}

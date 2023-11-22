package com.example.demo.user;

import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique=true)
	private String email;
	private String password;
	private String lastName;
	private String firstName;
	private Date date;
	private int client_number;
	private String time;
	private String phone;
	private boolean is_allergy;
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date created_at;
	
	
			
			
	
}

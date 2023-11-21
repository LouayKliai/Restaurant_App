package com.example.demo.schedule;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
@Setter
@Getter
public class Schedule {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String monday;
	private String tuesday;
	private String wednesday;
	private String thursday;
	private String friday;
	private String saturday;
	private String sunday ;
	private String evmonday;
	private String evtuesday;
	private String evwednesday;
	private String evthursday;
	private String evfriday;
	private String evsaturday;
	private String evsunday;

}

package com.example.demo.reservation;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	List<Reservation> findReservationByDate(Date reservation_date);
	List<Reservation> findReservationByTime(Date reservation_time);
	List<Reservation> findReservationByFirstName(String reservation_firstName);
	List<Reservation> findReservationByLastName(String reservation_lastName);
	Reservation findReservationByPhone(String reservation_phone);
	Reservation findReservationByEmail(String reservation_email);
	List<Reservation> findReservationByAllergy(boolean reservation_allergy);
	Reservation findReservationByClientNumber(int reservation_clientNumber);
	void deleteAllReservation();
	void deleteReservationById(int reservation_id);
	Reservation createReservation(Reservation reservation);
	
}

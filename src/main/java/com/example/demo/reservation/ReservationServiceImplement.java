package com.example.demo.reservation;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ReservationServiceImplement implements ReservationService {
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation findReservationById(int reservation_id) {
		return reservationRepository.findById(reservation_id).orElse(null);
	}

	@Override
	public List<Reservation> findReservationByDate(Date reservation_date) {
		return reservationRepository.findReservationByDate(reservation_date);
	}

	@Override
	public List<Reservation> findReservationByTime(Date reservation_time) {
		return reservationRepository.findReservationByTime(reservation_time);
		
	}

	@Override
	public List<Reservation> findReservationByFirstName(String reservation_firstName) {
		return reservationRepository.findReservationByFirstName(reservation_firstName);
	}

	@Override
	public List<Reservation> findReservationByLastName(String reservation_lastName) {
		return reservationRepository.findReservationByLastName(reservation_lastName);
	}

	@Override
	public Reservation findReservationByPhone(String reservation_phone) {
		return reservationRepository.findReservationByPhone(reservation_phone);
	}

	@Override
	public Reservation findReservationByEmail(String reservation_email) {
		return reservationRepository.findReservationByEmail(reservation_email));
	}

	@Override
	public List<Reservation> findReservationByAllergy(boolean reservation_allergy) {
		return reservationRepository.findReservationByAllergy(reservation_allergy);
	}

	@Override
	public Reservation findReservationByClientNumber(int reservation_clientNumber) {
		return reservationRepository.findReservationByClientNumber(reservation_clientNumber);
	}

	@Override
	public void deleteAllReservation() {
		reservationRepository.deleteAll();
	}

	@Override
	public void deleteReservationById(int reservation_id) {
		reservationRepository.deleteById(reservation_id);
	}

	@Override
	public Reservation createReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}

}

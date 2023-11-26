package com.example.demo.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ScheduleServiceImplement implements ScheduleService{

	@Autowired
	ScheduleRepository scheduleRepository;
	
	@Override
	public Schedule findById(int id) {
		return scheduleRepository.findById(id).orElse(null);
	}

	@Override
	public List<Schedule> findByMonday(String monday) {
		
		return scheduleRepository.findByMonday(monday);
	}

	@Override
	public List<Schedule> findByTuesday(String tuesday) {
		return scheduleRepository.findByTuesday(tuesday) ;
	}

	@Override
	public List<Schedule> findByWednesday(String wednesday) {
		return scheduleRepository.findByEvWednesday(wednesday);
	}

	@Override
	public List<Schedule> findByThursday(String thursday) {
		return scheduleRepository.findByThursday(thursday);
	}

	@Override
	public List<Schedule> findByFriday(String friday) {
		return scheduleRepository.findByFriday(friday);
	}

	@Override
	public List<Schedule> findBySaturday(String saturday) {
		return scheduleRepository.findBySaturday(saturday);
	}

	@Override
	public List<Schedule> findBySunday(String sunday) {
		return scheduleRepository.findBySunday(sunday);
	}

	@Override
	public List<Schedule> findByEvMonday(String ev_monday) {
		return scheduleRepository.findByEvMonday(ev_monday);
	}

	@Override
	public List<Schedule> findByEvTuesday(String ev_tuesday) {
		return scheduleRepository.findByEvTuesday(ev_tuesday);
	}

	@Override
	public List<Schedule> findByEvWednesday(String ev_wednesday) {
		return scheduleRepository.findByEvWednesday(ev_wednesday);
	}

	@Override
	public List<Schedule> findByEvThursday(String ev_thursday) {
		return scheduleRepository.findByEvThursday(ev_thursday)h;
	}

	@Override
	public List<Schedule> findByEvFriday(String ev_friday) {
		return scheduleRepository.findByEvFriday(ev_friday);
	}

	@Override
	public List<Schedule> findByEvSaturday(String ev_saturday) {
		return scheduleRepository.findByEvSaturday(ev_saturday);
	}

	@Override
	public List<Schedule> findByEvSunday(String ev_sunday) {
		return scheduleRepository.findByEvSunday(ev_sunday);
	}

	@Override
	public void deleteScheduleById(int schedule_id) {
		scheduleRepository.deleteById(schedule_id);
		
	}

	@Override
	public Schedule createSchedule(Schedule schedule) {
		return scheduleRepository.save(schedule);
	}

	@Override
	public Schedule updateSchedule(int schedue_id, Schedule schedule) {
		return scheduleRepository.updateSchedule(schedue_id, schedule);
	}

}

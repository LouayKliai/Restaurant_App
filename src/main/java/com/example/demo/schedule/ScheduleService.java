package com.example.demo.schedule;

import java.util.List;

public interface ScheduleService {
	Schedule findById(int id);
	List<Schedule>findByMonday(String monday);
	List<Schedule>findByTuesday(String tuesday);
	List<Schedule>findByWednesday(String wednesday);
	List<Schedule>findByThursday(String thursday);	
	List<Schedule>findByFriday(String friday);	
	List<Schedule>findBySaturday(String saturday);	
	List<Schedule>findBySunday(String sunday);	
	List<Schedule>findByEvMonday(String ev_monday);	
	List<Schedule>findByEvTuesday(String ev_tuesday);	
	List<Schedule>findByEvWednesday(String ev_wednesday);	
	List<Schedule>findByEvThursday(String ev_thursday);	
	List<Schedule>findByEvFriday(String ev_friday);	
	List<Schedule>findByEvSaturday(String ev_saturday);	
	List<Schedule>findByEvSunday(String ev_sunday);
	void deleteScheduleById(int schedule_id);
	Schedule createSchedule(Schedule schedule);
	Schedule updateSchedule(int schedue_id,Schedule schedule);

}

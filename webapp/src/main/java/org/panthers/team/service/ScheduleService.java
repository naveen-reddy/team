package org.panthers.team.service;

import org.panthers.team.model.Schedule;
import org.panthers.team.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;

    //set schedule
    public  void setSchedule(Schedule schedule){
        scheduleRepository.save(schedule);
    }
    //get full schedule
    public Set<Schedule> getAllSchedules(){
        return scheduleRepository.findSchedulesByIdNotNull();
    }

    //get schedule based on place
    public List<Schedule> getAllSchedulesByMatchPlace(String matchPlace){
        return scheduleRepository.findScheduleByMatchPlace(matchPlace);
    }
    //get schedule based on the date
    public Set<Schedule> getAllSchedulesByMatchDate(Date date){
        return scheduleRepository.findScheduleByMatchDate(date);
    }
    //get schedule based on the guest team
    public List<Schedule> getAllSchedulesByGuestTeam(String guestTeam){
        return scheduleRepository.findScheduleByGuestTeam(guestTeam);
    }
    //get schedule based on the home team
    public List<Schedule> getAllSchedulesByHomeTeam(String homeTeam){
        return scheduleRepository.findScheduleByHomeTeam(homeTeam);
    }

}

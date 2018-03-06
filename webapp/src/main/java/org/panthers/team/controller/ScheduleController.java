package org.panthers.team.controller;

import org.panthers.team.model.Schedule;
import org.panthers.team.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

@RestController
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    //set a schedule
    @PostMapping("/schedule")
    public void setSchedule(@RequestBody Schedule schedule){
        scheduleService.setSchedule(schedule);
    }

    //get list of schedule for panthers team
    @GetMapping("/team/schedule")
    @ResponseBody
    public Set<Schedule> getAllSchedules(){
        return scheduleService.getAllSchedules();
    }
    //get list of schedule based on the place
    @GetMapping("/team/place/{matchPlace}")
    @ResponseBody
    public List<Schedule> getScheduleByMatchPlace(@PathVariable String matchPlace){
        return scheduleService.getAllSchedulesByMatchPlace(matchPlace);
    }
    //get list of schedule based on the date
    @GetMapping("/team/date/{matchDate}")
    @ResponseBody
    public Set<Schedule> getScheduleByMatchDate(@PathVariable Date matchDate){
        return scheduleService.getAllSchedulesByMatchDate(matchDate);
    }
    //get list of schedule based on the guest team
    @GetMapping("/team/place/{guestTeam}")
    @ResponseBody
    public List<Schedule> getScheduleByMatchGuestTeam(String guestTeam){
        return scheduleService.getAllSchedulesByGuestTeam(guestTeam);
    }
    //get list of schedule based on the home team
    @GetMapping("/team/place/{homeTeam}")
    @ResponseBody
    public List<Schedule> getScheduleByMatchHomeTeam(String homeTeam){
        return scheduleService.getAllSchedulesByHomeTeam(homeTeam);
    }
}

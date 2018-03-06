package org.panthers.team.repositories;

import org.panthers.team.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Set;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

    //get all schedules for this team
    public Set<Schedule> findSchedulesByIdNotNull();
    //find schedule based on the date
    public Set<Schedule> findScheduleByMatchDate(Date date);
    //find schedule based on the place
    public List<Schedule> findScheduleByMatchPlace(String place);
    //find schedule based on the guest team
    public List<Schedule> findScheduleByGuestTeam(String teamName);
    //find schedule based on the home team
    public List<Schedule> findScheduleByHomeTeam(String teamName);
}

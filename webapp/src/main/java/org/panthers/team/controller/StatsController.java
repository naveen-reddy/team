package org.panthers.team.controller;

import org.panthers.team.model.Stats;
import org.panthers.team.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Set;

public class StatsController {

        @Autowired
        StatsService statsService;

        //set stats

        //get the stats of panthers team
        @GetMapping("/stats")
        public Set<Stats> getStatsOfAllTeam(){
            return statsService.getStatsForEntireTeam();
        }

        //get stats based on the batsment name
        @GetMapping("/stats/{firstName}")
        public Stats getStatsByPerson(@PathVariable String firstName){
            return statsService.getStatsByFirstName(firstName);
        }
}

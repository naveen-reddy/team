package org.panthers.team.service;

import org.panthers.team.model.Stats;
import org.panthers.team.repositories.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StatsService {

    @Autowired
    StatsRepository statsRepository;

    public Stats getStatsByFirstName(String firstName){
        return statsRepository.findStatsByPlayer_FirstName(firstName);
    }

    public Set<Stats> getStatsForEntireTeam(){
        return statsRepository.findAllByPlayerNotNull();
    }
}

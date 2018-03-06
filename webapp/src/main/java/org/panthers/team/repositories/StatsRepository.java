package org.panthers.team.repositories;

import org.panthers.team.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface StatsRepository extends JpaRepository<Stats, Integer>{
    //get stats by first name
    public Stats findStatsByPlayer_FirstName(String firstName);
    //get stats for entire team
    public Set<Stats> findAllByPlayerNotNull();
}

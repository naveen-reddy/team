package org.panthers.team.service;

import org.panthers.team.model.Player;
import org.panthers.team.repositories.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PlayersService {

    @Autowired
    PlayersRepository playersRepository;

    //get all players in the team
    public Set<Player> getAllPlayersInTeam(){
        return playersRepository.getPlayersByIdNotNull();
    }

    //get players by first name
    public Set<Player> getAllPlayersInTeamByFirstName(String firstName){
        return playersRepository.getPlayersByFirstName(firstName);
    }
    //get players by last name
    public Set<Player> getAllPlayersInTeamByLastName(String lastName){
        return playersRepository.getPlayersByLastName(lastName);
    }

    //get players by role
    public Set<Player> getAllPlayersInTeamByRole(String role){
        return playersRepository.getPlayersByRole(role);
    }

}

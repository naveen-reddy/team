package org.panthers.team.controller;

import org.panthers.team.model.Player;
import org.panthers.team.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class TeamController {

    @Autowired
    PlayersService playersService;

    //set players

    //get list of all players in the team
    @GetMapping("/team")
    @ResponseBody
    public Set<Player> getallMembersInTheTeam(){
        return playersService.getAllPlayersInTeam();
    }

    //get list of players based on the first name
    @GetMapping("/team/getByFirstName/{firstName}")
    @ResponseBody
    public Set<Player> getallMembersInTheTeamByFirstName(@PathVariable String firstName){
        return playersService.getAllPlayersInTeamByFirstName(firstName);
    }

    //get list of players based on the last name
    @GetMapping("/team/getByLastName/{lastName}")
    @ResponseBody
    public Set<Player> getallMembersInTheTeamByLastName(@PathVariable String lastName){
        return playersService.getAllPlayersInTeamByLastName(lastName);
    }
    //get list of players based on the role
    @GetMapping("/team/getByRole/{role}")
    @ResponseBody
    public Set<Player> getallMembersInTheTeamByRole(@PathVariable String role){
        return playersService.getAllPlayersInTeamByRole(role);
    }
}

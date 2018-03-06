package org.panthers.team.repositories;

import org.panthers.team.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface PlayersRepository extends JpaRepository<Player, Integer> {

    //get all players but unique ones
    public Set<Player> getPlayersByIdNotNull();
    //get players by first name
    public Set<Player> getPlayersByFirstName(String firstName);
    //get players by last name
    public Set<Player> getPlayersByLastName(String lastName);
    //get players by role
    public Set<Player> getPlayersByRole(String role);

}

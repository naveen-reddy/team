package org.panthers.team.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "TEAM")
public class Team {

    @Id
    @GeneratedValue
    int id;

    @Column(name = "TEAM_NAME")
    String teamName;

    @Column(name = "TEAM_IMAGE")
    byte[] teamImage;

    public Team() {
    }

    public Team(String teamName, byte[] teamImage) {
        this.teamName = teamName;
        this.teamImage = teamImage;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public byte[] getTeamImage() {
        return teamImage;
    }

    public void setTeamImage(byte[] teamImage) {
        this.teamImage = teamImage;
    }
}

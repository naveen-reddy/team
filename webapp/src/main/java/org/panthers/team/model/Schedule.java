package org.panthers.team.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SCHEDULE")
public class Schedule {

    @Id
    @GeneratedValue
    int id;

    @Column(name = "MATCH_NUMBER")
    String matchNumber;

    @Basic
    @Temporal(TemporalType.DATE)
    @Column(name = "MATCH_DATE")
    java.util.Date matchDate;

    @Basic
    @Temporal(TemporalType.TIME)
    @Column(name = "MATCH_TIME")
    java.util.Date matchTime;

    @Column(name = "MATCH_PLACE")
    String matchPlace;

    @OneToOne(cascade = CascadeType.ALL)
//    @Column(name = "HOME_TEAM")
    Team homeTeam;

    @OneToOne(cascade = CascadeType.ALL)
//    @Column(name = "GUEST_TEAM")
    Team guestTeam;

    public Schedule() {
    }

    public Schedule(String matchNumber, Date matchDate, Date matchTime, String matchPlace, Team homeTeam, Team guestTeam) {
        this.matchNumber = matchNumber;
        this.matchDate = matchDate;
        this.matchTime = matchTime;
        this.matchPlace = matchPlace;
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(String matchNumber) {
        this.matchNumber = matchNumber;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
    public Date getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }

    public String getMatchPlace() {
        return matchPlace;
    }

    public void setMatchPlace(String matchPlace) {
        this.matchPlace = matchPlace;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getGuestTeam() {
        return guestTeam;
    }

    public void setGuestTeam(Team guestTeam) {
        this.guestTeam = guestTeam;
    }
}

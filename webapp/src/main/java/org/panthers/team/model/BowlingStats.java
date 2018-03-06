package org.panthers.team.model;

import javax.persistence.*;

@Entity
@Table(name = "BOWLING_STATS")
public class BowlingStats {

    @Id
    @GeneratedValue
    int id;
    @Column(name = "INNINGS")
    int innings;
    @Column(name = "WICKETS")
    int wickets;
    @Column(name = "ECONOMY")
    double economy;
    @Column(name = "AVERAGE")
    double average;
    @Column(name = "MAIDENS")
    int maidens;
    @Column(name = "STRIKE_RATE")
    double strikeRate;
    @OneToOne
    Stats stats;

    public BowlingStats() {
    }

    public BowlingStats(int innings, int wickets, double economy, double average, int maidens, double strikeRate, Stats stats) {
        this.innings = innings;
        this.wickets = wickets;
        this.economy = economy;
        this.average = average;
        this.maidens = maidens;
        this.strikeRate = strikeRate;
        this.stats = stats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public double getEconomy() {
        return economy;
    }

    public void setEconomy(double economy) {
        this.economy = economy;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getMaidens() {
        return maidens;
    }

    public void setMaidens(int maidens) {
        this.maidens = maidens;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}

package org.panthers.team.model;

import org.hibernate.annotations.Columns;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "BATTING_STATS")
public class BattingStats {

    @Id
    @GeneratedValue
    int id;
    @Column(name = "INNINGS")
    int innigns;
    @Column(name = "RUNS")
    int runs;
    @Column(name = "HIGH_SCORE")
    int highScore;
    @Column(name = "BATTING_AVERAGE")
    double battingAvergae;
    @Column(name = "STRIKE_RATE")
    double strikeRate;
    @Column(name = "HUNDREADS")
    int hundreads;
    @Column(name = "FIFTYEES")
    int fiftyees;
    @OneToOne
    Stats stats;

    public BattingStats() {
    }

    public BattingStats(int innigns, int runs, int highScore, double battingAvergae, double strikeRate, int hundreads, int fiftyees, Stats stats) {
        this.innigns = innigns;
        this.runs = runs;
        this.highScore = highScore;
        this.battingAvergae = battingAvergae;
        this.strikeRate = strikeRate;
        this.hundreads = hundreads;
        this.fiftyees = fiftyees;
        this.stats = stats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInnigns() {
        return innigns;
    }

    public void setInnigns(int innigns) {
        this.innigns = innigns;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public double getBattingAvergae() {
        return battingAvergae;
    }

    public void setBattingAvergae(double battingAvergae) {
        this.battingAvergae = battingAvergae;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    public int getHundreads() {
        return hundreads;
    }

    public void setHundreads(int hundreads) {
        this.hundreads = hundreads;
    }

    public int getFiftyees() {
        return fiftyees;
    }

    public void setFiftyees(int fiftyees) {
        this.fiftyees = fiftyees;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}

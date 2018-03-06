package org.panthers.team.model;

import javax.persistence.*;

@Entity
@Table(name = "STATISTICS")
public class Stats {

    @Id
    @GeneratedValue
    int id;
    @OneToOne
    BowlingStats bowlingStats;
    @OneToOne
    BattingStats battingStats;
    @OneToOne
    Player player;

    public Stats() {
    }

    public Stats(BowlingStats bowlingStats, BattingStats battingStats, Player player) {
        this.bowlingStats = bowlingStats;
        this.battingStats = battingStats;
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BowlingStats getBowlingStats() {
        return bowlingStats;
    }

    public void setBowlingStats(BowlingStats bowlingStats) {
        this.bowlingStats = bowlingStats;
    }

    public BattingStats getBattingStats() {
        return battingStats;
    }

    public void setBattingStats(BattingStats battingStats) {
        this.battingStats = battingStats;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

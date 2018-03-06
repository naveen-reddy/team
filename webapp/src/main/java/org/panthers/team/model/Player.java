package org.panthers.team.model;

import javax.persistence.*;

@Entity
@Table(name = "PLAYER")
public class Player {

    @Id
    @GeneratedValue
    int id;
    @Column(name = "FIRST_NAME", nullable = false, unique = true)
    String firstName;
    @Column(name = "LAST_NAME", nullable = false)
    String lastName;
    @Column(name = "ROLE")
    String role;
    @Lob
    @Column(name = "IMAGE")
    byte[] playerImage;
    @OneToOne
    PlayerPhoto playerPhoto;
    @OneToOne
    Stats stats;

    public Player() {
    }

    public Player(String firstName, String lastName, String role, byte[] playerImage, PlayerPhoto playerPhoto, Stats stats) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.playerImage = playerImage;
        this.playerPhoto = playerPhoto;
        this.stats = stats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public byte[] getPlayerImage() {
        return playerImage;
    }

    public void setPlayerImage(byte[] playerImage) {
        this.playerImage = playerImage;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public PlayerPhoto getPlayerPhoto() {
        return playerPhoto;
    }

    public void setPlayerPhoto(PlayerPhoto playerPhoto) {
        this.playerPhoto = playerPhoto;
    }
}

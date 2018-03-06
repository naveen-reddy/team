package org.panthers.team.model;

import javax.persistence.*;

@Entity
@Table(name = "PLAYER_PHOTO")
public class PlayerPhoto {
    @Id
    @GeneratedValue
    int id;
    @Column(name = "PHOTO")
    byte[] photo;
    @OneToOne
    Player player;

    public PlayerPhoto() {
    }

    public PlayerPhoto(byte[] photo, Player player) {
        this.photo = photo;
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

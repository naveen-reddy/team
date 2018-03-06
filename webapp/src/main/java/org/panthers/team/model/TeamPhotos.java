package org.panthers.team.model;

import javax.persistence.*;

@Entity
@Table(name = "TEAM_PHOTOS")
public class TeamPhotos {

    @Id
    @GeneratedValue
    int id;

    @Lob
    @Column(name = "PHOTO")
    byte[] photo;

    public TeamPhotos() {
    }

    public TeamPhotos(byte[] photo) {
        this.photo = photo;
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
}

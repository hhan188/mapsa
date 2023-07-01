package org.MapsaPractice.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Artist")
public class Artist implements Serializable {
    public Artist() {
    }

    public Artist(int artistId, String artistName, String bio, String nationality) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.bio = bio;
        this.nationality = nationality;
    }

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artistId;
    @Column
    private String artistName;
    @Column
    private String bio;
    @Column
    private String nationality;

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", artistName='" + artistName + '\'' +
                ", bio='" + bio + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

}

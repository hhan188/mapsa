package org.mapsa.entities.practice22.Artist;

import javax.persistence.*;

@Entity
@Table(name="Artist")

public class Artist {
    public Artist() {
    }

    @Id
    @Column (name="artist_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer artist_id;

    @Column(name="name")
    private String name;

    @Column (name="bio")
    private String bio;


    @Column (name="nationality")
    private String nationality;

    public Integer getArtistId() {
        return artist_id;
    }

    public void setArtistId(Integer artistId) {
        this.artist_id = artistId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Artist( String name, String bio, String nationality) {
        this.name = name;
        this.bio = bio;
        this.nationality = nationality;
    }


    @Override
    public String toString() {
        return "Artist{" +
                "artistId='" + artist_id + '\'' +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

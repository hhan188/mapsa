package org.mapsa.entities.practice22.Artist;

import org.mapsa.entities.practice22.Album.Album;
import org.mapsa.entities.practice23.Artist_detail;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="artist")

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

    @OneToOne(mappedBy = "artist",cascade=CascadeType.ALL)
    private Artist_detail artist_detail;


    @ManyToMany
    @JoinTable(name="artists_albums",joinColumns = @JoinColumn(name="artist_id"),inverseJoinColumns = @JoinColumn(name="album_id"))
    List<Album> albums=new ArrayList<>();

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public Artist_detail getArtist_detail() {
        return artist_detail;
    }

    public void setArtist_detail(Artist_detail artist_detail) {
        this.artist_detail = artist_detail;
    }

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

    public Artist(String name, String bio, String nationality) {
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

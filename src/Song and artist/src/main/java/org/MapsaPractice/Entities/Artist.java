package org.MapsaPractice.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Artist")
public class Artist implements Serializable {
    public Artist() {
    }
    @Id
    @Column(name = "artist_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artistId;
    @Column
    private String artistName;
    @Column
    private String bio;
    @Column
    private String nationality;
    @OneToOne(mappedBy = "artist",cascade = CascadeType.ALL)
    private ArtistDetail artistDetail;

    @ManyToMany(mappedBy = "artistLists")
    private List<Album> albumList = new ArrayList<>();

    public Artist(String artistName, String bio, String nationality) {
        this.artistName = artistName;
        this.bio = bio;
        this.nationality = nationality;

    }

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

    public ArtistDetail getArtistDetail() {
        return artistDetail;
    }

    public void setArtistDetail(ArtistDetail artistDetail) {
        this.artistDetail = artistDetail;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", artistName='" + artistName + '\'' +
                ", bio='" + bio + '\'' +
                ", nationality='" + nationality + '\'' +
                ", artistDetail=" + artistDetail +
                ", albumList=" + albumList +
                '}';
    }
}

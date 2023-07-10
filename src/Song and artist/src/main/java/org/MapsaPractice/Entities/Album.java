package org.MapsaPractice.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "Albume")
public class Album implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "album_Id")
    private Integer albumeId;
    @Column
    private String title;
    @Temporal(TemporalType.DATE)
    @Column
    private Date releaseDate;
    @Column
    private String artist;
    @OneToMany(mappedBy = "album",cascade = CascadeType.ALL)
    private List<Song> songs = new ArrayList<>();
    @ManyToMany(cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
            name = "artist_album",
            joinColumns = @JoinColumn(name = "album_id"),
            inverseJoinColumns = @JoinColumn(name = "artist_id")
    )
    private List<Artist> artistLists = new ArrayList<>();

    public Album(String title, Date releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }
    public Album() {
    }

    public Integer getAlbumeId() {
        return albumeId;
    }

    public void setAlbumeId(Integer albumeId) {
        this.albumeId = albumeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public List<Artist> getArtistLists() {
        return artistLists;
    }

    public void setArtistLists(List<Artist> artistLists) {
        this.artistLists = artistLists;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", artist='" + artist + '\'' +
                ", songs=" + songs +
                ", artistLists=" + artistLists +
                '}';
    }
}


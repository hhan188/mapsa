package org.MapsaPractice.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = "Albume")
public class Album implements Serializable {
    public Album() {
    }

    public Album(int albumeId, String title, Date releaseDate, String artist) {
        this.albumeId = albumeId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.artist = artist;
    }

    @Id
    @Column(name = "AlbumeId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int albumeId;
    @Column
    private String title;
    @Column
    private Date releaseDate;
    @Column
    private String artist;

    public int getAlbumeId() {
        return albumeId;
    }

    public void setAlbumeId(int albumeId) {
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

    @Override
    public String toString() {
        return "Album{" +
                "albumeId=" + albumeId +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", artist='" + artist + '\'' +
                '}';
    }
}


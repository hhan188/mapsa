package org.mapsa.entities.practice22.Album;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table (name="Album")

public class Album {
    public Album() {
    }

    @Id
    @Column (name="album_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer albumId;
    @Column (name="title")
    private String title;
    @Column (name="release_date")
    private String releaseDate;
    @Column (name="artist")
    private String artist;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Album(String title, String releaseDate, String artist) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}

package practice23.Album;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import practice23.Artist.Artist;
import org.mapsa.entities.practice22.Song.Song;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table (name="Album")

public class Album implements Serializable {
    public Album() {
    }
    @Id
    @Column (name="album_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer albumId;
    @Column (name="title")
    private String title;
    @Column (name="release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Column (name="artist")
    private String artist;


    @OneToMany(mappedBy = "album",cascade =CascadeType.ALL)
    private List<Song> songs=new ArrayList<>();



    @ManyToMany(mappedBy = "albums",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Artist> artists=new ArrayList<>();


    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

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

    public Album(String title, Date releaseDate, String artist) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
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
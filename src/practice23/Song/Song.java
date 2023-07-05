package practice23.Song;

import org.mapsa.entities.practice23.Album.Album;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="song")

public class Song implements Serializable {
    public Song() {
    }



    public Song(String title, String duration, Date releaseDate, String genre, String file_Path) {
        this.title = title;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.file_Path=file_Path;
    }

    @Id
    @Column(name="song_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer songId;

    @Column(name = "title")
    private String title;


    @Column(name="duration")
    private String duration;


    @Column(name="release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Column(name="genre")
    private String genre;


    @Column(name="file_Path")
    private String file_Path;


    @ManyToOne
    @JoinColumn(name="album_id")
    private Album album;


    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Integer getSongId() {
        return songId;
    }

    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFile_Path() {
        return file_Path;
    }

    public void setFile_Path(String file_Path) {
        this.file_Path = file_Path;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", genre='" + genre + '\'' +
                ", file_Path='" + file_Path + '\'' +
                '}';
    }
}

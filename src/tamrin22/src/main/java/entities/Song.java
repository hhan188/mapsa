package entities;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Songs")
public class Song implements Serializable {

    //Fields ----------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "songId", nullable = false, unique = true)
    private Integer songId;

    @Column(name = "title", columnDefinition = "VARCHAR(220) NOT NULL ")
    private String title;

    @Column(name = "duration",columnDefinition = "INT ")
    private Integer duration;

    @Column(name = "releaseDate",columnDefinition = "DATETIME(6) ")
    private Date releaseDate;

    @Column(name = "genre",columnDefinition = "VARCHAR(30) ")
    private String genre;

    @Column(name = "filePath",columnDefinition = "VARCHAR(255) NOT NULL ")
    private String filePath;

    @ManyToOne(targetEntity = Album.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "albumId",nullable = false, referencedColumnName = "albumId")
    private Album album;


    //Constructors ----------------------
    public Song() {

    }

    public Song(String title, Album album, String filePath) {
        this.title = title;
        this.album = album;
        this.filePath = filePath;
    }

    //Getters ----------------------
    public Integer getSongId() {
        return songId;
    }

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public String getFilePath() {
        return filePath;
    }

    //Setters ----------------------
    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", releaseDate=" + releaseDate +
                ", genre='" + genre + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}

package SoheylSayyah.Practice24Part2;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Song implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "song_id")
    private Integer songId;
    @Column(name = "title")
    private String title;
    @Column(name = "duration")
    private String duration;
    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Column(name = "genre")
    private String genre;
    @Column(name = "file_path")
    private String filePath;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "album_id")
    private Album album;

    public Song(String title, String duration, Date releaseDate, String genre, String filePath)
    {
        this.title = title;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.filePath = filePath;
    }

    public Integer getSongId()
    {
        return songId;
    }

    public void setSongId(Integer songId)
    {
        this.songId = songId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDuration()
    {
        return duration;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    public Date getReleaseDate()
    {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public String getFilePath()
    {
        return filePath;
    }

    public void setFilePath(String filePath)
    {
        this.filePath = filePath;
    }

    public Album getAlbum()
    {
        return album;
    }

    public void setAlbum(Album album)
    {
        this.album = album;
    }

    @Override
    public String toString()
    {
        return "Song{" +
                "songId=" + songId +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", releaseDate=" + releaseDate +
                ", genre='" + genre + '\'' +
                ", filePath='" + filePath + '\'' +
                ", album=" + album +
                '}';
    }
}

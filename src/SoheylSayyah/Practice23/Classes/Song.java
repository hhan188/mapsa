package SoheylSayyah.Practice23.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "Song")
public class Song implements Serializable {
    @Id
    @Column(name = "song_id")
    private Integer songId;
    @Column(name = "title")
    private String title;
    @Column(name = "duration")
    private String duration;
    @Column(name = "release_date")
    private String releaseDate;
    @Column(name = "genre")
    private String genre;
    @Column(name = "file_path")
    private String filePath;
    public Song()
    {
    }
    public Song(Integer songId, String title, String duration, String releaseDate, String genre, String filePath)
    {
        this.songId = songId;
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
    public String getReleaseDate()
    {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate)
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
    @Override
    public String toString()
    {
        return "Song{" +
                "songId=" + songId +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", genre='" + genre + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}

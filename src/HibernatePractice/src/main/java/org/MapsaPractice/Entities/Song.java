package org.MapsaPractice.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "Song")
public class Song implements Serializable {
    public Song() {
    }

    public Song(int songId, String title, String duration, Date releasDate, String gener, String filepath) {
        this.songId = songId;
        this.title = title;
        this.duration = duration;
        this.releasDate = releasDate;
        this.gener = gener;
        this.filepath = filepath;
    }

    @Id
    @Column(name = "SongId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int songId;
    @Column
    private String title;
    @Column
    private String duration;
    @Column
    private Date releasDate;
    @Column
    private String gener;
    @Column
    private String filepath;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
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

    public Date getReleasDate() {
        return releasDate;
    }

    public void setReleasDate(Date releasDate) {
        this.releasDate = releasDate;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public String toString() {
        return "Album{" +
                "songId=" + songId +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", releasDate=" + releasDate +
                ", gener='" + gener + '\'' +
                ", filepath='" + filepath + '\'' +
                '}';
    }

}

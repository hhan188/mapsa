package SoheylSayyah.Practice23.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "Album")
public class Album implements Serializable {
    @Id
    @Column(name = "album_id")
    private Integer albumId;
    @Column(name = "title")
    private String title;
    @Column(name = "release_date")
    private String releaseDate;
    @Column(name = "artist")
    private String artist;
    public Album()
    {
    }
    public Album(Integer albumId, String title, String releaseDate, String artist)
    {
        this.albumId = albumId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.artist = artist;
    }
    public Integer getAlbumId()
    {
        return albumId;
    }
    public void setAlbumId(Integer albumId)
    {
        this.albumId = albumId;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getReleaseDate()
    {
        return releaseDate;
    }
    public void setReleaseDate(String releaseDate)
    {
        this.releaseDate = releaseDate;
    }
    public String getArtist()
    {
        return artist;
    }
    public void setArtist(String artist)
    {
        this.artist = artist;
    }
    @Override
    public String toString()
    {
        return "Album{" +
                "albumId=" + albumId +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}

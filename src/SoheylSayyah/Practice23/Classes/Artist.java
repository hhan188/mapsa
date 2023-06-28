package SoheylSayyah.Practice23.Classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "Artist")
public class Artist implements Serializable {
    @Id
    @Column(name = "artist_id")
    private Integer artistId;
    @Column(name = "name")
    private String name;
    @Column(name = "bio")
    private String bio;
    @Column(name = "nationality")
    private String nationality;
    public Artist()
    {
    }
    public Artist(Integer artistId, String name, String bio, String nationality)
    {
        this.artistId = artistId;
        this.name = name;
        this.bio = bio;
        this.nationality = nationality;
    }
    public Integer getArtistId()
    {
        return artistId;
    }
    public void setArtistId(Integer artistId)
    {
        this.artistId = artistId;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBio()
    {
        return bio;
    }
    public void setBio(String bio)
    {
        this.bio = bio;
    }
    public String getNationality()
    {
        return nationality;
    }
    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }
    @Override
    public String toString()
    {
        return "Artist{" +
                "artistId=" + artistId +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

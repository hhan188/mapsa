package SoheylSayyah.Practice24Part2;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Artist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private Integer artistId;
    @Column(name = "name")
    private String name;
    @Column(name = "bio")
    private String bio;
    @Column(name = "nationality")
    private String nationality;
    @OneToOne(mappedBy = "artist" , cascade = CascadeType.ALL)
    private Artist_Detail artistDetail;
    @ManyToMany(mappedBy = "artists" , cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
    private List<Album> albums = new ArrayList<>();

    public Artist(String name, String bio, String nationality)
    {
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

    public Artist_Detail getArtistDetail()
    {
        return artistDetail;
    }

    public void setArtistDetail(Artist_Detail artistDetail)
    {
        this.artistDetail = artistDetail;
    }

    public List<Album> getAlbums()
    {
        return albums;
    }

    public void setAlbums(List<Album> albums)
    {
        this.albums = albums;
    }

    @Override
    public String toString()
    {
        return "Artist{" +
                "artistId=" + artistId +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", nationality='" + nationality + '\'' +
                ", artistDetail=" + artistDetail +
                ", albums=" + albums +
                '}';
    }
}

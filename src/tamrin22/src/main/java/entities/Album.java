package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "albumId")
    private Integer albumId;

    @Column(name = "title", columnDefinition = "VARCHAR(100) NOT NULL ")
    private String title;

    @Column(name = "releaseDate", columnDefinition = "DATETIME(6) ")
    private Date releaseDate;

    @ManyToMany
    @JoinTable(name = "Join_Album_Artist"
            , joinColumns = @JoinColumn(name = "album_id")
            , inverseJoinColumns = @JoinColumn(name = "artist_id"))
    private List<Artist> artistList;

    @OneToMany(mappedBy = "album",targetEntity = Song.class
            ,fetch = FetchType.EAGER
            ,cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Song> songList = new ArrayList<>();

    //Constructors ----------------------

    public Album() {
    }

    public Album(String title, List<Artist> artistList) {
        this.title = title;
        this.artistList = artistList ;
    }

    //Getters ----------------------


    public Integer getAlbumId() {
        return albumId;
    }

    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public List<Artist> getArtist() {
        return artistList;
    }

    //Setters ----------------------


    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setArtist(List<Artist> artistList) {
        this.artistList = artistList;
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", artist='" + artistList + '\'' +
                '}';
    }
}

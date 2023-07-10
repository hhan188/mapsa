package entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Artists")
public class Artist implements Serializable {

    //Fields ----------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistId", nullable = false, unique = true)
    private Integer artistId;

    @Column(name = "name", columnDefinition = "VARCHAR(100) NOT NULL ")
    private String name;

    @Column(name = "bio", columnDefinition = "VARCHAR(255) ")
    private String bio;

    @Column(name = "nationality", columnDefinition = "VARCHAR(75) ")
    private String nationality;

    @OneToOne(mappedBy = "artist"
            , orphanRemoval = true)
    private ArtistDetail artistDetail;


    /*    @JoinTable(name = "Join_Artist_Album"
                , joinColumns = @JoinColumn(name = "artist_id")
                , inverseJoinColumns = @JoinColumn(name = "album_id"))*/
    @ManyToMany(mappedBy = "artistList")
    private List<Album> albumList = new ArrayList<>();

    //Constructors ----------------------
    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
    }

    //Getters ----------------------

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public String getNationality() {
        return nationality;
    }

    public Integer getArtistId() {
        return artistId;
    }

    //Setters ----------------------

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}

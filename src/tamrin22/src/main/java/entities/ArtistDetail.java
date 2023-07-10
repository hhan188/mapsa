package entities;

@Entity
public class ArtistDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String preferredInstrument;
    private String awards;
    private String yearsActive;
    private String SocialMedia;
    private String website;

    @OneToOne
    @JoinColumn(name = "artist_id", nullable = false)
    private Artist artist;


    public ArtistDetail() {
    }

    public Integer getId() {
        return id;
    }

    public String getPreferredInstrument() {
        return preferredInstrument;
    }

    public String getAwards() {
        return awards;
    }

    public String getYearsActive() {
        return yearsActive;
    }

    public String getSocialMedia() {
        return SocialMedia;
    }

    public String getWebsite() {
        return website;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPreferredInstrument(String preferedInstrument) {
        this.preferredInstrument = preferedInstrument;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public void setYearsActive(String yearsActive) {
        this.yearsActive = yearsActive;
    }

    public void setSocialMedia(String socialMedia) {
        SocialMedia = socialMedia;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "ArtistDetail{" +
                "id=" + id +
                ", preferedInstrument='" + preferredInstrument + '\'' +
                ", awards='" + awards + '\'' +
                ", yearsActive='" + yearsActive + '\'' +
                ", SocialMedia='" + SocialMedia + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}

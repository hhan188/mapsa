package SoheylSayyah.Practice24Part2;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Artist_Detail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_detail_id")
    private Integer artistDetailId;
    @Column(name = "website")
    private String website;
    @Column(name = "social_media")
    private String socialMedia;
    @Column(name = "awards")
    private Integer awards;
    @Column(name = "years_active")
    private Integer yearsActive;
    @Column(name = "preferred_instrument")
    private String preferredInstrument;
    @OneToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public Artist_Detail(String website, String socialMedia, Integer awards, Integer yearsActive, String preferredInstrument)
    {
        this.website = website;
        this.socialMedia = socialMedia;
        this.awards = awards;
        this.yearsActive = yearsActive;
        this.preferredInstrument = preferredInstrument;
    }

    public Integer getArtistDetailId()
    {
        return artistDetailId;
    }

    public void setArtistDetailId(Integer artistDetailId)
    {
        this.artistDetailId = artistDetailId;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public String getSocialMedia()
    {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia)
    {
        this.socialMedia = socialMedia;
    }

    public Integer getAwards()
    {
        return awards;
    }

    public void setAwards(Integer awards)
    {
        this.awards = awards;
    }

    public Integer getYearsActive()
    {
        return yearsActive;
    }

    public void setYearsActive(Integer yearsActive)
    {
        this.yearsActive = yearsActive;
    }

    public String getPreferredInstrument()
    {
        return preferredInstrument;
    }

    public void setPreferredInstrument(String preferredInstrument)
    {
        this.preferredInstrument = preferredInstrument;
    }

    public Artist getArtist()
    {
        return artist;
    }

    public void setArtist(Artist artist)
    {
        this.artist = artist;
    }

    @Override
    public String toString()
    {
        return "Artist_Detail{" +
                "artistDetailId='" + artistDetailId + '\'' +
                ", website='" + website + '\'' +
                ", socialMedia='" + socialMedia + '\'' +
                ", awards=" + awards +
                ", yearsActive=" + yearsActive +
                ", preferredInstrument='" + preferredInstrument + '\'' +
                ", artist=" + artist +
                '}';
    }
}

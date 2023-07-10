package org.MapsaPractice.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ArtistDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String website;
    @Column
    private String socialMedia;
    @Column
    private Integer awards;
    @Column
    private Integer yearsActivity;
    private String preferredInstance;
    @OneToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public ArtistDetail(String website, String socialMedia, Integer awards, Integer yearsActivity, String preferredInstance) {
        this.website = website;
        this.socialMedia = socialMedia;
        this.awards = awards;
        this.yearsActivity = yearsActivity;
        this.preferredInstance = preferredInstance;
    }

    public String getPreferredInstance() {
        return preferredInstance;
    }

    public void setPreferredInstance(String preferredInstance) {
        this.preferredInstance = preferredInstance;
    }

    public ArtistDetail() {
    }
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    public Integer getAwards() {
        return awards;
    }

    public void setAwards(Integer awards) {
        this.awards = awards;
    }

    public Integer getYearsActivity() {
        return yearsActivity;
    }

    public void setYearsActivity(Integer yearsActivity) {
        this.yearsActivity = yearsActivity;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "ArtistDetail{" +
                "id=" + id +
                ", website='" + website + '\'' +
                ", socialMedia='" + socialMedia + '\'' +
                ", awards=" + awards +
                ", yearsActivity=" + yearsActivity +
                ", preferredInstance='" + preferredInstance + '\'' +
                ", artist=" + artist +
                '}';
    }
}

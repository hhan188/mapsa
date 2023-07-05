package practice23;


import org.mapsa.entities.practice22.Artist.Artist;

import javax.persistence.*;

@Entity
@Table(name="artist_detail")

public class Artist_detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="artist_detail_id")
    private Integer artist_detail_id;


    @Column(name="website")
    private String website;


    @Column (name="social_media")
    private String social_media;

    @Column (name="awards")
    private String awards;


    @Column(name="years_active")
    private Integer years_active;


    @Column(name="preferred_instrument")
    private String preferred_instrument;

    @OneToOne
    @JoinColumn(name="artist_id")
    private Artist artist;


    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Integer getArtist_detail_id() {
        return artist_detail_id;
    }

    public void setArtist_detail_id(Integer artist_detail_id) {
        this.artist_detail_id = artist_detail_id;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSocial_media() {
        return social_media;
    }

    public void setSocial_media(String social_media) {
        this.social_media = social_media;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public Integer getYears_active() {
        return years_active;
    }

    public void setYears_active(Integer years_active) {
        this.years_active = years_active;
    }

    public Artist_detail(String website, String social_media, String awards, Integer years_active) {
        this.website = website;
        this.social_media = social_media;
        this.awards = awards;
        this.years_active = years_active;
    }

    public Artist_detail() {
    }
}

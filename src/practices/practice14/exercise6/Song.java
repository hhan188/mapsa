package practices.practice14.exercise6;

import com.google.gson.Gson;

import java.util.LinkedList;

public class Song {
    private String trackName;
    private Double duration;
    private Integer trackNumber=1;

    public Song(String trackName, Double duration) {
        this.trackName = trackName;
        this.duration = duration;
        this.trackNumber++;
    }

    public Song(String trackName, Double duration, Integer trackNumber) {
        this.trackName = trackName;
        this.duration = duration;
        this.trackNumber = trackNumber;
    }

    public String getTrackName() {
        return trackName;
    }

    public Song setTrackName(String trackName) {
        this.trackName = trackName;
        return this;
    }

    public Double getDuration() {
        return duration;
    }

    public Song setDuration(Double duration) {
        this.duration = duration;
        return this;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public Song setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

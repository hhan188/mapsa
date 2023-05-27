package practices.practice14.exercise46;

import com.google.gson.Gson;

public class Song {

    private String title;
    private double duration;

    public Song() {
    }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

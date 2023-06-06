package practice14.Album;

public class Song {
    private String Title;
    private double duration;

    public Song(String title, double duration) {
        Title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

}

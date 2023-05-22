package practices.practice14.exercise6;

import com.google.gson.Gson;

import java.util.LinkedList;

public class Album {
    private String title;
    private String genre;
    private LinkedList<Song> songs;


    public Album(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Album setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Album setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }

    public Album setSongs(LinkedList<Song> songs) {
        this.songs = songs;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

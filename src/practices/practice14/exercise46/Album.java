package practices.practice14.exercise46;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name, artist;
    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    /*
    methods needs for e
    **/

    public boolean addSong(String title, double duration) {
        return getSongs().add(new Song(title, duration));


    }

    public Song findSong(String title) {
        Song song = new Song();
        for (int i = 0; i < getSongs().size(); i++) {
            if (title.startsWith(getSongs().get(i).getTitle())) {
                song = getSongs().get(i);
            }
        }
        return song;
    }

    public boolean addToPlayList(Integer trackNumber, LinkedList<Song> playlist) {
        if (trackNumber < getSongs().size())
            return playlist.add(getSongs().get(trackNumber));
        else return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        if (getSongs().contains(findSong(title))) {
            return playlist.add(findSong(title));
        }
        return false;
    }


}

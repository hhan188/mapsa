package Prac14.P46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int index, LinkedList<Song> playList) {
        if (index > songs.size()) {
            return false;
        } else {
            Song song = songs.get(index);
            return playList.contains(song) || playList.add(song);
        }
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        return song != null && (playList.contains(song) || playList.add(song));
    }

    private Song findSong(String title) {
        return songs.stream()
                .filter(s -> s.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}

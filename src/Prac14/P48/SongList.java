package Prac14.P48;

import java.util.ArrayList;

public class SongList {
    private ArrayList<Song> songs;

    public SongList() {
        songs = new ArrayList<>();
    }

    public boolean add(Song song) {
        return !songs.contains(song) && songs.add(song);
    }

    public Song findSong(String title) {
        return songs.stream()
                .filter(s -> s.getTitle().equals(title))
                .findFirst()
                .orElse(null);
    }

    public Song findSong(int index) {
        return index > songs.size() ? null : songs.get(index);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}

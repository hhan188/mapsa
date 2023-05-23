package Prac14.P48;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        if (songs.findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int index, LinkedList<Song> playList) {
        Song song = songs.findSong(index-1);

        if (song == null)
            System.err.println("this album does not have a track " + index);

        return song != null && (playList.contains(song) || playList.add(song));
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = songs.findSong(title);

        if (song == null)
            System.err.println("The song " + title + " is not in this album");

        return song != null && (playList.contains(song) || playList.add(song));
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public SongList getSongs() {
        return songs;
    }
}

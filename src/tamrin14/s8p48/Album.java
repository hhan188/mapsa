package tamrin14.s8p48;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;

    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songList = new SongList();
    }

    public boolean addSong(String title, double duration) {

        return songList.add(new Song(title, duration));
    }


    public boolean addToPlayList(String title, LinkedList playlist) {

        Song addingSong = songList.findSong(title);
        if (addingSong == null) {
            System.out.println("This song does not exists");
            return false;
        }
        return playlist.add(addingSong);
    }

    public boolean addToPlayList(int trackNumber, LinkedList playlist) {

        Song addingSong = songList.findSong(trackNumber);
        if (addingSong == null) {
            System.out.println("There is no track number " + trackNumber);
            return false;
        }
        return playlist.add(addingSong);
    }


    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song s) {
            if (findSong(s.getTitle()) != null)
                return false;
            return songs.add(s);
        }

        private Song findSong(String title) {
            for (Song s : songs) {
                if (s.getTitle().equals(title))
                    return s;
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if (trackNumber - 1 >= songs.size()) {
                return null;
            }
            return songs.get(trackNumber - 1);
        }

    }
}
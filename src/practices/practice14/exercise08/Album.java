package practices.practice14.exercise08;

import com.google.gson.Gson;

import java.util.List;


public class Album {
    private String name, artist;
    private Playlist playlist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    /*
    methods needs for e
    **/
    public static class Playlist {

        private List<Song> songs;

        private List<Song> getSongs() {
            return songs;
        }

        public void setSongs(List<Song> songs) {
            this.songs = songs;
        }
    }

    public boolean addSong(String title, double duration) {
        return playlist.getSongs().add(new Song(title, duration));


    }

    public Song findSong(String title) {
        Song song = new Song();
        for (int i = 0; i < playlist.getSongs().size(); i++) {
            if (title.startsWith(playlist.getSongs().get(i).getTitle())) {
                song = playlist.getSongs().get(i);
            }
        }
        return song;
    }

    public boolean addToPlayList(Integer trackNumber) {
        if (trackNumber < playlist.getSongs().size())
            return playlist.getSongs().add(playlist.getSongs().get(trackNumber));
        else return false;
    }

    public boolean addToPlayList(String title) {
        if (playlist.getSongs().contains(findSong(title))) {
            return playlist.getSongs().add(findSong(title));
        }
        return false;
    }
}

package Practice14.PlayList;

import javax.xml.crypto.AlgorithmMethod;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String albumName, String artist) {
        this.name = albumName;
        this.artist = artist;
    }
    public boolean addSong(String songName , double songTime){
        return songs.add(new Song(songName, songTime));
    }
    public Song findSong(String name){
        for (Song song:songs)
            if (song.name.equalsIgnoreCase(name))
                return song;
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        if (playList.contains(songs.get(trackNumber-1)))
            return false;
        return playList.add(songs.get(trackNumber-1));
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        if (findSong(title) == null)
            return false;
         return playList.add(findSong(title));
    }

    @Override
    public String toString() {
        return "Album :" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", songs=" + songs;
    }
}

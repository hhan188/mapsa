package tamrin14.s24p46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){

        if (findSong(title) != null)
            return false;

        return songs.add(new Song(title,duration));
    }

    private Song findSong(String title){
        for (Song s: songs){
            if (s.getTitle().equals(title))
                return s;
        }
        return null;
    }

    public boolean addToPlayList(String title, LinkedList playlist){

        Song addingSong = findSong(title);
        if ( addingSong == null) {
            System.out.println("This song does not exists");
            return false;
        }
        return playlist.add(addingSong);
    }

    public boolean addToPlayList(int trackNumber, LinkedList playlist){

        if (trackNumber-1 >= songs.size()){
            System.out.println("There is no track number " + trackNumber);
            return false;
        }
        Song addingSong = songs.get(trackNumber-1);
        return playlist.add(addingSong);
    }





}

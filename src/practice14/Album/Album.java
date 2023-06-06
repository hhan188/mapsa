package practice14.Album;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String Name;
    private String Artist;
    ArrayList<Song> songs=new ArrayList<>();
    public boolean  addSong(String title ,double duration ){
        if (findSong(title) == null) {
            Song newSong = new Song(title, duration);
            songs.add(newSong);
            return true;
        }
        return false;

    };
    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if ( index < songs.size()) {
            playList.add(songs.get(index));
            return true;
        }
        return false;

    };
    public boolean addToPlayList(String title,LinkedList<Song> playList){
        Song song=findSong(title);
        if (song !=null){
            playList.add(song);
            return true;

        }else return false;

    };

}

package SoheylSayyah.Practice14.Exercise24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album{
    private String name;
    private String artist;
    ArrayList<Song> songs;
    public Album(String name,String artist)
    {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }
    public boolean addSong(String title,double duration)
    {
        return songs.add(new Song(title,duration));
    }
    public Song findSong(String title)
    {
        Song temp = null;
        for (Song song : songs){
            if (title.equalsIgnoreCase(song.getTitle())){
                temp = song;
            }
        }
        return temp;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        boolean added = false;
        for (int i = 0; i < songs.size(); i++)
        {
            if (trackNumber - 1 == i){
                playList.add(songs.get(i));
                added = true;
            }
        }
        return added;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playList){
        boolean added = false;
        Song song;
        if ((song = findSong(title)) != null){
            playList.add(song);
            added = true;
        }
        return added;
    }
    @Override
    public String toString()
    {
        return "Album{" +
                "Name = " + name + '\'' +
                ", Artist='" + artist + '\'' +
                ", Songs=" + songs +
                '}';
    }

}

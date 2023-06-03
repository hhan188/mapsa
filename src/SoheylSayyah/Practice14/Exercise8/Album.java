package SoheylSayyah.Practice14.Exercise8;

import java.util.ArrayList;
import java.util.LinkedList;

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
        for (Song song : songs){
            if (title.equalsIgnoreCase(song.getTitle())){
                return song;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        for (int i = 0; i < songs.size(); i++)
        {
            if (trackNumber - 1 == i){
                return playList.add(songs.get(i));
            }
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song song;
        if ((song = findSong(title)) != null){
            return playList.add(song);
        }
        return false;
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

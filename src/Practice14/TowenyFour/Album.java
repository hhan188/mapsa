package Practice14.TowenyFour;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
     ArrayList<Song> songs=new ArrayList<>();


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public boolean addSong(String title, double duration ){
        songs.add(new Song(title,duration));
        return true;


    }
    public Song findSong(String title) {
        Song find = null;
        for (Song item : songs) {
            if (title.equalsIgnoreCase(item.getTitle())) {
                find=item;
            }
        }

        return find;

    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        boolean isMade=true;
        Song song;
        for (int i = 0; i < songs.size(); i++) {
            if (trackNumber-1==i){
                playList.add(songs.get(i));
                isMade=true;
            }
        }return isMade;
    }
    public boolean addToPlayList(String titleSong,LinkedList<Song> playList){
        boolean added = false;
       Song result;
       if ((result=findSong(titleSong))!=null){
           playList.add(result);
           added=true;
       }else return false;
       return added;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", songs=" + songs +
                '}';
    }

}

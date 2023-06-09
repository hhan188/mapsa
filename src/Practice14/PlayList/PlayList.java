package Practice14.PlayList;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.LinkedList;

public class PlayList {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("In Rainbows","Radiohead");
        album.addSong("15 Step", 3.57);
        album.addSong("Bodysnatchers", 3.57);
        album.addSong("Nude", 3.57);
        album.addSong("Weird Fishes/ Arpegi", 3.57);
        album.addSong("All I Need", 4.57);
        album.addSong("Faust Arp", 3.55);
        album.addSong("Reckoner", 3.55);
        album.addSong("House Of Card", 3.47);
        album.addSong("Jigsaw Falling Into Place", 3.57);
        album.addSong("Videotape", 4.57);
        albums.add(album);

        System.out.println(albums);

        LinkedList<Song> playList = new LinkedList<>();
        System.out.println(albums.get(0).addToPlayList("15 Step", playList));
        System.out.println(albums.get(0).addToPlayList("In shabi ke migan shab nist", playList));


    }
}

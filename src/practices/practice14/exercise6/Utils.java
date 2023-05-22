package practices.practice14.exercise6;

import java.util.LinkedList;
import java.util.List;

public class Utils extends Album{
    public Utils(String title, String genre) {
        super(title, genre);
    }

    public boolean add(Song song) {

        for (Song value : getSongs()) {
            if (song.equals(value)) {
                return false;
            }
        }
        return getSongs().add(song);
    }

    public List<Song> addSong(String trackName, Double duration) {
        LinkedList<Song> list = new LinkedList<>();
      list.add(new Song(trackName,duration));
//        if (add(song)) {
//            list.add(song);
//        }
        getSongs().addAll(list);
        getSongs().add(new Song(trackName,duration));
        return getSongs();
    }

    Song findSong(String title) {
        for (int i = 0; i < getSongs().size() + 1; i++) {
            if (title.equals(getSongs().get(i).getTrackName())) {
                return getSongs().get(i);
            }
        }
        return null;
    }

    Song findSong(Integer trackNumber) {
        for (int i = 0; i < getSongs().size(); i++) {
            if (trackNumber.equals(getSongs().get(i).getTrackNumber())) {
                return getSongs().get(i);
            }
        }
        return null;
    }
}

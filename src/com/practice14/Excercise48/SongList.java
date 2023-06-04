package com.practice14.Excercise48;

import com.practice14.Excercise46.Album;
import com.practice14.Excercise46.Song;

import java.util.List;

public class SongList
{
    List<Song> trackList = new Album().getSongs();

    public SongList(List<Song> songs)
    {
        this.trackList = songs;
    }

    public boolean add (Song song)
    {
        if (!trackList.contains(song))
        {
            trackList.add(song);
        }
        return false;
    }

    public Song findSong(String title)
    {
        for (Song item:trackList)
        {
            if (item.getTitle().equalsIgnoreCase(title))
            {
                return item;
            }
        }
        return null;
    }

    public Song findSong(int trackNumber)
    {
        for (int i=0; i<trackList.size(); i++)
        {
            if (trackList.get(i).getTitle().equalsIgnoreCase(trackList.get(trackNumber-1).getTitle()))
            {
                return trackList.get(i);
            }
        }
        return null;
    }
}

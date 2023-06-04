package com.practice14.Excercise46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album
{
    private String  name;
    private String artist;
    private ArrayList <Song> songs = new ArrayList<>();

    public Album(String name, String artist)
    {
        this.name = name;
        this.artist = artist;
    }

    public Album()
    {

    }

    public ArrayList<Song> getSongs()
    {
        return songs;
    }

    public boolean addSong (String title, double duration)
    {
        songs.add(new Song(title, duration));
        return true;
    }

    public Song findSong (String title)
    {
        for (Song item:songs)
        {
            if (item.getTitle().equalsIgnoreCase(title))
                return item;
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList <Song> playlist)
    {
        for (int i = 0; i < songs.size(); i++)
        {
            if ((trackNumber-1) == i)
            {
                playlist.add(songs.get(i));
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList <Song> playlist)
    {
        Song result;
        if ((result = findSong(title)) != null)
        {
            playlist.add(result);
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        String output = "";
        output += "Album Name: " + name + " | Artist: " + artist + "\n" + "Songs: \n";
        for (int i=0; i< songs.size(); i++)
        {
            output += "Title: " + songs.get(i).getTitle() + " | Duration: " + songs.get(i).getDuration() + "\n";
        }
        return output;
    }
}

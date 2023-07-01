package org.MapsaPractice;

import org.MapsaPractice.Entities.Album;
import org.MapsaPractice.Entities.Artist;
import org.MapsaPractice.Entities.Song;
import org.MapsaPractice.Services.AlbumService;
import org.MapsaPractice.Services.ArtistServis;
import org.MapsaPractice.Services.SongService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SongService songService = new SongService(SessionFactoryProvider.getSessionfactory());
        Song song1 = new Song(1,"Hello","04.23",new Date(),"Sad","Test 1");
        Song song2 = new Song(2,"Bye","5:20",new Date(),"Happy","Test 2");
//      ------------------------------------------------------------------------------------------------------------------
        ArtistServis artistService = new ArtistServis(SessionFactoryProvider.getSessionfactory());
        Artist artist1 = new Artist(1,"Adele","Hi I am Adele","American");
        Artist artist2 = new Artist(2,"Googoosh","Hi I am Googoosh","Iranian");
//      ------------------------------------------------------------------------------------------------------------------
        AlbumService albumService = new AlbumService(SessionFactoryProvider.getSessionfactory());
        Album album1 = new Album(1,"First Collection",new Date(),"Adele");
        Album album2 = new Album(2,"Second Collection",new Date(),"Googoosh");
//      ------------------------------------------------------------------------------------------------------------------
        songService.creatSong(song1);
        songService.creatSong(song2);

        song1.setTitle("Changed");
        songService.updateSong(song1);

        songService.getSongById(1);
        songService.getSongById(2);

        songService.deleteSong(song1);
        songService.deleteSong(song2);
//      ------------------------------------------------------------------------------------------------------------------
        artistService.creatArtist(artist1);
        artistService.creatArtist(artist2);

        artist1.setArtistName("Changed");
        artistService.updateArtist(artist1);

        artistService.getArtistById(1);
        artistService.getArtistById(2);

        artistService.deleteArtist(artist1);
        artistService.deleteArtist(artist2);
//      ------------------------------------------------------------------------------------------------------------------
        albumService.creatAlbum(album1);
        albumService.creatAlbum(album2);

        album1.setTitle("Changed");
        albumService.updateAlbum(album1);

        albumService.getAlbumById(1);
        albumService.getAlbumById(2);

        albumService.deleteAlbum(album1);
        albumService.deleteAlbum(album2);
    }
}
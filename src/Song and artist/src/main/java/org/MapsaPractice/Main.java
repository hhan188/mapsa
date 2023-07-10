package org.MapsaPractice;

import org.MapsaPractice.Entities.Album;
import org.MapsaPractice.Entities.Artist;
import org.MapsaPractice.Entities.ArtistDetail;
import org.MapsaPractice.Entities.Song;
import org.MapsaPractice.Services.AlbumService;
import org.MapsaPractice.Services.ArtistServis;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("ADELE","04.23",new Date(),"Sad","Love me");
        Song song2 = new Song("googoosh","5:20",new Date(),"Happy","Gole bi goldon");
//      ------------------------------------------------------------------------------------------------------------------
        ArtistServis artistService = new ArtistServis(SessionFactoryProvider.getSessionfactory());
        Artist artist1 = new Artist("Adele","Hi I am Adele","American");
        Artist artist2 = new Artist("Googoosh","Hi I am Googoosh","Iranian");
//      ------------------------------------------------------------------------------------------------------------------
        AlbumService albumService = new AlbumService(SessionFactoryProvider.getSessionfactory());
        Album album1 = new Album("First Collection",new Date());
        Album album2 = new Album("Second Collection",new Date());
//      ------------------------------------------------------------------------------------------------------------------
        ArtistDetail artistDetail = new ArtistDetail("www.adele.com","instagram:adele",10,15,"piano");
        ArtistDetail artistDetail1= new ArtistDetail("www.googoosh.com","Instagram:googoosh",3,40,"Guitar");
//        ----------------------------------------------------------------------------------------------------------------
        artistDetail.setArtist(artist1);
        artist1.setArtistDetail(artistDetail);

        artistDetail1.setArtist(artist1);
        artist2.setArtistDetail(artistDetail1);

//        ----------------------------------------------------------------------------------------------------------------
        album1.setArtistLists(List.of(artist1));
        artist1.setAlbumList(List.of(album1));
        album2.setArtistLists(List.of(artist2));
        artist2.setAlbumList(List.of(album2));

        song1.setAlbum(album1);
        album1.setSongs(List.of(song1));

        song2.setAlbum(album2);
        album2.setSongs(List.of(song2));

        artistService.creatArtist(artist1);
        artistService.creatArtist(artist2);

        albumService.creatAlbum(album1);
        albumService.creatAlbum(album2);



    }
}
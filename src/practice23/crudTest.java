package org.mapsa.entities.practice23;

import org.mapsa.entities.practice22.Album.Album;
import org.mapsa.entities.practice22.Album.AlbumService;
import org.mapsa.entities.practice22.Artist.Artist;
import org.mapsa.entities.practice22.Artist.ArtistService;
import org.mapsa.entities.practice22.SessionFactoryProvider;
import org.mapsa.entities.practice22.Song.Song;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class crudTest {
    public static void main(String[] args) {

        ArtistService artistService=new ArtistService(SessionFactoryProvider.getSessionFactory());
        //oneToOne
        Artist artist=new Artist("Pheobe Bridgers","pop star","american");
        Artist_detail artistDetail=new Artist_detail("www.pheobeBridgers.com","instagram","Grammy",5);


        artistDetail.setArtist(artist);
        artist.setArtist_detail(artistDetail);

        artistService.createArtist(artist);



        //anytoone

        AlbumService albumService=new AlbumService(SessionFactoryProvider.getSessionFactory());

        Album afterLaughter=new Album("afterLaughter",new Date(),"paramore");

        Song pool=new Song("pool","3:43",new Date(),"pop/rock","firstTrack");
        Song fakeHappy=new Song("fake happy","4:13",new Date(),"pop/rock","secondTrack");


        List<Song> songs= List.of(pool,fakeHappy);
        afterLaughter.setSongs(songs);
        pool.setAlbum(afterLaughter);
        fakeHappy.setAlbum(afterLaughter);
        albumService.createAlbum(afterLaughter);

//
//
//
//        //ManytoMany
//

        Artist artist1=new Artist("gracie abrams","teen idol","British");

        Album red=new Album("red",new Date(),"taylor swift");


        artist1.setAlbums(List.of(afterLaughter,red));
        artist.setAlbums(List.of(red));

        red.setArtists(List.of(artist1,artist));
        afterLaughter.setArtists(List.of(artist));

        albumService.createAlbum(red);
        albumService.createAlbum(afterLaughter);




//





    }
}

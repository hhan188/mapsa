package SoheylSayyah.Practice24Part2;

import org.mapsaHR.SessionFactoryProvider;

import java.util.Date;
import java.util.List;

public class CrudTest {
    public static void main(String[] args)
    {
        ArtistService artistService = new ArtistService(SessionFactoryProvider.getSessionfactory());

        SongService songService = new SongService(SessionFactoryProvider.getSessionfactory());

        Artist artist1 = new Artist("Ali","I am 30","Iranian");
        Artist artist2 = new Artist("Ehsan","I am 26","Iranian");

        Artist_Detail artistDetail1 = new Artist_Detail("www.ali.com","AliHAjEsmaeli",2,5,"Santoor");
        Artist_Detail artistDetail2 = new Artist_Detail("www.ehsan.com","EhsanShademani",5,10,"Guitar");

        Album album1 = new Album("Sad",new Date());
        Album album2 = new Album("Happy",new Date());

        Song song1 = new Song("Adele","4:30",new Date(),"Sad","alaki1");
        Song song2 = new Song("Googoosh","6:40",new Date(),"Happy","Alaki2");

        artist1.setArtistDetail(artistDetail1);
        artistDetail1.setArtist(artist1);

        artist2.setArtistDetail(artistDetail2);
        artistDetail2.setArtist(artist2);

        artist1.setAlbums(List.of(album1));
        album1.setArtists(List.of(artist1));

        artist2.setAlbums(List.of(album2));
        album2.setArtists(List.of(artist2));

        song1.setAlbum(album1);
        album1.setSongs(List.of(song1));

        song2.setAlbum(album2);
        album2.setSongs(List.of(song2));

        songService.create(song1);
        songService.create(song2);

        artistService.create(artist1);
        artistService.create(artist2);


    }
}

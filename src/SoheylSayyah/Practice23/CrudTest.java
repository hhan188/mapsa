package SoheylSayyah.Practice23;

import org.mapsaHR.Entities.Practice23.Classes.Album;
import org.mapsaHR.Entities.Practice23.Classes.Artist;
import org.mapsaHR.Entities.Practice23.Classes.Song;
import org.mapsaHR.Entities.Practice23.Services.AlbumService;
import org.mapsaHR.Entities.Practice23.Services.ArtistService;
import org.mapsaHR.Entities.Practice23.Services.SongService;

public class CrudTest
{
    public static void main(String[] args)
    {
        SongService songService = new SongService(SessionFactoryProvider.getSessionfactory());
        Song song1 = new Song(1,"Hello","4:30","2022-09-10","Sad","Test 1");
        Song song2 = new Song(2,"Bye","5:20","2020-09-10","Happy","Test 2");
//      ------------------------------------------------------------------------------------------------------------------
        ArtistService artistService = new ArtistService(SessionFactoryProvider.getSessionfactory());
        Artist artist1 = new Artist(1,"Adele","Hi I am Adele","American");
        Artist artist2 = new Artist(2,"Googoosh","Hi I am Googoosh","Iranian");
//      ------------------------------------------------------------------------------------------------------------------
        AlbumService albumService = new AlbumService(SessionFactoryProvider.getSessionfactory());
        Album album1 = new Album(1,"First Collection","2020-11-27","Adele");
        Album album2 = new Album(2,"Second Collection","2023-11-19","Googoosh");
//      ------------------------------------------------------------------------------------------------------------------
        songService.createSong(song1);
        songService.createSong(song2);

        song1.setTitle("Changed");
        songService.updateSong(song1);

        songService.getSongById(1);
        songService.getSongById(2);

        songService.deleteSong(song1);
        songService.deleteSong(song2);
//      ------------------------------------------------------------------------------------------------------------------
        artistService.createArtist(artist1);
        artistService.createArtist(artist2);

        artist1.setName("Changed");
        artistService.updateArtist(artist1);

        artistService.getArtistById(1);
        artistService.getArtistById(2);

        artistService.deleteArtist(artist1);
        artistService.deleteArtist(artist2);
//      ------------------------------------------------------------------------------------------------------------------
        albumService.createAlbum(album1);
        albumService.createAlbum(album2);

        album1.setTitle("Changed");
        albumService.updateAlbum(album1);

        albumService.getAlbumById(1);
        albumService.getAlbumById(2);

        albumService.deleteAlbum(album1);
        albumService.deleteAlbum(album2);
//      ------------------------------------------------------------------------------------------------------------------
    }
}

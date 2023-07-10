import entities.Album;
import entities.Artist;
import entities.ArtistDetail;
import entities.Song;
import service.EntityBaseService;

import java.util.List;

public class CreateSampleData {
    public static void main(String[] args) {


        EntityBaseService<Album> albumService = new EntityBaseService();
        EntityBaseService<Artist> artistService = new EntityBaseService();
        EntityBaseService<ArtistDetail> artistDetailService = new EntityBaseService();
        EntityBaseService<Song> songService = new EntityBaseService();

        //Artist
        Artist hojat = new Artist("Hojat Ashrafzadeh");
        artistService.save(hojat);

        Artist ebi = new Artist("Ebi");
        artistService.save(ebi);

        Artist shohreh = new Artist("Shohreh");
        artistService.save(shohreh);

        hojat.setBio("He is from Neyshabour");
        artistService.update(hojat);

        ebi.setBio("He is called 'Aghaye seda'");
        artistService.update(ebi);

        shohreh.setBio("She is the Queen of iranian music");
        artistService.update(shohreh);

        //ArtistDetail
        ArtistDetail ad1 = new ArtistDetail();
        ad1.setSocialMedia("@Hojatashrafzadeh");
        ad1.setArtist(hojat);
        artistDetailService.save(ad1);

        //Album

        Album moonAndFish = new Album("Moon and Fish",  List.of(hojat));
        albumService.save(moonAndFish);

        Album atreTou = new Album("Atre Tou", List.of(ebi));
        albumService.save(atreTou);
        Album zan = new Album("Zan", List.of(shohreh));
        albumService.save(zan);

        //Song
        Song kamaanAbroo = new Song("Kamaan Abroo",moonAndFish, "Music Library\\Hojat Ashrafzadeh");
        songService.save(kamaanAbroo);
        Song jostejoo = new Song("Jostejoo",atreTou, "Music Library\\Ebi");
        songService.save(jostejoo);
        Song hamshahri = new Song("Hamshahri",zan, "Music Library\\Shohreh");
        songService.save(hamshahri);

    }
}

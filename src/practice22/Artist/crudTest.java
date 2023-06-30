package org.mapsa.entities.practice22.Artist;


import org.mapsa.entities.practice22.SessionFactoryProvider;

public class crudTest {
    public static void main(String[] args) {

        ArtistService artistService=new ArtistService(SessionFactoryProvider.getSessionFactory());

        Artist johnMayer=new Artist("john mayer","popStar","American");
        Artist edSheeran=new Artist("ed sheeran","popStar","British");

        //creating an artist
        Integer johnMayerId=ArtistService.createArtist(johnMayer);
        Integer edSheeranId=ArtistService.createArtist(edSheeran);
        System.out.println("john mayer added.");
        System.out.println("ed sheeran added.");


        //updatingAnArtist
        johnMayer.setBio("Star");
        artistService.updateArtist(johnMayer);
        System.out.println("john mayer bio changed!");


        //deletingAnArtist
        artistService.deleteArtist(edSheeran);
        System.out.println("artist deleted succesfully!");

        //gettingAnArist

        System.out.println(artistService.getArtistById(11));


    }
}

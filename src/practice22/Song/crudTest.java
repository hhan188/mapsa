package org.mapsa.entities.practice22.Song;


import org.mapsa.entities.practice22.SessionFactoryProvider;

public class crudTest {
    public static void main(String[] args) {

        SongService songService=new SongService(SessionFactoryProvider.getSessionFactory());

        Song blankSpace=new Song("blank space","3:54","2014-12-11","pop","first TracK");
        Song maroon=new Song("Maroon","4:24","2018-02-11","pop","second TracK");

        //craeting a song
        Integer newSongId = SongService.createSong(blankSpace) ;
        Integer newSongId2 = SongService.createSong(maroon) ;
        System.out.println("blank space added succesfully!");
        System.out.println("maroon added succesfully!");

        //updating a song
        blankSpace.setGenre("sad");
        songService.updateSong(blankSpace);
        System.out.println("song updated succesfully");


        //deleting a song
        songService.deleteSong(maroon);
        System.out.println("maroon deleted succesfully");

        //geting a song by its id
        songService.getSongById(17);






        //get
//        Song blankSpace =session.get(Song.class,7);
//        System.out.println(blankSpace.getReleaseDate());
//        session.getTransaction().commit();

    }

}

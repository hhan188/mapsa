package org.mapsa.entities.practice22.Album;

import org.hibernate.SessionFactory;
import org.mapsa.entities.practice22.SessionFactoryProvider;


public class crudAlbum {
    public static void main(String[] args) {
        AlbumService albumService=new AlbumService(SessionFactoryProvider.getSessionFactory());

        Album speakNow=new Album("speakNow","2010-09-17","TaylorSwift ");
        Album evermore=new Album("evermore","2021-11-21","TaylorSwift ");

        //create
        Integer speakNowId=AlbumService.createAlbum(speakNow);
        Integer evermoreId=AlbumService.createAlbum(evermore);
        System.out.println("speak now created.");
        System.out.println("evermore created.");

        //update
        evermore.setReleaseDate("2021-10-21");
        albumService.deleteAlbum(evermore);
        System.out.println("evermore updated");


        //delete
        albumService.deleteAlbum(speakNow);
        System.out.println("speak now deleted.");


        //get
        System.out.println(albumService.getAlbumById(1));


    }
}

package practice23.Album;

import practice23.SessionFactoryProvider;

import java.util.Date;


public class crudAlbum {
    public static void main(String[] args) {
        AlbumService albumService=new AlbumService(SessionFactoryProvider.getSessionFactory());

//        Album speakNow=new Album("speakNow",new Date(2021-4-12),"TaylorSwift ");
//        Album evermore=new Album("evermore",new Date(2018-12-12),"TaylorSwift ");
//
//        //create
//
//        Integer speakNowId=AlbumService.createAlbum(speakNow);
//        Integer evermoreId=AlbumService.createAlbum(evermore);

//
//        //update!!
//
//        Album evermore = albumService.getAlbumById(33);
//        evermore.setArtist("changed");
//       albumService.updateAlbum(evermore);

//
//        //delete!!
//        Album speakNow=albumService.getAlbumById(35);
//        albumService.deleteAlbum(speakNow);

//
//        //get

//        System.out.println(albumService.getAlbumById(24));


    }
}
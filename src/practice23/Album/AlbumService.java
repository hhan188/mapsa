package practice23.Album;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsa.entities.practice22.Album.Album;

import java.io.Serializable;

public class AlbumService implements Serializable {

    static SessionFactory sessionFactory;

    public AlbumService(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;

    }

    public static Integer createAlbum(Album album){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        Integer id=(Integer) session.save(album);
        session.getTransaction().commit();
        session.close();
        System.out.println("album created");
        return id;

    }


    public static void updateAlbum(Album album){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        session.update(album);
        session.getTransaction().commit();
        session.close();
        System.out.println("album updated.");
    }

    public void deleteAlbum(Album album){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        session.delete(album);
        session.getTransaction().commit();
        session.close();
        System.out.println("album deleted");
    }

    public Album getAlbumById(Integer id){
        Session session= sessionFactory.openSession();
        session.getTransaction();
        Album album=session.get(Album.class,id);
        session.close();
        return album;
    }
}
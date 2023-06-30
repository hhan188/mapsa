package org.mapsa.entities.practice22.Album;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsa.entities.practice22.Song.Song;

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
        return id;

    }


    public static void updateAlbum(Album album){
        Session session= sessionFactory.openSession();
        session.getTransaction();
        session.update(album);
        session.getTransaction().commit();
        session.close();
    }

    public void deleteAlbum(Album album){
        Session session= sessionFactory.openSession();
        session.getTransaction();
        session.delete(album);
        session.close();
    }

    public Album getAlbumById(Integer id){
        Session session= sessionFactory.openSession();
        session.getTransaction();
        Album album=session.get(Album.class,id);
        session.close();
        return album;
    }
}

package org.MapsaPractice.Services;

import org.MapsaPractice.Entities.Album;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AlbumService {
    SessionFactory sessionFactory;
    public AlbumService(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }
    public void creatAlbum(Album album){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(album);
        session.getTransaction().commit();
        session.close();

    }
    public void updateAlbum(Album album){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(album);
        session.getTransaction().commit();
        session.close();
    }
    public void deleteAlbum(Album album){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(album);
        session.getTransaction().commit();
        session.close();
    }
    public Album getAlbumById(Integer albumId){
        Session session = sessionFactory.openSession();
        Album album = session.get(Album.class, albumId);
        session.close();
        return album;
    }
}


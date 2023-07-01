package org.MapsaPractice.Services;

import org.MapsaPractice.Entities.Artist;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ArtistServis {
    SessionFactory sessionFactory;
    public ArtistServis(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }
    public void creatArtist(Artist artist){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(artist);
        session.getTransaction().commit();
        session.close();

    }
    public void updateArtist(Artist artist){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(artist);
        session.getTransaction().commit();
        session.close();
    }
    public void deleteArtist(Artist artist){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(artist);
        session.getTransaction().commit();
        session.close();
    }
    public Artist getArtistById(Integer artistId){
        Session session = sessionFactory.openSession();
        Artist artist = session.get(Artist.class, artistId);
        session.close();
        return artist;
    }
}

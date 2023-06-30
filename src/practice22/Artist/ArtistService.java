package org.mapsa.entities.practice22.Artist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.persistence.criteria.CriteriaBuilder;

public class ArtistService {
    static SessionFactory sessionFactory;

    public ArtistService(SessionFactory sessionFactory) {
        this.sessionFactory=sessionFactory;
    }

    public static Integer createArtist(Artist artist){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        Integer id=(Integer) session.save(artist);
        session.getTransaction().commit();
        session.close();
        return id;

    }

    public static void updateArtist(Artist artist){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        session.update(artist);
        session.getTransaction().commit();
        session.close();
    }



    public static void deleteArtist(Artist artist){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        session.delete(artist);
        session.getTransaction().commit();
        session.close();
    }

    public static Artist getArtistById(Integer id){
        Session session= sessionFactory.openSession();
        Artist artist=session.get(Artist.class,id);
        session.close();
        return artist;
    }


}

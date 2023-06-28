package SoheylSayyah.Practice23.Services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsaHR.Entities.Practice23.Classes.Artist;

public class ArtistService {
    SessionFactory sessionFactory;
    public ArtistService(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    public void createArtist(Artist artist){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(artist);
        session.getTransaction().commit();
        System.out.println("Artist Saved :)");
    }
    public void updateArtist(Artist artist){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(artist);
        session.getTransaction().commit();
        session.close();
        System.out.println("Artist Updated :)");
    }
    public void deleteArtist(Artist artist){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(artist);
        session.getTransaction().commit();
        session.close();
        System.out.println("Artist Deleted :(");
    }
    public void getArtistById(Integer id){
        Session session = sessionFactory.openSession();
        Artist artist = session.get(Artist.class , id);
        session.close();
        System.out.println(artist);
    }
}

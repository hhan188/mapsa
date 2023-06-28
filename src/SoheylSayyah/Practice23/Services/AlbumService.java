package SoheylSayyah.Practice23.Services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsaHR.Entities.Practice23.Classes.Album;

public class AlbumService {
    SessionFactory sessionFactory;
    public AlbumService(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    public void createAlbum(Album album){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(album);
        session.getTransaction().commit();
        System.out.println("Album Saved :)");
    }
    public void updateAlbum(Album album){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(album);
        session.getTransaction().commit();
        session.close();
        System.out.println("Album Updated :)");
    }
    public void deleteAlbum(Album album){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(album);
        session.getTransaction().commit();
        session.close();
        System.out.println("Album Deleted :(");
    }
    public void getAlbumById(Integer id){
        Session session = sessionFactory.openSession();
        Album album = session.get(Album.class , id);
        session.close();
        System.out.println(album);
    }
}

package SoheylSayyah.Practice23.Services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsaHR.Entities.Practice23.Classes.Song;

public class SongService {
    SessionFactory sessionFactory;
    public SongService(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    public void createSong(Song song){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(song);
        session.getTransaction().commit();
        System.out.println("Song Saved :)");
    }
    public void updateSong(Song song){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(song);
        session.getTransaction().commit();
        session.close();
        System.out.println("Song Updated :)");
    }
    public void deleteSong(Song song){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(song);
        session.getTransaction().commit();
        session.close();
        System.out.println("Song Deleted :(");
    }
    public void getSongById(Integer id){
        Session session = sessionFactory.openSession();
        Song song = session.get(Song.class , id);
        session.close();
        System.out.println(song);
    }
}

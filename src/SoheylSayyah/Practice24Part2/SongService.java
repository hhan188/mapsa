package SoheylSayyah.Practice24Part2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SongService {
    SessionFactory sessionFactory;
    public SongService(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    public void create(Song song){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(song);
        session.getTransaction().commit();
        session.close();
    }
    public void update(Song song){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(song);
        session.getTransaction().commit();
        session.close();
    }
    public void delete(Song song){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(song);
        session.getTransaction().commit();
        session.close();
    }
    public void getById(Integer id){
        Session session = sessionFactory.openSession();
        Song song = session.get(Song.class , id);
        session.close();
        System.out.println(song);
    }
}

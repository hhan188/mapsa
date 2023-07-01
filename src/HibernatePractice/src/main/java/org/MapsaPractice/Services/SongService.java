package org.MapsaPractice.Services;

import org.MapsaPractice.Entities.Song;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SongService {
    SessionFactory sessionFactory;
    public SongService(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }
    public void creatSong(Song song){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(song);
        session.getTransaction().commit();
        session.close();

    }
    public void updateSong(Song song){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(song);
        session.getTransaction().commit();
        session.close();
    }
    public void deleteSong(Song song){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(song);
        session.getTransaction().commit();
        session.close();
    }
    public Song getSongById(Integer songId){
        Session session = sessionFactory.openSession();
        Song song = session.get(Song.class , songId);
        session.close();
        return song;
    }
}

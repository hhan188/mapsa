package org.mapsa.entities.practice22.Song;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mapsa.entities.practice22.Song.Song;

public class SongService {
        static SessionFactory sessionFactory ;

        public SongService(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }


        public static Integer createSong(Song song){
            Session session= sessionFactory.openSession();
            session.beginTransaction();
            Integer id=(Integer) session.save(song);
            session.getTransaction().commit();
            session.close();
            return id;


        }

        public void updateSong(Song song){
            Session session = sessionFactory.openSession() ;
            session.beginTransaction() ;
            session.update(song); ;
            session.getTransaction().commit();
            session.close();
        }

        public void deleteSong(Song song){
            Session session = sessionFactory.openSession() ;
            session.beginTransaction() ;
            session.delete(song); ;
            session.getTransaction().commit();
            session.close();
        }

        public Song getSongById(Integer id){
            Session session = sessionFactory.openSession() ;
            Song song = session.get(Song.class , id) ;
            session.close();
            return song ;
        }

    }

package org.MapsaPractice;


import org.MapsaPractice.Entities.Album;
import org.MapsaPractice.Entities.Artist;
import org.MapsaPractice.Entities.ArtistDetail;
import org.MapsaPractice.Entities.Song;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;


public class SessionFactoryProvider
    {
        private static SessionFactory sf;
        public static SessionFactory getSessionfactory(){
            if (sf == null){
                Configuration cfg = new Configuration();
//                cfg.configure();
                cfg.addAnnotatedClass(Album.class);
                cfg.addAnnotatedClass(Artist.class);
                cfg.addAnnotatedClass(ArtistDetail.class);
                cfg.addAnnotatedClass(Song.class);
                sf = cfg.buildSessionFactory();
                return sf;
            }
            return sf;
        }
    }


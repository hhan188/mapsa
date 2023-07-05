package org.mapsa.entities.practice22;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapsa.entities.manyToMany.Category;
import org.mapsa.entities.manytoone.Post2;
import org.mapsa.entities.onetoone.Author;
import org.mapsa.entities.onetoone.AuthorDetail;
import org.mapsa.entities.practice22.Album.Album;
import org.mapsa.entities.practice22.Artist.Artist;
import org.mapsa.entities.practice22.Song.Song;
import org.mapsa.entities.practice23.Artist_detail;

public class SessionFactoryProvider {


    private static SessionFactory sf ;
    public static SessionFactory getSessionFactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
//            cfg.addAnnotatedClass(Author.class);
//            cfg.addAnnotatedClass(AuthorDetail.class);
//            cfg.addAnnotatedClass(Post2.class);
//            cfg.addAnnotatedClass(Category.class);
            cfg.addAnnotatedClass(Artist_detail.class);
            cfg.addAnnotatedClass(Album.class);
            cfg.addAnnotatedClass(Song.class);
            cfg.addAnnotatedClass(Artist.class);
            sf = cfg.buildSessionFactory();
           // cfg.configure(); in mire to cml
            return sf ;
        }

        return sf ;
    }
}
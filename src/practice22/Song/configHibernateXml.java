package org.mapsa.entities.practice22.Song;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapsa.entities.practice22.Song.Song;

import java.util.List;

public class configHibernateXml {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();


        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();
        List<Song> list=session.createQuery("from Song").getResultList();
        System.out.println(list);
        session.close();



    }

}

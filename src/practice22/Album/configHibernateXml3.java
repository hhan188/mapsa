package org.mapsa.entities.practice22.Album;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapsa.entities.practice22.Album.Album;

import java.util.List;

public class configHibernateXml3 {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();


        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();
        List<Album> list=session.createQuery("from Album").getResultList();
        System.out.println(list);
        session.close();



    }

}

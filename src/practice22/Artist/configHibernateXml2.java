package org.mapsa.entities.practice22.Artist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mapsa.entities.practice22.Artist.Artist;

import java.util.List;

public class configHibernateXml2 {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure();


        SessionFactory factory= cfg.buildSessionFactory();
        Session session=factory.openSession();
        List<Artist> list=session.createQuery("from Artist").getResultList();
        System.out.println(list);
        session.close();



    }
}

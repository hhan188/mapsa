package config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){

        if (sessionFactory == null){
            Configuration cfg = new Configuration();
            cfg.configure();
            SessionFactory sf = cfg.buildSessionFactory();
            sessionFactory = sf;
        }
        return sessionFactory;
    }
}

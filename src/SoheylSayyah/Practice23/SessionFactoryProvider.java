package SoheylSayyah.Practice23;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider
{
    private static SessionFactory sf;
    public static SessionFactory getSessionfactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
            cfg.configure();

            sf = cfg.buildSessionFactory();
            return sf;
        }
        return sf;
    }
}

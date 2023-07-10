package config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ConfigTest {

    public static void main(String[] args) {

        SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
        Session test = sessionFactory.openSession();
        System.out.println("Config Tested successfully");
        test.close();
    }
}

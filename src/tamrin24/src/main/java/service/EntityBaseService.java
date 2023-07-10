package service;

import config.SessionFactoryProvider;
import org.hibernate.Session;

public class EntityBaseService<T> {

    //Create
    public Integer save(T t) {
        Session thisSession = SessionFactoryProvider.getSessionFactory().openSession();
        thisSession.getTransaction().begin();
        //Insert into
        Integer id = (Integer) thisSession.save(t);

        thisSession.getTransaction().commit();
        thisSession.close();
        return id;
    }

    //Read
    public T getByID(String entityName, Integer id){
        Session thisSession = SessionFactoryProvider.getSessionFactory().openSession();
        //select
        T t = (T)thisSession.get(entityName ,id);

        thisSession.close();
        return t;
    }

    //Update
    public void update(T t){
        Session thisSession = SessionFactoryProvider.getSessionFactory().openSession();
        thisSession.beginTransaction();
        //update
        thisSession.update(t);

        thisSession.getTransaction().commit();
        thisSession.close();
    }

    //Delete
    public void delete(T t){
        Session thisSession = SessionFactoryProvider.getSessionFactory().openSession();
        thisSession.beginTransaction();
        //Delete
        thisSession.delete(t);

        thisSession.getTransaction().commit();
        thisSession.close();
    }
}

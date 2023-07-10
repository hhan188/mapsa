package service;

import config.SessionFactoryProvider;
import entities.Author;
import org.hibernate.query.Query;

import java.util.List;

public class AuthorService extends EntityBaseService{

    public Author getByName(String authorName){
        var session = SessionFactoryProvider.getSessionFactory().openSession();
        Query query = session.createQuery
                ("SELECT a FROM Author a WHERE a.name = :an");
        query.setParameter("an", authorName);
        Author a = (Author) query.getSingleResult();
        session.close();
        return a;
    }

    public List<Author> getAll(){
        var session = SessionFactoryProvider.getSessionFactory().openSession();
        Query query = session.createQuery
                ("SELECT a FROM Author a");
        List<Author> a = query.getResultList();
        session.close();
        return a;
    }



}

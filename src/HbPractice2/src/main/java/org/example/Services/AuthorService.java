package org.example.Services;

import org.example.Entites.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AuthorService {
    SessionFactory sessionFactory;

    public AuthorService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public void createAuthorService(Author author){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
    }
    public void updateAuthorService(Author author){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(author);
        session.getTransaction().commit();
        session.close();
    }
    public void deleteAuthor(Author author){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(author);
        session.getTransaction().commit();
        session.close();
    }
    public  Author getAuthorById(Integer AuthorId){
        Session session = sessionFactory.openSession();
        Author author = session.get(Author.class, AuthorId);
        session.close();
        return author;
    }
}

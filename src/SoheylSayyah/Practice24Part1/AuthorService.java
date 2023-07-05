package SoheylSayyah.Practice24Part1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AuthorService
{
    SessionFactory sessionFactory;
    public AuthorService(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    public void create(Author author){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();
        session.close();
    }
    public void update(Author author){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(author);
        session.getTransaction().commit();
        session.close();
    }
    public void delete(Author author){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(author);
        session.getTransaction().commit();
        session.close();
    }
    public void getById(Integer id){
        Session session = sessionFactory.openSession();
        Author author = session.get(Author.class , id);
        session.close();
        System.out.println(author);
    }
}

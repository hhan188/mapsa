package SoheylSayyah.Practice24Part3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

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
    public Author getByName(String name){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select a from Author a where a.name =: name");
        query.setParameter("name" , name);
        List<Author> authors = query.list();
        session.close();
        if (authors.size() > 0){
            return authors.get(0);
        }
        return null;
    }
    public List<Author> getAll(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select a from Author a");
        List<Author> authors = query.list();
        session.close();
        return authors;
    }
}

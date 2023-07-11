package practice24vapractice25;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

//gozashtan default constructore ejbarie
public class AuthorService {

    private SessionFactory sessionFactory ;

    public AuthorService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void create(Author author){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.save(author);
        session.getTransaction().commit();
        session.close();

    }

    public void update(Author author){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(author); ;
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Author author){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(author); ;
        session.getTransaction().commit();
        session.close();
    }

    public Author getAuthorById(Integer id){
        Session session = sessionFactory.openSession() ;
        Author std = session.get(Author.class , id) ;
        session.close();
        return std ;
    }
    //getByName
    public Author findByName(String name) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Author where name=:name");
        query.setParameter("name", name);
        List<Author> authors = query.getResultList();
        session.close();
        if (authors.size() > 0)
            return authors.get(0);
        else
            return null;
    }

    //getAll
    public List<Author> getAll(){
        Session session = sessionFactory.openSession() ;
        Query q = session.createQuery("Select u from Author u") ;
        List<Author> authors =  q.getResultList() ;
        session.close();
        return authors;
    }



}

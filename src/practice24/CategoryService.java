package practice24;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CategoryService {
    SessionFactory sessionFactory ;

    public CategoryService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void create(Category category){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.save(category);
        session.getTransaction().commit();
        session.close();
    }

    public void update(Category category){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(category) ;
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Category category){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(category); ;
        session.getTransaction().commit();
        session.close();
    }

    public Category getPostById(Integer id){
        Session session = sessionFactory.openSession() ;
        Category std = session.get(Category.class , id) ;
        session.close();
        return std ;
    }

    public Category findName(String content){
        Session session= sessionFactory.openSession();
        Query query= session.createQuery("from Category where title=:name");
        query.setParameter("name",content);
        List<Category> categories=query.getResultList();
        session.close();
        return categories.get(0);

    }

    public List<Category> getAll(){
        Session session= sessionFactory.openSession();
        Query query= session.createQuery("select u from Category u");
        List<Category> categories=query.getResultList();
        session.close();
        System.out.println(categories.size());
        return categories;
    }


}

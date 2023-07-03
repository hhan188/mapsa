package SoheylSayyah.Practice24;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CategoryService
{
    SessionFactory sessionFactory;

    public CategoryService(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    public void create(Category category){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(category);
        session.getTransaction().commit();
        session.close();
    }
    public void update(Category category){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(category);
        session.getTransaction().commit();
        session.close();
    }
    public void delete(Category category){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(category);
        session.getTransaction().commit();
        session.close();
    }
    public void getById(Integer id){
        Session session = sessionFactory.openSession();
        Category category = session.get(Category.class , id);
        session.close();
        System.out.println(category);
    }
}

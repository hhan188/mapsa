package SoheylSayyah.Practice24Part4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

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
    public Category getByName(String title){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select c from Category c where c.title =: title");
        query.setParameter("title" , title);
        List<Category> categories = query.list();
        session.close();
        if (categories.size() > 0){
            return categories.get(0);
        }
        return null;
    }
    public List<Category> getAll(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select c from Category c");
        List<Category> categories = query.list();
        session.close();
        return categories;
    }
}

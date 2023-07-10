package org.example.Services;

import org.example.Entites.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.Query;
import java.util.List;

public class CategoryService {
    SessionFactory sessionFactory;

    public CategoryService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public void createCategoryService(Category category){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(category);
        session.getTransaction().commit();
        session.close();
    }
    public void updateCategoryService(Category category){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(category);
        session.getTransaction().commit();
        session.close();
    }
    public void deleteCategory(Category category){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(category);
        session.getTransaction().commit();
        session.close();
    }
    public  Category getCategoryById(Integer CategoryId){
        Session session = sessionFactory.openSession();
        Category category = session.get(Category.class, CategoryId);
        session.close();
        return category;
    }
    public Category getCategoryByTitle(String title){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select c from Category where c.title =:title ");
        query.setParameter("title",title);
        List<Category> categories = query.getResultList();
        session.close();
        if (categories.size()>0){
            return categories.get(0);
        }
        return null;
    }
    public List<Category> getAllCategory(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select c from Category");
        List<Category> categories = query.getResultList();
        session.close();
        return categories;
    }
}

package org.example.Services;

import org.example.Entites.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
    public  Category getAuthorById(Integer CategoryId){
        Session session = sessionFactory.openSession();
        Category category = session.get(Category.class, CategoryId);
        session.close();
        return category;
    }
}

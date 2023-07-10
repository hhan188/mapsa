package service;

import config.SessionFactoryProvider;
import entities.Category;
import org.hibernate.query.Query;

import java.util.List;

public class CategoryService extends EntityBaseService{

    public Category getByTitle(String categoryTitle){

        var session = SessionFactoryProvider.getSessionFactory().openSession();

        Query query = session.createQuery
                ("SELECT c FROM Category c WHERE c.title = :catTitle");
        query.setParameter("catTitle", categoryTitle);

        Category resultCategory = (Category) query.getSingleResult();
        return resultCategory;

    }


    public List<Object[]> getAllCategories() {

        var session = SessionFactoryProvider.getSessionFactory().openSession();

        Query query = session.createQuery
                ("SELECT c.id, c.title FROM Category c");

        var resultList = query.getResultList();
        return resultList;
    }

}

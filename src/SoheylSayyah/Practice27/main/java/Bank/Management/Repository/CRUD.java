package SoheylSayyah.Practice27.main.java.Bank.Management.Repository;

import org.hibernate.Session;

public class CRUD<T> {
    public CRUD(Class<T> type) {
    }
    public void create(Session connection, T entity) {
        connection.beginTransaction();
        connection.saveOrUpdate(entity);
        connection.getTransaction().commit();
        connection.close();
    }
    public void update(Session connection, T entity) {
        connection.beginTransaction();
        connection.update(entity);
        connection.getTransaction().commit();
        connection.close();
    }
    public void delete(Session connection, T entity) {
        //todo: safe Delete
        connection.beginTransaction();
        connection.update(entity);
        connection.getTransaction().commit();
        connection.close();
    }
}

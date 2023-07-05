package SoheylSayyah.Practice24Part3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PostService
{
    SessionFactory sessionFactory;
    public PostService(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    public void create(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(post);
        session.getTransaction().commit();
        session.close();
    }
    public void update(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(post);
        session.getTransaction().commit();
        session.close();
    }
    public void delete(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(post);
        session.getTransaction().commit();
        session.close();
    }
    public void getById(Integer id){
        Session session = sessionFactory.openSession();
        Post post = session.get(Post.class , id);
        session.close();
        System.out.println(post);
    }
    public Post getByName(String name){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select p from Post p where p.name =: name");
        query.setParameter("name" , name);
        List<Post> posts = query.list();
        session.close();
        if (posts.size() > 0){
            return posts.get(0);
        }
        return null;
    }
    public List<Post> getAll(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select p from Post p");
        List<Post> posts = query.list();
        session.close();
        return posts;
    }
    public void publish(int id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Query query = session.createQuery("update Post p set p.published = :isPublished where p.postId = :postId");
        query.setParameter("isPublished", true);
        query.setParameter("postId", id);
        query.executeUpdate();
        transaction.commit();
        session.close();
    }
    public List<Post> getAllPublishedPost(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select p from Post p where published =: published");
        query.setParameter("published" , true);
        List<Post> posts = query.list();
        System.out.println(posts.size());
        return posts;
    }
}

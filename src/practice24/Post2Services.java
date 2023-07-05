package practice24;

import org.hibernate.*;

import java.util.List;


public class Post2Services {
    SessionFactory sessionFactory ;

    public Post2Services(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void create(Post2 post2){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.save(post2);
        session.getTransaction().commit();
        session.close();

    }

    public void update(Post2 post2){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(post2); ;
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Post2 post2){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(post2); ;
        session.getTransaction().commit();
        session.close();
    }

    public Post2 getPostById(Integer id){
        Session session = sessionFactory.openSession() ;
        Post2 std = session.get(Post2.class , id) ;
        session.close();
        return std ;
    }


    public void publish(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction=session.getTransaction();
        transaction.begin();
        Query query = session.createQuery("update Post2 p set p.published=:isPublished where p.id =:postId");
        query.setParameter("isPublished",true);
        query.setParameter("postId",id);
        query.executeUpdate();
        transaction.commit();
        session.close();

    }

    public Post2 findName(String content){
        Session session= sessionFactory.openSession();
        Query query= session.createQuery("from Post2 where content=:name");
        query.setParameter("name",content);
        List<Post2> post=query.getResultList();
        session.close();
        return post.get(0);

    }

    public List<Post2> getAll(){
        Session session= sessionFactory.openSession();
        Query query= session.createQuery("select u from Post2 u");
        List<Post2> posts=query.getResultList();
        session.close();
        System.out.println(posts.size());
        return posts;
    }

    public List <Post2> getAllPublishedPosts(){
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("select u from Post2 u where published=:result ");
        query.setParameter("result",true);
        List<Post2> posts=query.getResultList();
        session.close();
        System.out.println(posts.size());
        return posts;

    }





}

package practice24vapractice25;

import org.hibernate.*;

import java.util.List;


public class PostServices {
    SessionFactory sessionFactory ;

    public PostServices(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void create(Post post2){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.save(post2);
        session.getTransaction().commit();
        session.close();

    }

    public void update(Post post2){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.update(post2); ;
        session.getTransaction().commit();
        session.close();
    }

    public void delete(Post post2){
        Session session = sessionFactory.openSession() ;
        session.beginTransaction() ;
        session.delete(post2); ;
        session.getTransaction().commit();
        session.close();
    }

    public Post getPostById(Integer id){
        Session session = sessionFactory.openSession() ;
        Post std = session.get(Post.class , id) ;
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

    public Post findName(String content){
        Session session= sessionFactory.openSession();
        Query query= session.createQuery("from Post2 where content=:name");
        query.setParameter("name",content);
        List<Post> post=query.getResultList();
        session.close();
        return post.get(0);

    }

    public List<Post> getAll(){
        Session session= sessionFactory.openSession();
        Query query= session.createQuery("select u from Post2 u");
        List<Post> posts=query.getResultList();
        session.close();
        System.out.println(posts.size());
        return posts;
    }

    public List <Post> getAllPublishedPosts(){
        Session session=sessionFactory.openSession();
        Query query=session.createQuery("select u from Post2 u where published=:result ");
        query.setParameter("result",true);
        List<Post> posts=query.getResultList();
        session.close();
        System.out.println(posts.size());
        return posts;

    }





}

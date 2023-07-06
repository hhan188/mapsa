package org.example.Services;

import org.example.Entites.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class PostService {
    SessionFactory sessionFactory;

    public PostService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public void createPostService(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(post);
        session.getTransaction().commit();
        session.close();
    }
    public void updatePostService(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(post);
        session.getTransaction().commit();
        session.close();
    }
    public void deletePost(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(post);
        session.getTransaction().commit();
        session.close();
    }
    public  Post getPostById(Integer postId){
        Session session = sessionFactory.openSession();
        Post post = session.get(Post.class, postId);
        session.close();
        return post;
    }
    public Post getPostByName(String name){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select p from Post where p.name = : name");
        query.setParameter("name",name);
        List<Post> posts = query.getResultList();
        session.close();
        if (posts.size()>0){
            return posts.get(0);
        }
        return null;
    }
    public List<Post> getAllPost(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select p from Post");
        List<Post> posts = query.getResultList();
        session.close();
        return posts;
    }
    public void published(int id){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Query query = session.createQuery("Update Post p set p.publish =: isPublish where p.id=: id");
        query.setParameter("isPublish",true);
        query.setParameter("id",id);
        query.executeUpdate();
        transaction.commit();
        session.close();
    }
    ////////getAllPublishedPost kAR nemikone;
    public List<Post> getAllPublishedPost(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select p from Post where p.isPublish=:isPublish");
        query.setParameter("isPublish",true);
        List<Post> posts = query.getResultList();
        session.close();
        System.out.println(posts.size());
        return posts;
    }
}

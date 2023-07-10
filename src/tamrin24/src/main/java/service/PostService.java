package service;

import config.SessionFactoryProvider;
import entities.Author;
import entities.Category;
import entities.Post;
import enums.PostStatus;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

public class PostService extends EntityBaseService {

    public void addCategoryToPost(Post post, Set<Category> categorySet){

        post.getCategorySet().addAll(categorySet);
        super.update(post);
    }
    public boolean publishPost(Integer postID) {

        Post post = (Post) super.getByID("entities.Post", postID);

        if (post == null || post.getPostStatus() == PostStatus.Published)
            return false;

        post.setPostStatus(PostStatus.Published);
        post.setPublishDate(LocalDate.now());
        post.setPublishTime(LocalTime.now());
        super.update(post);
        return true;
    }

    public List<Post> getPostsByAuthorName(String authorName) {

        var authorService = new AuthorService();

        var session = SessionFactoryProvider.getSessionFactory().openSession();

        Author author = authorService.getByName(authorName);

        Query query = session.createQuery
                ("SELECT p FROM Post p WHERE p.author = :author");
        query.setParameter("author", author);

        List<Post> postSet = query.getResultList();
        return postSet;
    }

    public List<Object[]> getAllPosts() {

        var session = SessionFactoryProvider.getSessionFactory().openSession();

        Query query = session.createQuery
                ("SELECT p.id as i, p.content as c FROM Post p ");

        var resultList = query.getResultList();
        return resultList;
    }

    public List<Object[]> getAllPublishedPosts() {

        var session = SessionFactoryProvider.getSessionFactory().openSession();

        Query query = session.createQuery
                ("SELECT p.id as i, p.content as c FROM Post p WHERE p.postStatus = 'Published'");

        var resultList = query.getResultList();
        return resultList;
    }

    public List getPostByCategory(String categoryTitle){

        var categoryService = new CategoryService();

        Category category = categoryService.getByTitle(categoryTitle);

        var session = SessionFactoryProvider.getSessionFactory().openSession();

        Query query = session.createQuery
                ("SELECT p.id, p.content FROM Post p WHERE :cat MEMBER OF p.categorySet ");
        query.setParameter("cat", category);

        List<Object[]> resultList= query.getResultList();

        return resultList;

    }
}

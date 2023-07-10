import entities.Author;
import entities.AuthorDetail;
import service.AuthorService;

import java.util.List;

public class AuthorTest {
    public static void main(String[] args) {

        AuthorService authorService = new AuthorService();

        Author testAuthor;
        AuthorDetail testAuthorDetail;
        List<Author> testAuthorList;

        System.out.println("Test getByID method:");
        testAuthor = (Author) authorService.getByID("entities.Author", 1);
        System.out.println("Result: ---------------------------------------------");
        System.out.println(testAuthor);
        System.out.println("Test delete author details method:");
        testAuthorDetail = testAuthor.getAuthorDetail();
        authorService.delete(testAuthorDetail);
        System.out.println();


        System.out.println("Test getByName method:");
        testAuthor = authorService.getByName("Soheyl");
        System.out.println("Result: ---------------------------------------------");
        System.out.println(testAuthor);
        System.out.println("Test delete author method:");
        authorService.delete(testAuthor);


        System.out.println("Test getByName method:");
        testAuthor = authorService.getByName("Soheyl");
        System.out.println("Result: ---------------------------------------------");
        System.out.println(testAuthor);
        System.out.println("Test update method:");
        testAuthorDetail = testAuthor.getAuthorDetail();
        testAuthorDetail.setBio("Iranian Good Author, This bio is updated");
        authorService.update(testAuthorDetail);
        System.out.println();


        System.out.println("Test getAll method:");
        testAuthorList = authorService.getAll();
        System.out.println("Result: ---------------------------------------------");
        testAuthorList.stream().forEach(System.out::println);
        System.out.println();


        //Challenge
        //failed to lazily initialize a collection of role:
        // entities.Author.postList, could not initialize proxy - no Session

/*        //Lazy fetch solution 1 (Worked)
        Session thisSession = SessionFactoryProvider.getSessionFactory().openSession();
        thisSession.beginTransaction();
        Query query = thisSession
                .createQuery("SELECT a FROM Author a JOIN FETCH a.postList WHERE a.id = :authorId");
        query.setParameter("authorId", 1);
        Author a3 = (Author) query.getSingleResult();
        thisSession.getTransaction().commit();
        thisSession.close();
        System.out.println("=================================");
        System.out.println(a3);*/


        //Lazy fetch solution 2 (Not worked!)
/*        Session thisSession = SessionFactoryProvider.getSessionFactory().openSession();
        thisSession.beginTransaction();
        Author a2 = authorService.getByID("entities.Author", 1);
        if (!Hibernate.isInitialized(a2.getPostList())) {
            Hibernate.initialize(a2.getPostList());
        }
        thisSession.getTransaction().commit();
        thisSession.close();
        System.out.println("=================================");
        System.out.println(a2);*/


    }
}

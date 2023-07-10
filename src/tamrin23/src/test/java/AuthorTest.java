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
        testAuthor = authorService.getByName("Ehsan");
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



    }
}

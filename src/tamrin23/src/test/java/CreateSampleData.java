import entities.Author;
import entities.AuthorDetail;
import entities.Category;
import entities.Post;
import service.EntityBaseService;

import java.time.LocalDate;
import java.util.Set;

public class CreateSampleData {

    public static void main(String[] args) {

        //Creating Initial Sample Data

        //Create Author & AuthorDetails ---------------------------------------
        EntityBaseService<Author> authorBS = new EntityBaseService<>();
        EntityBaseService<AuthorDetail> authorDetailBS = new EntityBaseService<>();

        Author a1 = new Author("Ali", LocalDate.of(2001, 1, 1));
        authorBS.save(a1);
        AuthorDetail ad1 = new AuthorDetail("iranian author", a1);
        authorDetailBS.save(ad1);

        Author a2 = new Author("Soheyl", LocalDate.of(2002, 2, 2));
        authorBS.save(a2);
        AuthorDetail ad2 = new AuthorDetail("iranian author", a2);
        authorDetailBS.save(ad2);

        Author a3 = new Author("Mersedeh", LocalDate.of(2003, 3, 3));
        authorBS.save(a3);
        AuthorDetail ad3 = new AuthorDetail("iranian author", a3);
        authorDetailBS.save(ad3);

        Author a4 = new Author("Homa", LocalDate.of(2004, 4, 4));
        authorBS.save(a4);
        AuthorDetail ad4 = new AuthorDetail("iranian author", a4);
        authorDetailBS.save(ad4);

        Author a5 = new Author("Reza", LocalDate.of(1999, 9, 9));
        authorBS.save(a5);
        AuthorDetail ad5 = new AuthorDetail("iranian author", a5);
        authorDetailBS.save(ad5);

        Author a6 = new Author("Ehsan Babaie", LocalDate.of(1998, 8, 8));
        authorBS.save(a6);
        AuthorDetail ad6 = new AuthorDetail("iranian author", a6);
        authorDetailBS.save(ad6);


        //Create Categories ---------------------------------------------------
        EntityBaseService<Category> categoryBS = new EntityBaseService<>();

        Category c1 = new Category("SQL");
        categoryBS.save(c1);

        Category c2 = new Category("Hibernate");
        Category c3 = new Category("JPA");
        Category c4 = new Category("JAVA SE");
        Category c5 = new Category("Spring");
        Category c6 = new Category("Spring Boot");
        categoryBS.save(c2);
        categoryBS.save(c3);
        categoryBS.save(c4);
        categoryBS.save(c5);
        categoryBS.save(c6);

        //Create Posts --------------------------------------------------------
        EntityBaseService<Post> postBS = new EntityBaseService<>();

        Post p1 = new Post("SQL content 1", a1, Set.of(c1));
        Post p2 = new Post("SQL content 2", a1, Set.of(c1));
        Post p3 = new Post("SQL & JPA content", a1, Set.of(c1, c3));
        postBS.save(p1);
        postBS.save(p2);
        postBS.save(p3);

        Post p4 = new Post("JPA & Hibernate content", a2, Set.of(c2, c3));
        postBS.save(p4);
        Post p5 = new Post("Spring content", a3, Set.of(c5));
        postBS.save(p5);
        Post p6 = new Post("Hibernate content", a4, Set.of(c2));
        postBS.save(p6);
        Post p7 = new Post("JPA & Java SE content", a5, Set.of(c3, c4));
        postBS.save(p7);
        Post p8 = new Post("Spring & Spring Boot content", a5, Set.of(c5, c6));
        postBS.save(p8);
        Post p9 = new Post("Spring & Spring Boot content", a6, Set.of(c5, c6));
        postBS.save(p9);

    }

}

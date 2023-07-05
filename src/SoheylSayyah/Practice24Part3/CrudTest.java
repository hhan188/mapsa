package SoheylSayyah.Practice24Part3;

import org.mapsaHR.SessionFactoryProvider;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CrudTest
{
    public static void main(String[] args)
    {
        AuthorService authorService = new AuthorService(SessionFactoryProvider.getSessionfactory());

        PostService postService = new PostService(SessionFactoryProvider.getSessionfactory());

//        CategoryService categoryService = new CategoryService(SessionFactoryProvider.getSessionfactory());
//
//        Author author1 = new Author("Ali",LocalDate.of(2019,12,5));
//
//        Author_Detail author1_detail = new Author_Detail("Haj");
//
        Post post1 = new Post("My Name is Ali",
                LocalDate.of(2023,05,23) , LocalTime.of(23,5,23) ,
                LocalDateTime.of(2022,05,23,23,54,32));
        Post post2 = new Post("I am 30", true,
                LocalDate.of(2023,05,23) , LocalTime.of(23,5,23) ,
                LocalDateTime.of(2022,05,23,23,54,32));
//
//        Category category1 = new Category("Category 1");
//        Category category2 = new Category("Category 2");
//
//        author1.setAuthorDetail(author1_detail);
//        author1_detail.setAuthor(author1);
//
//        post1.setAuthor(author1);
//        post2.setAuthor(author1);
//        author1.setPosts(List.of(post1,post2));
//
//        category1.setPosts(List.of(post1));
//        category2.setPosts(List.of(post1,post2));
//
//        post1.setCategories(List.of(category1));
//        post2.setCategories(List.of(category1,category2));
//
//        authorService.create(author1);
//        categoryService.create(category1);
//        categoryService.create(category2);

//        authorService.getByName("Ali");

//        authorService.getAll();

        postService.publish(1);
//        postService.getAllPublishedPost();

    }
}

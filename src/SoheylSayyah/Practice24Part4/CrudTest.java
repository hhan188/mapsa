package SoheylSayyah.Practice24Part4;

import org.mapsaHR.SessionFactoryProvider;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class CrudTest
{
    public static void main(String[] args)
    {
        AuthorService authorService = new AuthorService(SessionFactoryProvider.getSessionfactory());

        CategoryService categoryService = new CategoryService(SessionFactoryProvider.getSessionfactory());

        PostService postService = new PostService(SessionFactoryProvider.getSessionfactory());

        Author author1 = new Author("Ali",LocalDate.of(2019,12,5));

        Author_Detail author1_detail = new Author_Detail("Haj");

        Education education1 = new Education(Degree.NotEducated , "None");
        Education education2 = new Education(Degree.Bachelor , "Tehran University");

        Post post1 = new Post("My Name is Ali",
                LocalDate.of(2023,05,23) , LocalTime.of(23,5,23));
        Post post2 = new Post("I am 30", true,
                LocalDate.of(2023,05,23) , LocalTime.of(23,5,23));

        Category category1 = new Category("Category 1");
        Category category2 = new Category("Category 2");

        author1.setAuthorDetail(author1_detail);
        author1_detail.setAuthor(author1);

        author1_detail.setEducations(List.of(education1,education2));

        post1.setAuthor(author1);
        post2.setAuthor(author1);
        author1.setPosts(List.of(post1,post2));

        post1.setPostStatus(PostStatus.Published);
        post2.setPostStatus(PostStatus.Draft);

        post1.setCreateInfo(new CreateInfo(LocalDate.now(),"Ehsan"));
        post2.setCreateInfo(new CreateInfo(LocalDate.now(),"Ali"));

        authorService.create(author1);

        postService.create(post1);
        postService.create(post2);

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

//        postService.publish(1);
//        postService.getAllPublishedPost();


//        author1.getContactPoints().put(ContactTypes.Instagram , "SoheylSayyah");
//        author1.getHobbies().add("Sleeping");
//        author1.getLanguages().add("Persian");
//        post1.setPostStatus(PostStatus.Published);
//        postService.create(post1);
//        authorService.create(author1);





    }
}

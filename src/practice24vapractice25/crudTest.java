package practice24vapractice25;

import org.hibernate.type.LocalDateType;
import org.mapsa.entities.newPostKelas.practice24.enums.ConcatPointType;
import org.mapsa.entities.newPostKelas.practice24.enums.Degrees;
import org.mapsa.entities.newPostKelas.practice24.enums.Status;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class crudTest {

    public static void main(String[] args) {

        AuthorService authorService=new AuthorService(SessionFactoryProvider.getSessionFactory());
        CategoryService categoryService=new CategoryService(SessionFactoryProvider.getSessionFactory());




        Author author=new Author("sara",new Date());
        Author author2=new Author("tara",new Date());

        AuthorDetail authorDetail=new AuthorDetail("student");

        Post secondPost=new Post("second",Status.PUBLISHED);
        Post firstPost=new Post("first",Status.DELETED);



////one to one
        Education education1=new Education(Degrees.BACHELOR,"organization");
        Education education2=new Education(Degrees.MASTER,"organization");
        authorDetail.setEducations(List.of(education1,education2));


        author.setCreateInfo(new CreateInfo(LocalDate.of(2021,12,12), author.getName()));
        author.getHobbies().add("running");
        author.getHobbies().add("writing");
        author.getLanguages().add("French");
        author.getLanguages().add("American");
        author.getConcatPointType().put(ConcatPointType.FIRST,"value");

        author.setAuthorDetail(authorDetail);
        authorDetail.setAuthor(author);

//
//        //one to many



        firstPost.setCreateInfo((new CreateInfo(LocalDate.of(2011,12,12),"testing")));
        secondPost.setCreateInfo((new CreateInfo(LocalDate.of(2019,6,30),"testing")));
        List<Post> posts=List.of(firstPost,secondPost);
        firstPost.setAuthor(author2);
        author2.setPosts(posts);
       authorService.create(author2);
//

        ////manytomany
        Category firstCategory=new Category("first category");
        Category secondCategory=new Category("second category");

        firstCategory.setPost2s(List.of(firstPost));
        secondCategory.setPost2s(List.of(firstPost,secondPost));

        firstPost.setCategories(List.of(firstCategory));
        secondPost.setCategories(List.of(firstCategory,secondCategory));

        categoryService.create(firstCategory);
        categoryService.create(secondCategory);




        ///hql
//        categoryService.findName("second category");
//        categoryService.getAll();
//
//        authorService.findByName("sara");
//        authorService.getAll().forEach(t-> System.out.println(t));







    }
}

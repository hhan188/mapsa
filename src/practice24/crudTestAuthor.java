package practice24;

import practice24.SessionFactoryProvider;

public class crudTest {
    public static void main(String[] args) {

        AuthorService authorService=new AuthorService(SessionFactoryProvider.getSessionFactory());
        authorService.findByName("sara");
        authorService.getAll().forEach(t-> System.out.println(t));

//        CategoryService categoryService=new CategoryService(SessionFactoryProvider.getSessionFactory());
//
//
//        Author author=new Author("sara",new Date());
//        Author author2=new Author("tara",new Date());
//
//        AuthorDetail authorDetail=new AuthorDetail("student");
//
//        Post2 secondPost=new Post2("second");
//        Post2 firstPost=new Post2("first");
////one to one
//        author.setAuthorDetail(authorDetail);
//        authorDetail.setAuthor(author);
//        authorService.create(author);
//
//        //one to many
//        List<Post2> posts=List.of(firstPost,secondPost);
//
//        author.setPosts(posts);
//        authorService.create(author);
//
////manytomany
//        Category firstCategory=new Category("first category");
//        Category secondCategory=new Category("second category");
//
//        firstCategory.setPost2s(List.of(firstPost));
//        secondCategory.setPost2s(List.of(firstPost,secondPost));
//
//        firstPost.setCategories(List.of(firstCategory));
//        secondPost.setCategories(List.of(firstCategory,secondCategory));
//
//        categoryService.create(firstCategory);
//        categoryService.create(secondCategory);









    }
}

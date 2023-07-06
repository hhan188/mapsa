package org.example;

import org.example.Entites.Author;
import org.example.Entites.AuthorDetails;
import org.example.Entites.Category;
import org.example.Entites.Post;
import org.example.Services.AuthorService;
import org.example.Services.CategoryService;
import org.example.Services.PostService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService(SessionFactoryProvider.getSessionfactory());
        Author author1=new Author("Ehsan", LocalDate.of(2000,4,6));
        AuthorDetails authorDetails1 = new AuthorDetails(author1,"egegfefge");
        author1.setAuthorDetails(authorDetails1);
        authorDetails1.setAuthor(author1);
        authorService.createAuthorService(author1);


        PostService postService = new PostService(SessionFactoryProvider.getSessionfactory());
        Post p1 = new Post(author1,"wefwfeerewr",true, LocalDate.of(2000,1,5), LocalTime.of(12,3,23), LocalDateTime.of(2022,12,2,12,6,40));
        p1.setAuthor(author1);
        List<Post> pst = List.of(p1);
        author1.setPosts(pst);
        authorService.createAuthorService(author1);
        postService.published(5);
        postService.getAllPublishedPost();

        CategoryService categoryService = new CategoryService(SessionFactoryProvider.getSessionfactory());
        Category category1 = new Category("java",pst);
        category1.setPostList(pst);
        List<Category> ctg = List.of(category1);
        p1.setCategories(ctg);
        categoryService.createCategoryService(category1);
        System.out.println(p1.getAge());

    }
}
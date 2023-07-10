package org.example;

import org.example.Constant.ContactPointType;
import org.example.Constant.Degree;
import org.example.Constant.PostStatus;
import org.example.Entites.*;
import org.example.Services.AuthorService;
import org.example.Services.CategoryService;
import org.example.Services.PostService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService(SessionFactoryProvider.getSessionfactory());
        Author author1=new Author("Ehsan", LocalDate.of(2000,4,6));
        AuthorDetails authorDetails1 = new AuthorDetails(author1,"egegfefge");
        author1.setAuthorDetails(authorDetails1);
        authorDetails1.setAuthor(author1);
        EducationEmbedable educationEmbedable = new EducationEmbedable(Degree.bachelor,"university");
        EducationEmbedable educationEmbedable1 = new EducationEmbedable(Degree.master,"TehranUniversity");
        authorDetails1.setEducations(List.of(educationEmbedable1,educationEmbedable));
        authorService.createAuthorService(author1);


        PostService postService = new PostService(SessionFactoryProvider.getSessionfactory());
        Post p1 = new Post(author1,"wefwfeerewr",true, LocalDate.of(2000,1,5), LocalTime.of(12,3,23));



        p1.setAuthor(author1);
        List<Post> pst = List.of(p1);
        author1.setPosts(pst);
        postService.published(5);
        p1.setPostStatus(PostStatus.published);

        CreateInfo createInfo = new CreateInfo();
        createInfo.setCreateDate(LocalDate.of(2000,5,12));
        createInfo.setCreateUser("Ehsan");
        p1.setCreateInfo(createInfo);

        postService.createPostService(p1);

        author1.getHobbies().add("mench");
        author1.getLanguages().add("farsi");
        author1.getContactPoint().put(ContactPointType.instagram,"ehsanshademani");
        authorService.createAuthorService(author1);



        CategoryService categoryService = new CategoryService(SessionFactoryProvider.getSessionfactory());
        Category category1 = new Category("java",pst);
        category1.setPostList(pst);
        List<Category> ctg = List.of(category1);
        p1.setCategories(ctg);
        categoryService.createCategoryService(category1);
//        System.out.println(p1.getAge());


    }
}
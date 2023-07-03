package org.example.Entites;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Post {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "Author_id")
    private Author author;
    @Column
    private String content;
    @ManyToMany(mappedBy = "postList")
    private List<Category> categories = new ArrayList<>();
    public Post(Author author, String content) {
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

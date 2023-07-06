package org.example.Entites;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @Column(name = "CATEGORY_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    @ManyToMany(cascade = {
            CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(
         name = "Post_Category",
            joinColumns = @JoinColumn(name = "CATEGORY_id"),
            inverseJoinColumns = @JoinColumn(name = "Post_id")
    )
    private List<Post> postList = new ArrayList<>();

    public Category(String title, List<Post> postList) {
        this.title = title;
        this.postList = postList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}

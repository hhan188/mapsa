package org.example.Entites;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="author" )
public class Author {
    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @Column
    private String name;
    @Column
    private Date birthDay;

    @OneToOne(mappedBy = "author" , cascade = CascadeType.ALL)
    private AuthorDetails authorDetails;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();

    public Author() {
    }

    public Author(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public AuthorDetails getAuthorDetails() {
        return authorDetails;
    }

    public void setAuthorDetails(AuthorDetails authorDetails) {
        this.authorDetails = authorDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}

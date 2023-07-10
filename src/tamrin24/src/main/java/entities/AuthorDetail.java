package entities;

import embeddeds.Education;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AuthorDetail {


    private Integer id;
    private String bio;
    private List<Education> educationList = new ArrayList<>();
    private Author author;

    //Constructor -------------------------------------------------------------
    public AuthorDetail() {
    }

    public AuthorDetail(String bio, Author author) {
        this.bio = bio;
        this.author = author;
    }

    //Getters -----------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public String getBio() {
        return bio;
    }

    @ElementCollection
    public List<Education> getEducationList() {
        return educationList;
    }

    @OneToOne(optional = false)
    @JoinColumn(name = "author_id",nullable = false, referencedColumnName = "id")
    public Author getAuthor() {
        return author;
    }


    //Setters -----------------------------------------------------------------

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "AuthorDetail{" +
                "id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }
}

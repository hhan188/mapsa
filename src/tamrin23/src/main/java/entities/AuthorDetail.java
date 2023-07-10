package entities;

import javax.persistence.*;

@Entity
public class AuthorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String bio;

    @OneToOne(optional = false)
    @JoinColumn(name = "author_id",nullable = false, referencedColumnName = "id")
    private Author author;

    //Constructor
    public AuthorDetail() {

    }

    public AuthorDetail(String bio, Author author) {
        this.bio = bio;
        this.author = author;
    }

    //Getters
    public Integer getId() {
        return id;
    }

    public String getBio() {
        return bio;
    }

    public Author getAuthor() {
        return author;
    }

    //Setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBio(String bio) {
        this.bio = bio;
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

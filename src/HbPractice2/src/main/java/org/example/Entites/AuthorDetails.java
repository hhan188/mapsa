package org.example.Entites;

import javax.persistence.*;
@Entity
@Table(name="authorDetails")
public class AuthorDetails {
    @Id
    @Column(name = "author_detail_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;
    @Column (name="bio")
    private String bio;

    public AuthorDetails() {
    }

    public AuthorDetails(Author author, String bio) {
        this.author = author;
        this.bio = bio;
    }

    public int getId() {
        return id;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}

package practice24vapractice25;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//in foreign key dare
@Entity
@Table(name="author_Detail")
public class AuthorDetail {

    public AuthorDetail() {
    }

    @Id
    @Column(name="author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column (name="bio")
    private String bio;

    @OneToOne
    @JoinColumn(name="author_id")//** esm sotoon ro minevisim
    private Author author;//mikhaym begim be kodum table vasl she


    @ElementCollection()
    List<Education> educations=new ArrayList<>();

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public AuthorDetail(String bio) {
        this.bio = bio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

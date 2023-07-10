package entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    private Integer id;

    private String name;

    private LocalDate birthdate;

    private AuthorDetail authorDetail;

    private Set<Post> postSet = new HashSet<>();


    //Constructor -------------------------------------------------------------
    public Author() {
    }

    public Author(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    //Getter ------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @OneToOne(mappedBy = "author",
            orphanRemoval = true)
    public AuthorDetail getAuthorDetail() {

        return authorDetail;
    }


    @OneToMany(mappedBy = "author",
            cascade = CascadeType.REMOVE,
            orphanRemoval = true)
    public Set<Post> getPostSet() {

        return postSet;
    }


    //Setter ------------------------------------------------------------------
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setAuthorDetail(AuthorDetail authorDetail) {
        this.authorDetail = authorDetail;
    }

    public void setPostSet(Set<Post> postSet) {
        this.postSet = postSet;
    }


    @Override
    public String toString() {

        String result = "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", authorDetail=" + authorDetail +
                '}';

        return result;
    }
}

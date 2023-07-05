package practice24;

import org.mapsa.entities.practice24.Post2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// in source
@Entity
@Table(name="author")
public class Author  {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;


    @OneToOne(mappedBy ="author" ,cascade = CascadeType.ALL)//mesl ye field mimoone
    private AuthorDetail authorDetail;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL )
    private List<Post2> posts=new ArrayList<>();



    public Author() {
    }

    public List<Post2> getPosts() {
        return posts;
    }

    public void setPosts(List<Post2> posts) {
        this.posts = posts;
    }

    public Author(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public AuthorDetail getAuthorDetail() {
        return authorDetail;
    }

    public void setAuthorDetail(AuthorDetail authorDetail) {
        this.authorDetail = authorDetail;
    }


    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", authorDetail=" + authorDetail +
                '}';
    }
}

package SoheylSayyah.Practice24;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Author implements Serializable
{
    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer authorId;
    @Column(name = "name")
    private String name;
    @Column(name = "birth_day")
    @Temporal(TemporalType.DATE)
    private Date birthDay;
    @OneToOne(mappedBy = "author" , cascade = CascadeType.ALL)
    private Author_Detail authorDetail;
    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();

    public Author(String name, Date birthDay)
    {
        this.name = name;
        this.birthDay = birthDay;
    }

    public Integer getAuthorId()
    {
        return authorId;
    }

    public void setAuthorId(Integer authorId)
    {
        this.authorId = authorId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(Date birthDay)
    {
        this.birthDay = birthDay;
    }

    public Author_Detail getAuthorDetail()
    {
        return authorDetail;
    }

    public void setAuthorDetail(Author_Detail authorDetail)
    {
        this.authorDetail = authorDetail;
    }

    public List<Post> getPosts()
    {
        return posts;
    }

    public void setPosts(List<Post> posts)
    {
        this.posts = posts;
    }

    @Override
    public String toString()
    {
        return "Author{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", authorDetail=" + authorDetail +
                ", posts=" + posts +
                '}';
    }
}

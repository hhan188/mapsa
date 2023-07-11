package SoheylSayyah.Practice24Part4;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

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
    private LocalDate birthDay;
    @OneToOne(mappedBy = "author" , cascade = CascadeType.ALL)
    private Author_Detail authorDetail;
    @OneToMany(mappedBy = "author" , cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();
    @ElementCollection(fetch = FetchType.EAGER)
    @OrderColumn
    private List<String> hobbies = new ArrayList<>();
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> Languages = new HashSet<>();
    @ElementCollection(fetch = FetchType.EAGER)
    @MapKeyEnumerated(EnumType.STRING)
    private Map<ContactTypes , String> contactPoints = new HashMap<>();
    @Embedded
    private CreateInfo createInfo;
    public Author(String name, LocalDate birthDay)
    {
        this.name = name;
        this.birthDay = birthDay;
    }
    public CreateInfo getCreateInfo()
    {
        return createInfo;
    }

    public void setCreateInfo(CreateInfo createInfo)
    {
        this.createInfo = createInfo;
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

    public LocalDate getBirthDay()
    {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay)
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

    public Author()
    {
    }

    public List<String> getHobbies()
    {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies)
    {
        this.hobbies = hobbies;
    }

    public Set<String> getLanguages()
    {
        return Languages;
    }

    public void setLanguages(Set<String> languages)
    {
        Languages = languages;
    }

    public Map<ContactTypes, String> getContactPoints()
    {
        return contactPoints;
    }

    public void setContactPoints(Map<ContactTypes, String> contactPoints)
    {
        this.contactPoints = contactPoints;
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

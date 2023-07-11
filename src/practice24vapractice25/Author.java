package practice24vapractice25;

import org.mapsa.entities.newPostKelas.practice24.enums.ConcatPointType;

import javax.persistence.*;
import java.util.*;

// in source
@Entity
@Table(name="Author")
public class Author {

    @Id
    @Column(name="author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;

    @Column(name="name")
    private String name;

    @Column(name="birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthdate;


    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name="author_hobbies" ,joinColumns = @JoinColumn(name="author_fk_id"))
    @Column(name="hobbies")
    List<String> hobbies=new ArrayList<>();

    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name="author_languages" ,joinColumns = @JoinColumn(name="author_fk_id"))
    @Column(name="languages")
    Set<String> languages=new HashSet<>();


    @ElementCollection
    @MapKeyColumn(name = "concatPoint_type")
    @MapKeyEnumerated(EnumType.STRING)
    private Map<ConcatPointType, String> concatPointType = new HashMap<>() ;



    @OneToOne(mappedBy ="author" ,cascade = CascadeType.ALL)//mesl ye field mimoone
    private AuthorDetail authorDetail;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL )
    private List<Post> posts=new ArrayList<>();

    @Embedded
    private CreateInfo createInfo;
    public CreateInfo getCreateInfo() {
        return createInfo;
    }

    public void setCreateInfo(CreateInfo createInfo) {
        this.createInfo = createInfo;
    }

    public Author() {
    }

    public Map<ConcatPointType, String> getConcatPointType() {
        return concatPointType;
    }

    public void setConcatPointType(Map<ConcatPointType, String> concatPointType) {
        this.concatPointType = concatPointType;
    }

    public Set<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Author(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;

    }

    public Integer getId() {
        return author_id;
    }

    public void setId(Integer id) {
        this.author_id = id;
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
                "id=" + author_id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", authorDetail=" + authorDetail +
                '}';
    }
}

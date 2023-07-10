package org.example.Entites;

import org.example.Constant.ContactPointType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

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
    private LocalDate birthDay;

    @OneToOne(mappedBy = "author" , cascade = CascadeType.ALL)
    private AuthorDetails authorDetails;
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> hobbies= new ArrayList<>();
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> languages = new HashSet<>();
    @ElementCollection(fetch = FetchType.EAGER)
    @MapKeyEnumerated(EnumType.STRING)
    private Map<ContactPointType,String> contactPoint = new HashMap<>();
    @Embedded
    private CreateInfo createInfo;

    public Author() {
    }

    public Author(String name, LocalDate birthDay) {
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

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Set<String> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }

    public Map<ContactPointType, String> getContactPoint() {
        return contactPoint;
    }

    public void setContactPoint(Map<ContactPointType, String> contactPoint) {
        this.contactPoint = contactPoint;
    }

    public CreateInfo getCreateInfo() {
        return createInfo;
    }

    public void setCreateInfo(CreateInfo createInfo) {
        this.createInfo = createInfo;
    }
}

package entities;

import embeddeds.CreateInfo;
import embeddeds.Education;
import enums.ContactPointType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

@Entity
public class Author {

    private Integer id;
    private String name;
    private LocalDate birthdate;
    private AuthorDetail authorDetail;
    private Set<Post> postSet = new HashSet<>();
    private List<String> hobbies = new ArrayList<>();
    private Set<String> languages = new HashSet<>();
    private Map<ContactPointType, String> contactPoints = new HashMap<>();
    private Education education;
    private CreateInfo createInfo = new CreateInfo();

    //Constructor -------------------------------------------------------------
    public Author() {
    }

    public Author(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.createInfo.setCreateDate(LocalDate.now());
        this.createInfo.setCreateUser("Me!");
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

    @ElementCollection
    public List<String> getHobbies() {
        return hobbies;
    }

    @ElementCollection
    public Set<String> getLanguages() {
        return languages;
    }

    @ElementCollection
    @MapKeyEnumerated(EnumType.STRING)
    public Map<ContactPointType, String> getContactPoints() {
        return contactPoints;
    }

    @Embedded
    public Education getEducation() {
        return education;
    }

    @Embedded
    public CreateInfo getCreateInfo() {
        return createInfo;
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

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setLanguages(Set<String> languages) {
        this.languages = languages;
    }

    public void setContactPoints(Map<ContactPointType, String> contactPoints) {
        this.contactPoints = contactPoints;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public void setCreateInfo(CreateInfo createInfo) {
        this.createInfo = createInfo;
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

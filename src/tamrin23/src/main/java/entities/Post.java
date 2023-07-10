package entities;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Access(AccessType.PROPERTY)
public class Post {

    private Integer id;

    private String content;

    private Author author;

    private Set<Category> categorySet = new HashSet<>();

    private boolean isPublished;

    private LocalDate publishDate;

    private LocalTime publishTime;

    private LocalDateTime createDate;

    private Duration age;





    //Constructor =============================================================

    public Post() {
    }
    public Post(String content, Author author, Set<Category> categorySet) {
        this.content = content;
        this.author = author;
        this.categorySet = categorySet;
        this.isPublished = false;
        this.createDate = LocalDateTime.now();
    }


    //Getters =================================================================

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    public String getContent() {
        return content;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "author_id", nullable = false, referencedColumnName = "id")
    public Author getAuthor() {
        return author;
    }


    /*By convention, the @JoinTable annotation is typically placed on the owning side of the relationship,
    which is the side that defines the @OneToMany or @OneToOne relationship to the join table.
    This is because the owning side of the relationship is responsible for
    managing the association between the related entities,
    and the join table is usually created based on the foreign key constraints of the owning side.*/
    @ManyToMany
    @JoinTable(name = "Join_Category_Post"
            , joinColumns = @JoinColumn(name = "post_id")
            , inverseJoinColumns = @JoinColumn(name = "category_id"))
    public Set<Category> getCategorySet() {
        return categorySet;
    }

    public boolean isPublished() {
        return isPublished;
    }
    public LocalDate getPublishDate() {
        return publishDate;
    }

    public LocalTime getPublishTime() {
        return publishTime;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    @Transient
    public Duration getAge() {
        Duration duration = Duration.between(LocalDateTime.now(),this.createDate);
        return duration;
    }


    //Setters =================================================================
    public void setId(Integer id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCategorySet(Set<Category> categorySet) {
        this.categorySet = categorySet;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setPublishTime(LocalTime publishTime) {
        this.publishTime = publishTime;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public void setAge(Duration age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", isPublished=" + isPublished +
                ", publishDate=" + publishDate +
                ", publishTime=" + publishTime +
                ", createDate=" + createDate +
                ", age=" + getAge() +
                '}';
    }
}

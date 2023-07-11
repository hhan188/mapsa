package practice24vapractice25;

import org.mapsa.entities.newPostKelas.practice24.enums.Status;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Access(AccessType.PROPERTY)
@Table(name="Post")
public class Post {

    private Integer post_id;
    private String content;
    private boolean published;
    private LocalDate published_date;
    private LocalTime published_time;
    private LocalDateTime create_date;
    private Duration age;
    private Author author;
    private Status status;
    private CreateInfo createInfo;


    @Transient
    public Duration getAge() {
        Duration duration = Duration.between( LocalDateTime.now(), getCreate_date());
        return duration;
    }

    public void setAge(Duration age) {
        this.age = age;
    }

    @Column(name="create_date")
    public LocalDateTime getCreate_date() {
        return create_date;
    }

    public void setCreate_date(LocalDateTime create_date) {
        this.create_date = create_date;
    }


    @Column(name="publish_Time")
  //  @Temporal(TemporalType.TIME)
    public LocalTime getPublished_time() {
        return published_time;
    }


    public void setPublished_time(LocalTime published_time) {
        this.published_time = published_time;
    }

    @Column(name="published")
    public boolean getPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Enumerated(EnumType.STRING)
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    private List<Category> categories=new ArrayList<>();


    @Column(name="publishDate")
   // @Temporal(TemporalType.TIMESTAMP)
    public LocalDate getPublished_date() {
        return published_date;
    }
    public void setPublished_date(LocalDate published_date) {
        this.published_date = published_date;
    }
    @ManyToMany(mappedBy = "post2s")
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }




    @Column(name="content")
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @ManyToOne
    @JoinColumn(name="author_id")
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Embedded
    public CreateInfo getCreateInfo() {
        return createInfo;}
    public void setCreateInfo(CreateInfo createInfo) {
        this.createInfo = createInfo;
    }

    public Post(String content, boolean published, LocalDate published_date, LocalTime published_time, LocalDateTime create_date, Author author, List<Category> categories) {
        this.content = content;
        this.published = published;
        this.published_date = published_date;
        this.published_time = published_time;
        this.create_date = create_date;
        this.author = author;
        this.categories = categories;
    }

    public Post(String content, boolean published, LocalDate published_date, LocalTime published_time, LocalDateTime create_date) {
        this.content = content;
        this.published = published;
        this.published_date = published_date;
        this.published_time = published_time;
        this.create_date = create_date;
    }

    public Post(String content, boolean published, LocalDate published_date, LocalTime published_time, LocalDateTime create_date, Duration age, Status status, Author author, List<Category> categories) {
        this.content = content;
        this.published = published;
        this.published_date = published_date;
        this.published_time = published_time;
        this.create_date = create_date;
        this.age = age;
        this.status = status;
        this.author = author;
        this.categories = categories;
    }

    public Post(String content) {
        this.content = content;

    }

    public Post( String content,Status status) {

        this.content = content;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="post_id")

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public Post() {

    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", content='" + content + '\'' +
                ", published=" + published +
                ", published_date=" + published_date +
                ", published_time=" + published_time +
                ", create_date=" + create_date +
                ", age=" + age +
                ", author=" + author +
                ", status=" + status +
                ", categories=" + categories +
                ", createInfo=" + createInfo +
                '}';
    }
}

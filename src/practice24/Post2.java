package practice24;

import practice24.Category;
import practice24.Author;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Access(AccessType.PROPERTY)
@Table(name="post2")
public class Post2 {


    private Integer id;


    private String content;

    private boolean published;

    private LocalDate published_date;

    private LocalTime published_time;

    private LocalDateTime create_date;

    private Duration age;

    @Transient
    public Duration getAge() {
        Duration duration = Duration.between( LocalDateTime.now(), getCreate_date());
        return duration;
    }


    @Column(name="create_date")
    public LocalDateTime getCreate_date() {
        return create_date;
    }

    public void setCreate_date(LocalDateTime create_date) {
        this.create_date = create_date;
    }


    @Column(name="publishTime")
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



    private Author author;


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


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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

    public Post2( String content, boolean published, LocalDate published_date, LocalTime published_time, LocalDateTime create_date, Author author, List<Category> categories) {
        this.content = content;
        this.published = published;
        this.published_date = published_date;
        this.published_time = published_time;
        this.create_date = create_date;
        this.author = author;
        this.categories = categories;
    }

    public Post2(String content, boolean published, LocalDate published_date, LocalTime published_time, LocalDateTime create_date) {
        this.content = content;
        this.published = published;
        this.published_date = published_date;
        this.published_time = published_time;
        this.create_date = create_date;
    }

    public Post2(String content) {
        this.content = content;

    }
    public Post2() {}

    @Override
    public String toString() {
        return "Post2{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", published='" + published + '\'' +
                ", published_date=" + published_date +
                ", published_time=" + published_time +
                ", create_date=" + create_date +
                ", author=" + author +
                ", categories=" + categories +
                '}';
    }
}

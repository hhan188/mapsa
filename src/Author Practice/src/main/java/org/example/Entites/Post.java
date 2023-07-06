package org.example.Entites;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Access(AccessType.PROPERTY)
public class Post {

    private int id;

    private Author author;

    private String content;

    private List<Category> categories = new ArrayList<>();
    private boolean publish ;

    private LocalDate publishDate;

    private LocalTime publishTime;
    private LocalDateTime createDate;

    private Duration age;

    public Post(Author author, String content, boolean publish, LocalDate publishDate, LocalTime publishTime, LocalDateTime createDate) {
        this.author = author;
        this.content = content;
        this.publish = false;
        this.publishDate = publishDate;
        this.publishTime = publishTime;
        this.createDate = createDate;

    }
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    @Transient
    public Duration getAge() {
        Duration duration = Duration.between(LocalDateTime.now(),createDate);
        return duration;
    }


    public boolean isPublish() {
        return publish;
    }

    public void setPublish(boolean publish) {
        this.publish = publish;
    }
//    @Temporal(TemporalType.DATE)
    public LocalDate getPublishDate() {
        if (publish==false){
            return null;
        }
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
//    @Temporal(TemporalType.TIME)
    public LocalTime getPublishTime() {
        if (publish==false){
            return null;
        }
        return publishTime;
    }

    public void setPublishTime(LocalTime publishTime) {
        this.publishTime = publishTime;
    }
    @Column
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    @ManyToMany(mappedBy = "postList")
    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public void setId(int id) {
        this.id = id;
    }
    @ManyToOne
    @JoinColumn(name = "Author_id")
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    @Column
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

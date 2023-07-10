package org.example.Entites;

import org.example.Constant.PostStatus;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
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

    private Duration age;
    private PostStatus postStatus;
    private CreateInfo createInfo;



    public Post(Author author, String content, boolean publish, LocalDate publishDate, LocalTime publishTime) {
        this.author = author;
        this.content = content;
        this.publish = false;
        this.publishDate = publishDate;
        this.publishTime = publishTime;

    }
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    @Transient
    public Duration getAge() {
        Duration duration = Duration.between(LocalDate.now(),createInfo.getCreateDate());
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


    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @ManyToMany(mappedBy = "postList")
    public List<Category> getCategories() {
        return categories;
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

    public Post() {
    }
    @Enumerated(EnumType.STRING)
    public PostStatus getPostStatus() {
        return postStatus;
    }

    public void setPostStatus(PostStatus postStatus) {
        this.postStatus = postStatus;
    }
    @Embedded
    public CreateInfo getCreateInfo() {
        return createInfo;
    }

    public void setCreateInfo(CreateInfo createInfo) {
        this.createInfo = createInfo;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author=" + author +
                ", content='" + content + '\'' +
                ", categories=" + categories +
                ", publish=" + publish +
                ", publishDate=" + publishDate +
                ", publishTime=" + publishTime +
                ", age=" + age +
                '}';
    }
}

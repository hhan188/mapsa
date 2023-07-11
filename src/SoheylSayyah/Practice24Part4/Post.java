package SoheylSayyah.Practice24Part4;


import javax.persistence.*;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Access(AccessType.PROPERTY)
public class Post implements Serializable
{
    private Integer postId;

    private String content;

    private Author author;

    private List<Category> categories = new ArrayList<>();
    private Boolean published;
    private LocalDate publishDate;
    private LocalTime publishTime;
//    private LocalDateTime createDate;
    private Duration age;
    private PostStatus postStatus;
    private CreateInfo createInfo;
    @Transient
    public Duration getAge()
    {
        return Duration.between(LocalDateTime.now(),createInfo.getCreateDate());
    }

//    public LocalDateTime getCreateDate()
//    {
//        return createDate;
//    }

    @Column(name = "published")
    public Boolean getPublished()
    {
        return published;
    }
    @Column(name = "publish_date")
    public LocalDate getPublishDate()
    {
        return publishDate;
    }
    @Column(name = "publish_time")
    public LocalTime getPublishTime()
    {
        return publishTime;
    }
//    @Column(name = "create_date")
//    public LocalDateTime getCreateDate()
//    {
//        return createDate;
//    }
    @Column
    @Enumerated(EnumType.STRING)
    public PostStatus getPostStatus()
    {
        return postStatus;
    }

    public void setPostStatus(PostStatus postStatus)
    {
        this.postStatus = postStatus;
    }
    @Embedded
    public CreateInfo getCreateInfo()
    {
        return createInfo;
    }

    public void setCreateInfo(CreateInfo createInfo)
    {
        this.createInfo = createInfo;
    }

    public void setPublished(Boolean published)
    {
        this.published = published;
    }

    public void setPublishDate(LocalDate publishDate)
    {
        this.publishDate = publishDate;
    }

    public void setPublishTime(LocalTime publishTime)
    {
        this.publishTime = publishTime;
    }

//    public void setCreateDate(LocalDateTime createDate)
//    {
//        this.createDate = createDate;
//    }

    public void setAge(Duration age)
    {
        this.age = age;
    }

    public Post(String content, Boolean published, LocalDate publishDate, LocalTime publishTime)
    {
        this.content = content;
        this.published = published;
        this.publishDate = publishDate;
        this.publishTime = publishTime;
    }

    public Post(String content, LocalDate publishDate, LocalTime publishTime)
    {
        this.published = false;
        this.content = content;
        this.publishDate = publishDate;
        this.publishTime = publishTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    public Integer getPostId()
    {
        return postId;
    }

    public void setPostId(Integer postId)
    {
        this.postId = postId;
    }
    @Column(name = "content")
    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }
    @ManyToOne
    @JoinColumn(name = "author_id")
    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }
    @ManyToMany(mappedBy = "posts")
    public List<Category> getCategories()
    {
        return categories;
    }

    public void setCategories(List<Category> categories)
    {
        this.categories = categories;
    }

    @Override
    public String toString()
    {
        return "Post{" +
                "postId=" + postId +
                ", content='" + content + '\'' +
                ", author=" + author +
                ", categories=" + categories +
                ", published=" + published +
                ", publishDate=" + publishDate +
                ", publishTime=" + publishTime +
                ", age=" + age +
                '}';
    }

    public Post()
    {
    }
}

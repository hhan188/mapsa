package SoheylSayyah.Practice24Part1;


import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Integer postId;
    @Column(name = "content")
    private String content;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    @ManyToMany(mappedBy = "posts")
    private List<Category> categories = new ArrayList<>();

    public Post(String content)
    {
        this.content = content;
    }

    public Integer getPostId()
    {
        return postId;
    }

    public void setPostId(Integer postId)
    {
        this.postId = postId;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

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
                '}';
    }
}

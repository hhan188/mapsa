package SoheylSayyah.Practice24;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "title")
    private String title;
    @ManyToMany(cascade = {CascadeType.DETACH , CascadeType.MERGE , CascadeType.PERSIST , CascadeType.REFRESH})
    @JoinTable(name = "Post_Category" , joinColumns  = @JoinColumn(name = "category_id") , inverseJoinColumns = @JoinColumn(name = "post_id"))
    private List<Post> posts = new ArrayList<>();

    public Category(String title)
    {
        this.title = title;
    }

    public Integer getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public List<Post> getPosts()
    {
        return posts;
    }

    public void setPosts(List<Post> posts)
    {
        this.posts = posts;
    }

    @Override
    public String toString()
    {
        return "Category{" +
                "categoryId=" + categoryId +
                ", title='" + title + '\'' +
                ", posts=" + posts +
                '}';
    }
}

package practice24;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="category")
public class Category {

    @Id
    @Column(name="category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer category_id;


    @Column(name="title")
    private String title;
    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinTable(name="post2_category",joinColumns = @JoinColumn(name="category_id"),inverseJoinColumns = @JoinColumn(name="post2_id"))
    private List<Post2> post2s = new ArrayList<>();


    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category(String title) {

        this.title = title;
    }

    public Category() {
    }

    public List<Post2> getPost2s() {
        return post2s;
    }

    public void setPost2s(List<Post2> post2s) {
        this.post2s = post2s;
    }
}

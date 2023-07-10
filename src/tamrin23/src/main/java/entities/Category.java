package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Category {

    private Integer id;

    private String title;


    private Set<Post> postSet = new HashSet<>();


    public Category() {
    }

    public Category(String title) {
        this.title = title;
    }

    //Getters -----------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    /*However, it's also possible to place the @JoinTable annotation on the non-owning side of the relationship,
     which is the side that defines the @ManyToMany relationship to the join table.
     This can be useful if you want to customize the properties of the join table from the non-owning side
     of the relationship, or if you want to define additional constraints or indexes on the join table.*/
    @ManyToMany(mappedBy = "categorySet")
    public Set<Post> getPostSet() {
        return postSet;
    }

    //Setters -----------------------------------------------------------------

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPostSet(Set<Post> postSet) {
        this.postSet = postSet;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

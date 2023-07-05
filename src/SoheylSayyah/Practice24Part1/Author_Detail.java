package SoheylSayyah.Practice24Part1;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Author_Detail implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_detail_id")
    private Integer author_detail_id;
    @Column(name = "bio")
    private String bio;
    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;

    public Author_Detail(String bio)
    {
        this.bio = bio;
    }

    public Integer getAuthor_detail_id()
    {
        return author_detail_id;
    }

    public void setAuthor_detail_id(Integer author_detail_id)
    {
        this.author_detail_id = author_detail_id;
    }

    public String getBio()
    {
        return bio;
    }

    public void setBio(String bio)
    {
        this.bio = bio;
    }

    public Author getAuthor()
    {
        return author;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Author_Detail{" +
                "author_detail_id=" + author_detail_id +
                ", bio='" + bio + '\'' +
                ", author=" + author +
                '}';
    }
}

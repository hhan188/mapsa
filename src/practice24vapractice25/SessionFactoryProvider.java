package practice24vapractice25;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.mapsa.entities.Recipe.Category2;
import org.mapsa.entities.Recipe.Food;
import org.mapsa.entities.Recipe.Ingredients;
import org.mapsa.entities.Recipe.Instructions;
import org.mapsa.entities.newPostKelas.practice24.enums.Status;
import org.mapsa.entities.practice22practice23.Album.Album;
import org.mapsa.entities.practice22practice23.Artist.Artist;
import org.mapsa.entities.practice22practice23.Artist.Artist_detail;
import org.mapsa.entities.practice22practice23.Song.Song;

public class SessionFactoryProvider {


    private static SessionFactory sf ;
    public static SessionFactory getSessionFactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(Author.class);
            cfg.addAnnotatedClass(AuthorDetail.class);
            cfg.addAnnotatedClass(Post.class);
            cfg.addAnnotatedClass(Category.class);
            cfg.addAnnotatedClass(Education.class);
            cfg.addAnnotatedClass(CreateInfo.class);
            cfg.addAnnotatedClass(Status.class);
//            cfg.addAnnotatedClass(Food.class);
//            cfg.addAnnotatedClass(Category2.class);
//            cfg.addAnnotatedClass(Instructions.class);
//            cfg.addAnnotatedClass(Ingredients.class);
//            cfg.addAnnotatedClass(Artist_detail.class);
//            cfg.addAnnotatedClass(Album.class);
//            cfg.addAnnotatedClass(Song.class);
//            cfg.addAnnotatedClass(Artist.class);



            sf = cfg.buildSessionFactory();
           // cfg.configure(); in mire to xml
            return sf ;
        }

        return sf ;
    }
}
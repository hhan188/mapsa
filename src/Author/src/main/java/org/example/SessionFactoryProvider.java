package org.example;

import org.example.Entites.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider
{

    private static SessionFactory sf;
    public static SessionFactory getSessionfactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(Author.class);
            cfg.addAnnotatedClass(AuthorDetails.class);
            cfg.addAnnotatedClass(Post.class);
            cfg.addAnnotatedClass(Category.class);
            cfg.addAnnotatedClass(CreateInfo.class);
            cfg.addAnnotatedClass(EducationEmbedable.class);
            sf = cfg.buildSessionFactory();
            return sf;
        }
        return sf;
    }


}

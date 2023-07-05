package practice24;

import org.mapsa.entities.practice23.SessionFactoryProvider;
import org.mapsa.entities.practice24.Post2Services;

public class crudMaintamrinkelasTemporalAccessmodifier {
    public static void main(String[] args) {

        Post2Services post2Services=new Post2Services(SessionFactoryProvider.getSessionFactory());
       // Post2 post2 = new Post2("test",false, LocalDate.of(2023,12,12), LocalTime.of(12,12,12),LocalDateTime.now());
        //System.out.println(post2.getAge());
          post2Services.publish(5);
        // post2Services.create(post2);
      //  post2Services.findName("test");
       // post2Services.getAll();
        //post2Services.getAllPublishedPosts();

    }
}

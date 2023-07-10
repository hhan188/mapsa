import entities.Post;
import service.PostService;

import java.util.List;

public class PostTest {
    public static void main(String[] args) {

        PostService postService = new PostService();

        Post testPost;
        List<Post> postList;
        List<Object[]> resultList;

        //Test publishing
        System.out.println("\nPublish (post by id) ---");
        postService.publishPost(5);

        System.out.println("\nResult after publish ===");
        testPost = (Post) postService.getByID("entities.Post", 5);
        System.out.println(testPost);

        //Test getPostsByAuthorName
        System.out.println("\nRetrieving Reza posts ---");
        postList = postService.getPostsByAuthorName("Reza");
        System.out.println("\nResult for retrieving Reza posts ===");
        postList.stream().forEach(p -> System.out.println(p.getId() + ": " + p.getContent()));

        //Test getAllPosts
        System.out.println("\nRetrieving All posts ---");
        resultList = postService.getAllPosts();
        System.out.println("\nResult for retrieving All posts ===");
        for (Object[] result : resultList) {
            System.out.println("id: " + result[0] + ", content: " + result[1]);
        }

        //Test getAllPublishedPosts
        System.out.println("\nRetrieving All Published posts ---");
        resultList = postService.getAllPublishedPosts();
        System.out.println("\nResult for retrieving All Published posts ===");
        for (Object[] result : resultList) {
            System.out.println("id: " + result[0] + ", content: " + result[1]);
        }

        //Test getPostByCategory
        System.out.println("\nRetrieving posts in specific category ---");
        resultList = postService.getPostByCategory("SQL");
        System.out.println("\nResult for posts in specific category ===");
        for (Object[] result : resultList) {
            System.out.println("id: " + result[0] + ", content: " + result[1]);
        }


    }


}

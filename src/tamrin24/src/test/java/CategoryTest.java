import service.CategoryService;

import java.util.List;

public class CategoryTest {

    public static void main(String[] args) {

        CategoryService categoryService = new CategoryService();
        List<Object[]> resultList;

        //Test getAllCategories
        System.out.println("\nRetrieving All Categories ---");
        resultList = categoryService.getAllCategories();
        System.out.println("\nResult for retrieving All Categories ===");
        for (Object[] result : resultList) {
            System.out.println("id: " + result[0] + ", title: " + result[1]);
        }
    }
}

package practice24;

import practice24.SessionFactoryProvider;
import practice24.CategoryService;

public class crudTest {
    public static void main(String[] args) {
        CategoryService categoryService= new CategoryService(SessionFactoryProvider.getSessionFactory());
        categoryService.findName("second category");
        categoryService.getAll();
    }
}

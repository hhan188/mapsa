package practices.practice17.exercise09;


import practices.practice17.Category;
import practices.practice17.Product;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //9 Group products by their categories


        Map<Category, List<Product>> products = Product.getAllProducts()
                .stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        products.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}

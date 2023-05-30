package practices.practice17.exercise04;


import practices.practice17.Product;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    //4 Sort the products by their names in ascending order.

        List<Product> products=Product.getAllProducts();

        products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .forEach(System.out::println);


    }
}

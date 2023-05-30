package practices.practice17.exercise01;


import practices.practice17.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1 Find all products with a price greater than $50.

        List<Product> productList = Product.getAllProducts();
        productList.stream().filter(n -> n.getPrice() > 50).forEach(System.out::println);


    }
}

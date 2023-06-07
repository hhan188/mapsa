package practices.practice17.exercise14;


import practices.practice17.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //14 Find the products with names containing the letter 'a'.

        List<Product> products = Product.getAllProducts().stream()
                .filter(product -> product.getName().contains("a"))
                .toList();


        products.forEach(System.out::println);


    }
}

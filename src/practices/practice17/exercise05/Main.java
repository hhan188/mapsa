package practices.practice17.exercise05;


import practices.practice17.Product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //5 Check if any product is out of stock.

        List<Product> productsOutOfStock = Product.getAllProducts().stream()
                .sorted(Comparator.comparing(Product::getId))
                .filter(n -> !n.isInStock()).collect(Collectors.toList());

        productsOutOfStock.forEach(System.out::println);


    }
}

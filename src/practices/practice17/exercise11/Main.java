package practices.practice17.exercise11;


import practices.practice17.Product;

import java.util.Optional;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
//11 Get the average price of all products in stock.

        OptionalDouble averagePrice = Product.getAllProducts()
                .stream()
                .mapToDouble(Product::getPrice)
                .average();

        averagePrice.ifPresent(System.out::println);


    }
}

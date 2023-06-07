package practices.practice17.exercise03;


import practices.practice17.Category;
import practices.practice17.Product;

import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
//3 Find the average price of all electronics products.

        List<Product> products = Product.getAllProducts();
        OptionalDouble avg = products.stream()
                .filter(product -> product.getCategory().equals(Category.ELECTRONICS))
                .mapToDouble(Product::getPrice)
                .average();

        System.out.println(avg.isPresent() ? avg.getAsDouble() : "Error");


    }
}

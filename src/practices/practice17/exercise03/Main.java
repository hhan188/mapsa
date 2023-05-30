package practices.practice17.exercise03;


import practices.practice17.Product;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//3 Find the average price of all electronics products.

        List<Product> products=Product.getAllProducts();
        double avg= products.stream()
                .mapToDouble(Product::getPrice).average().getAsDouble();
        System.out.println(avg);



    }
}

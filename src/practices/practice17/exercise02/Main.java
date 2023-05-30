package practices.practice17.exercise02;



import practices.practice17.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //2 Find the total price of all products in Warehouse A.

        List<Product> products=Product.getAllProducts();

        double sum =products.stream().mapToDouble(Product::getPrice).sum();
        System.out.println(sum);

    }
}

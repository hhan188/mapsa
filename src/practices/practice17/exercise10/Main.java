package practices.practice17.exercise10;


import practices.practice17.Category;
import practices.practice17.Product;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        //10 Find the cheapest product in the electronics category.

        List<Product> electronicProducts = Product.getAllProducts();

        Optional<Product> cheapestElectronicProduct = electronicProducts.stream()
                .filter(product -> product.getCategory().equals(Category.ELECTRONICS)).min(Comparator.comparing(Product::getPrice));

        System.out.println(cheapestElectronicProduct.isPresent() ? cheapestElectronicProduct.get() : "No product found");


    }
}

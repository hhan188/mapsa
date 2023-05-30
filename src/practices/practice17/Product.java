package practices.practice17;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {
    private int id;
    private String name;
    private double price;
    private Category category;
    private boolean inStock;

    private static List<Product> allProducts = new ArrayList<>(Arrays.asList(
            new Product(1, "iPhone 12", 999.99, Category.ELECTRONICS, true),
            new Product(2, "T-Shirt", 19.99, Category.CLOTHING, true),
            new Product(3, "Harry Potter", 14.99, Category.BOOKS, false),
            new Product(4, "Perfume", 59.99, Category.BEAUTY, true),
            new Product(5, "Football", 24.99, Category.SPORTS, true),
            new Product(6, "Laptop", 1299.99, Category.ELECTRONICS, true),
            new Product(7, "Jeans", 49.99, Category.CLOTHING, true),
            new Product(8, "The Great Gatsby", 9.99, Category.BOOKS, true),
            new Product(9, "Shampoo", 12.99, Category.BEAUTY, true),
            new Product(10, "Basketball", 19.99, Category.SPORTS, false)
    ));

    public Product(int id, String name, double price, Category category, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
    }
    // write getters, and setters
    // ...


    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Product setCategory(Category category) {
        this.category = category;
        return this;
    }

    public boolean isInStock() {
        return inStock;
    }

    public Product setInStock(boolean inStock) {
        this.inStock = inStock;
        return this;
    }

    public static void setAllProducts(List<Product> allProducts) {
        Product.allProducts = allProducts;
    }

    public static List<Product> getAllProducts() {
        return allProducts;
    }


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
package Tamrin17Streams;

import java.util.*;
import java.util.stream.Collectors;

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

    //1 Find all products with a price greater than $50.
    public static List<Product> greaterThanPrice(double price) {
        return
                getAllProducts().stream().filter(value -> value.getPrice() > price).collect(Collectors.toList());

    }

    //todo:Warehouse A.
    //2 Find the total price of all products in Warehouse A.
    public static Double totalPrice() {
        return
                getAllProducts().stream().filter(s -> s.inStock == true).mapToDouble(s -> s.getPrice()).sum();

    }

    //3 Find the average price of all electronics products.
    public static Double averagePrice() {
        return
                getAllProducts().stream().filter(s -> s.getCategory() == Category.ELECTRONICS).mapToDouble(s -> s.getPrice()).average().getAsDouble();

    }

    //4 Sort the products by their names in ascending order.
    public static List<Product> sortTheProducts() {
        return getAllProducts().stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).collect(Collectors.toList());
    /*    return
                getAllProducts().stream().sorted(Comparator.comparing(Product::getName).reversed()).collect(Collectors.toList());
*/
    }

    //5 Check if any product is out of stock.
    public static List<Product> outOfStock() {
        return getAllProducts().stream().filter(o -> !o.inStock).collect(Collectors.toList());
    }

    //9 Group products by their categories.
    public static Map<Category, List<Product>> groupProductByCategory() {
        return
                getAllProducts().stream().collect(Collectors.groupingBy(Product::getCategory));
    }

    //10 Find the cheapest product in the electronics category.
    public static Product cheapestProduct() {
        return getAllProducts().stream().filter(value ->value.getCategory()==Category.ELECTRONICS)
                .min(Comparator.comparing(Product::getPrice)).get();
    }

    public static void main(String[] args) {
      /*  List<Product> greaterThanPrice = greaterThanPrice(50);
        List<Product> sortTheProducts = sortTheProducts();
        Double d = averagePrice();*/
        Product p = cheapestProduct();

    }

    public Product(int id, String name, double price, Category category, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
    }

    public static void setAllProducts(List<Product> allProducts) {
        Product.allProducts = allProducts;
    }

    public static List<Product> getAllProducts() {
        return allProducts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

}

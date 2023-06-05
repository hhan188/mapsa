package Practice17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

    public Product(int id, String name, double price, Category category, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
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

    public static void setAllProducts(List<Product> allProducts) {
        Product.allProducts = allProducts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", inStock=" + inStock +
                '}';
    }

    public static void main(String[] args) {
        ////Practice 1
        System.out.println("Practice 1//////////////////////////////////////////////////////////////");
            List<Product> products = Product.getAllProducts();
            double prc = products.stream()
                    .filter(item->item.getPrice()>=50)
                    .peek(item-> System.out.println(item.getName()+" "+item.getPrice())).count();
        System.out.println("Practice 3////////////////////////////////////////////////////////////////");
            ////Practice 3
            double electronicPrice=allProducts.stream()
                    .filter(item->item.getCategory()==Category.ELECTRONICS)
                    .mapToDouble(Product::getPrice).average().orElseThrow(()-> new RuntimeException("not find"));
            System.out.println(electronicPrice);
        System.out.println("Practice 4//////////////////////////////////////////////////////////////");
            ////Practice 4

            allProducts
                    .stream()
                    .sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
                    .collect(Collectors.toList())
                    .forEach((product) -> System.out.println(product.getName()));
        System.out.println("Practice 5///////////////////////////////////////////////");
            ///////////////////////////////////////////////////////Practice 5
        System.out.println(products.stream()
                .anyMatch(product -> !product.isInStock()));
        System.out.println("Practice 9///////////////////////////////////////////////");
        /////Practice 9
        var productsByTheirCategories=products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(productsByTheirCategories);
        System.out.println("Practice 10/////////////////////////////////////////////////////////");
        var cheapestProductInTheElectronicsCategory = products.stream()
                .filter(item->item.getCategory()==Category.ELECTRONICS)
                .min(Comparator.comparing(Product::getPrice)).get();
        System.out.println(cheapestProductInTheElectronicsCategory);
        System.out.println("Practice 11 /////////////////////////////////////////////////////////");
        var  averagePriceOfAllProductsInStock = products.stream()
                .filter(item-> item.isInStock())
                .mapToDouble(Product::getPrice).average().getAsDouble();
        System.out.println(averagePriceOfAllProductsInStock);
        System.out.println("Practice14///////////////////////////////////////////////////////////");

        List<String>theProductsWithNamesContainingTheletterA = products.stream()
                .filter(product -> product.getName().contains("a")).map(Product::getName).collect(Collectors.toList());
        System.out.println(theProductsWithNamesContainingTheletterA);
        System.out.println("Practice 19 /////////////////////////////////////////////////////////");
        var sortTheProductsByTheirPricesInDescendingOrder = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed()).map(Product::getName).collect(Collectors.toList());

        System.out.println("Sort the products by their prices in descending order "+sortTheProductsByTheirPricesInDescendingOrder);
        System.out.println("Practice 20////////////////////////////////////////////////////////////");
        List<String> findTheNamesOfAllProductsInStock = products.stream()
                .filter(product -> product.isInStock())
                .map(Product::getName).collect(Collectors.toList());
        System.out.println(findTheNamesOfAllProductsInStock);
    }

}


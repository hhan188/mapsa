package SoheylSayyah.Practice17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {

    @Override
    public String toString()
    {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", inStock=" + inStock +
                '}';
    }

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

    public Product(int id, String name, double price, Category category, boolean inStock)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public Category getCategory()
    {
        return category;
    }
    public void setCategory(Category category)
    {
        this.category = category;
    }
    public boolean isInStock()
    {
        return inStock;
    }
    public void setInStock(boolean inStock)
    {
        this.inStock = inStock;
    }
    public static void setAllProducts(List<Product> allProducts)
    {
        Product.allProducts = allProducts;
    }
    public static List<Product> getAllProducts() {
        return allProducts;
    }
    public static void main(String[] args)
    {
        //1
        var productsMoreExpensiveThan50 = allProducts.stream().filter(item -> item.getPrice() >= 50).toList();
        System.out.println("All Products With a Price Greater Than $50 are : " + productsMoreExpensiveThan50);
        System.out.println("*****************************************************************************************");
        //3
        var averageOfAllElectronicProducts = allProducts.stream()
                .filter(item -> item.getCategory() == Category.ELECTRONICS)
                .mapToDouble(Product::getPrice).average().getAsDouble();
        System.out.println("Average Price of All Electronics Products is " + averageOfAllElectronicProducts);
        System.out.println("*****************************************************************************************");
        //4
        var sortedProducts = allProducts.stream().sorted(Comparator.comparing(Product::getName)).toList();
        System.out.println("All Products Based on Their Name is " + sortedProducts);
        System.out.println("*****************************************************************************************");
        //5
        var outOfStockProducts = allProducts.stream().filter(item -> !item.isInStock()).toList();
        System.out.println("All Products Out of Stock are " + outOfStockProducts);
        System.out.println("*****************************************************************************************");
        //9
        var productsByCategory = allProducts.stream().collect(Collectors.groupingBy(Product::getCategory));
        System.out.println(productsByCategory);
        System.out.println("*****************************************************************************************");
        //10
        var cheapestProductInTheElectronicsCategory = allProducts.stream()
                .filter(item -> item.getCategory() == Category.ELECTRONICS).min(Comparator.comparingDouble(Product::getPrice)).get();
        System.out.println("Cheapest Product in Electronics Category is " + cheapestProductInTheElectronicsCategory);
        System.out.println("*****************************************************************************************");
        //11
        var averagePriceOfAllProductsInStock = allProducts.stream().filter(Product::isInStock)
                .mapToDouble(Product::getPrice).average().getAsDouble();
        System.out.println("Average Price of All Products in Stock is " + averagePriceOfAllProductsInStock);
        System.out.println("*****************************************************************************************");
        //14
        var productsWithNamesContainingTheLetterA = allProducts.stream()
                .filter(n -> n.getName().contains("a")).toList();
        System.out.println(productsWithNamesContainingTheLetterA);
        System.out.println("*****************************************************************************************");
        //19
        var sortTheProductsByTheirPricesInDescendingOrder = allProducts.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).toList();
        System.out.println(sortTheProductsByTheirPricesInDescendingOrder);
        System.out.println("*****************************************************************************************");
        //20
        var findTheNamesOfAllProductsInStock = allProducts.stream().filter(n -> n.inStock).toList();
        System.out.println(findTheNamesOfAllProductsInStock);
    }
}
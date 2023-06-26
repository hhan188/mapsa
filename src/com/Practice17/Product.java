package com.Practice17;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String name;
    private double price;
    private Category category;
    private boolean inStock;

    private static List <Product> allProducts = new ArrayList<>(Arrays.asList(
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

    public Product ()
    {

    }

    // write getters, and setters
    // ...

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

    public static List<Product> getAllProducts() {
        return allProducts;
    }

    @Override
    public String toString()
    {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void printPricesGreaterThan ()
    {
        List <Product> products = Product.getAllProducts();

        List <Product> productsWithPriceGreater50 = products.stream().filter(i -> i.getPrice() >= 50).toList();

        productsWithPriceGreater50.forEach(i -> System.out.println(i.getName() + " : "  +i.getPrice()));
    }


    public static void outOfStock ()
    {
        allProducts.stream().filter(i -> !i.inStock).forEach(j -> System.out.println("Item " + j.getName() + " Is Out Of Stock"));
    }

    public static void sortAllProducts ()
    {
        List <Product> sortedProducts = allProducts.stream().sorted(Comparator.comparing(Product::getName)).toList();
        sortedProducts.forEach(i -> System.out.print(i.getName() + ", "));
        System.out.println();
    }

    public static void groupingProducts ()
    {
        Map<Category, List<Product>> productsByCategory = allProducts.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        StringBuilder out = new StringBuilder();
        productsByCategory.forEach((i, j) ->
        {
            out.append(i);
            j.forEach(k -> out.append(" | Name: ").append(k.getName()).append(" | Price: ").append(k.getPrice()));
            out.append("\n");
        });
        System.out.println(out);

        //productsByCategory.forEach((i, j) -> System.out.println(i + " " + j.toString()));
    }

    public static void inStockPriceAvg ()
    {
        System.out.println("The Average Price Of All Products in Stock = " + allProducts.stream().filter(i -> i.inStock)
                .mapToDouble(Product::getPrice).average().getAsDouble());
    }

    public static void cheapestProductInElectronic ()
    {
        StringBuilder out = new StringBuilder("Cheapest Product in Electronics: " );
        Product p = allProducts.stream().filter(i -> i.getCategory().equals(Category.ELECTRONICS))
                .min(Comparator.comparingDouble(Product::getPrice)).get();
        out.append(p.getName()).append(" | ").append("Price: ").append(p.getPrice());
        System.out.println(out);
    }

    public static void containingA ()
    {
        allProducts.stream().filter(i -> i.getName().contains("a")).toList()
                .forEach(j -> System.out.println(j.getName()));
    }

    public static void sortByPriceInDescending ()
    {
        List <Product> descendingSort = allProducts.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).toList();
        descendingSort.forEach(i -> System.out.println(i.getName() + " | " + i.getPrice()));
    }

    public static void nameOfAllInStockProducts ()
    {
        List <String> names = allProducts.stream()
                .filter(i -> i.inStock).toList().stream()
                .map(Product::getName).toList();

        names.forEach(System.out::println);
    }
}
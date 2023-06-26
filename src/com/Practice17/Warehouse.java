package com.Practice17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

class Warehouse {
    private int id;
    private String location;
    private List<Product> products;

    // write , getters, and setters
    // ...


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public void setProducts(List<Product> products)
    {
        this.products = products;
    }

    public static List<Warehouse> getAllWarehouses()
    {
        return allWarehouses;
    }

    public static void setAllWarehouses(List<Warehouse> allWarehouses)
    {
        Warehouse.allWarehouses = allWarehouses;
    }

    private static List<Warehouse> allWarehouses = new ArrayList<>(Arrays.asList(
            new Warehouse(1, "Warehouse A", Arrays.asList(
                    Product.getAllProducts().get(0),
                    Product.getAllProducts().get(1),
                    Product.getAllProducts().get(2)
            )),
            new Warehouse(2, "Warehouse B", Arrays.asList(
                    Product.getAllProducts().get(3),
                    Product.getAllProducts().get(4)
            )),
            new Warehouse(3, "Warehouse C", Arrays.asList(
                    Product.getAllProducts().get(3),
                    Product.getAllProducts().get(4)
            )),
            new Warehouse(4, "Warehouse D", Arrays.asList(
                    Product.getAllProducts().get(5)
            )),
            new Warehouse(5, "Warehouse E", Arrays.asList(
                    Product.getAllProducts().get(6),
                    Product.getAllProducts().get(7),
                    Product.getAllProducts().get(8),
                    Product.getAllProducts().get(9)
            ))
    ));

    public Warehouse(int id, String location, List<Product> products)
    {
        this.id = id;
        this.location = location;
        this.products = products;
    }

    public static void printAllPricesInWarehouseA ()
    {
        Stream <Warehouse> warehouseA = allWarehouses.stream()
                .filter(i -> i.getLocation().equals("Warehouse A"));

        DoubleStream totalPrice = warehouseA.flatMapToDouble(i -> i.getProducts().stream()
                .mapToDouble(Product::getPrice));

        System.out.println("Total Price Of All Products in Warehouse A: " + totalPrice.sum());
    }

    public static void avgPriceOfAllElectronicsProducts ()
    {
        double ePrices = allWarehouses.stream().flatMap(i -> i.getProducts().stream())
                .filter(j -> j.getCategory().equals(Category.ELECTRONICS))
                .mapToDouble(Product::getPrice).average().orElse(0.0);

        System.out.println("Average Of All Electronic Products: " + ePrices);
    }

    public static void nameOfProductsInWarehouseB ()
    {
        List <String> productsName = allWarehouses.stream().
                filter(i -> i.getLocation().equals("Warehouse B")).toList().stream().
                flatMap(i -> i.getProducts().stream()).
                toList().stream().map(Product::getName).toList();

        System.out.println(productsName);

    }

    public static void expensiveProducts ()
    {

        Map <Warehouse, Product> expensive = allWarehouses.stream()
                .collect(Collectors.toMap(Function.identity(), i -> i.getProducts().stream()
                        .max(Comparator.comparingDouble(Product::getPrice))
                        .orElseThrow(() -> new RuntimeException("Not Found"))));

        expensive.forEach((i, j) -> System.out.println("Warehouse: " + i.getLocation()
                + " | Product: " + j.getName() + " | Price: " + j.getPrice()));
    }

    public static void hasMoreThanTenProduct ()
    {
        Map <Warehouse, Boolean> hasTenProduct = allWarehouses.stream()
                .collect(Collectors.toMap(Function.identity(), i -> i.getProducts().size() > 10));

        hasTenProduct.forEach((i, j) -> System.out.println(i.getLocation() + " | Has More Than 10 Products: " + j));

    }

    public static void haveInStock ()
    {
        Map <String, Boolean> haveAtLeastOneInStockProduct = allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getLocation,
                        i -> {return i.getProducts().stream().anyMatch(Product::isInStock);}));

        haveAtLeastOneInStockProduct.forEach((i,j) -> System.out.println(i + " Have At Least One In Stock Product: " + j.toString()));
    }

    public static void highestPricedWarehouse ()
    {
        Warehouse sample = allWarehouses.stream()
                .max(Comparator.comparing(warehouse -> warehouse.getProducts().stream()
                        .mapToDouble(Product::getPrice).max()
                        .orElse(0))).orElseThrow(() -> new RuntimeException("Not Found"));

        StringBuilder x = new StringBuilder(sample.location + " | ");
        String y = sample.location + " | ";
        sample.getProducts().forEach(i -> x.append("Product: ").append(i.getName()).append(" | ").append(i.getPrice()));
        System.out.println(x);

    }

    public static void numberOFProductsInWarehouses ()
    {
        Map <String, Integer> numberOfProducts = allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getLocation, i -> i.getProducts().size()));
                 numberOfProducts.forEach((i,j) -> System.out.println(i + " | Number Of Products: " + j));
    }

    public static void largestWarehouse ()
    {
        Warehouse x = allWarehouses.stream()
                .max(Comparator.comparing(i -> i.getProducts().size()))
                .orElseThrow(() -> new RuntimeException("Not Found"));

        System.out.println("Warehouse With The Largest Number Of Products: " + "\" " + x.getLocation() + " \"");
    }

    public static void hasOnlyOneProduct ()
    {
        Map <String, Boolean> hasOneProduct = allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getLocation, i -> i.getProducts().size() == 1));

        hasOneProduct.forEach((warehouse, hasOne) -> System.out.println(warehouse + " Has One Product: " + hasOne));
    }

    public static void lowestPriceProductInWarehouseA ()
    {
        Product lowestPrice = allWarehouses.stream()
                .filter(i -> i.getLocation().equals("Warehouse A"))
                .flatMap(j -> j.getProducts().stream())
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("Not Found"));

        System.out.println("Lowest Priced Product In Warehouse A is: " + lowestPrice.getName() + " With Price: " + lowestPrice.getPrice());
    }
}
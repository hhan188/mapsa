package Practice17;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P17 {
    public static void main(String[] args) {
        List<Product> products = Product.getAllProducts();
        List<Warehouse> warehouses = Warehouse.getAllWarehouses();

//        * * 1 * *
        List<Product> greaterThan50 = products.stream().filter(product -> product.getPrice() > 50).toList();
        greaterThan50.forEach(product -> System.out.println(product.getPrice()));

//        * * 2 * *
        double totalOfWareHouseProduct = warehouses.stream()
                .flatMap(warehouse -> warehouse.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
        System.out.println(totalOfWareHouseProduct);

//        * * 3 * *
        OptionalDouble electronicAveragePrice = products.stream()
                .filter(product -> product.getCategory() == Category.ELECTRONICS)
                .mapToDouble(Product::getPrice)
                .average();
        System.out.println(electronicAveragePrice);

//        * * 4 * *
        List<Product> sortedProductsName = products.stream()
                .sorted(Comparator.comparing(Product::getName).reversed())
                .toList();
        sortedProductsName.forEach(product -> System.out.println(product.getName()));

//        * * 5 * *
        products.stream().filter(product -> !product.isInStock()).forEach(product -> System.out.println(product.isInStock()));

//        * * 6 * *
        warehouses.stream()
                .filter(product -> product.getLocation().equals("Warehouse B"))
                .flatMap(product -> product.getProducts().stream())
                        .forEach(item -> System.out.println(item.getName()));

//        * * 7 * *
        warehouses.stream().forEach(warehouse -> {
            Optional<Product> mostExpensive = warehouse.getProducts().stream()
                    .max(Comparator.comparingDouble(Product::getPrice));
                    mostExpensive.ifPresent(product -> {
                        System.out.println("WareHouse: " + warehouse.getLocation());
                        System.out.println("Most Expensive price: " + product.getName());
                        System.out.println("Price: " + product.getPrice());
                        System.out.println();

                    });
        });

//        * * 8 * *
        System.out.println(warehouses.stream().anyMatch(warehouse -> warehouse.getProducts().size() > 10));

//        * * 9 * *
        Map<Category,List<Product>> productByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
        productByCategory.forEach((category, products1) -> {
            System.out.println("Category: " + category);
            System.out.println("Product: ");
            products1.forEach(product -> System.out.println("- " + product.getName()));
            System.out.println();
        });

//        * * 10 * *
        Optional<Product> cheapestInElectronic = products.stream()
                .filter(product -> product.getCategory() == Category.ELECTRONICS)
                .min(Comparator.comparing(Product::getPrice));

//        * * 11 * *
        OptionalDouble inStockAverage = products.stream().filter(Product::isInStock).mapToDouble(Product::getPrice).average();

//        * * 12 * *
        Optional<Warehouse> maximumPriced = warehouses.stream()
                .max(Comparator.comparing(warehouse -> warehouse.getProducts()
                        .stream()
                        .mapToDouble(Product::getPrice)
                        .max()
                        .orElse(0)));
        System.out.println(maximumPriced.toString()
        );

//        * * 13 * *
        boolean atLeastOneInStock = warehouses.stream()
                .allMatch(warehouse -> warehouse.getProducts().stream().anyMatch(Product::isInStock));
        System.out.println(atLeastOneInStock);

//        * * 14 * *
        List<Product> productsWithLetterA = products.stream().filter(product -> product.getName().contains("a")).collect(Collectors.toList());
        productsWithLetterA.forEach(item -> System.out.println(item.getName()));

//        * * 15 * *
        warehouses.stream()
                .forEach(warehouse -> warehouse.getProducts().stream()
                .forEach(product -> System.out.println(product.getId())));

//        * * 16 * *
        Optional<Warehouse> maxNumberOfProduct = warehouses.stream().max(Comparator.comparingInt(warehouse -> warehouse.getProducts().size()));
        maxNumberOfProduct.stream().forEach(warehouse -> System.out.println(warehouse.getId()));

//        * * 17 * *
    boolean ifHasOneProduct = warehouses.stream().anyMatch(warehouse -> warehouse.getProducts().size() == 1);
        System.out.println(ifHasOneProduct);

//        * * 18 * *
        Warehouse warehouseA = warehouses.stream()
                .filter(warehouse -> warehouse.getLocation().equals("Warehouse A"))
                .findFirst()
                .orElse(null);
        Optional<Product> lowestPriceProduct = warehouseA != null ? warehouseA.getProducts().stream().min(Comparator.comparingDouble(Product::getPrice)) : Optional.empty();
        lowestPriceProduct.ifPresent(item -> System.out.println(item.getPrice()));

//        * * 19 * *
        Stream<Product> sortedProducts = products.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed());
        sortedProducts.forEach(item-> System.out.println(item.getPrice()));

//        * * 20 * *
        products.stream()
                .filter(Product::isInStock)
                .forEach(product -> System.out.println(product.getName()));


    }
}

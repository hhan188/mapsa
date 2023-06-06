package tamrin17;

import java.util.Comparator;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Report {

    public static final String ANSI_CYAN = "\u001B[36m";
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        report1();
        report2();
        report3();
        report4();
        report5();
        report6();
        report7();
        report8();
        report9();
        report10();
        report11();
        report12();
        report13();
        report14();
        report15();
        report16();
        report17();
        report18();
        report19();
        report20();
    }

    public static void report1() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 1: Find all products with a price greater than $50." + ANSI_RESET);

        var productList = Product.getAllProducts();

        productList.stream()
                .filter(p -> p.getPrice() > 50.0)
                .forEach(System.out::println);

    }

    public static void report2() {

        System.out.println(ANSI_CYAN);
        System.out.println("Report 2: Find the total price of all products in Warehouse A." + ANSI_RESET);

        var warehousesList = Warehouse.getAllWarehouses();

        double sum =
                warehousesList.stream()
                        .filter((w -> w.getLocation().equals("Warehouse A")))
                        .flatMap((w -> w.getProducts().stream()))
                        .mapToDouble(Product::getPrice)
                        .sum();

        System.out.println("Sum is: " + sum);
    }

    public static void report3() {

        System.out.println(ANSI_CYAN);
        System.out.println("Report 3: Find the average price of all electronics products." + ANSI_RESET);

        var productList = Product.getAllProducts();

        OptionalDouble avg =
                productList.stream()
                        .filter(p -> p.getCategory() == Category.ELECTRONICS)
                        .mapToDouble(Product::getPrice)
                        .average();

        if (avg.isPresent())
            System.out.println("Average price of electronics products is: " + avg.getAsDouble());
        else
            System.out.println("No average!");
    }

    public static void report4() {

        System.out.println(ANSI_CYAN);
        System.out.println("Report 4: Sort the products by their names in ascending order." + ANSI_RESET);

        var productList = Product.getAllProducts();
        productList.stream()
                .sorted(Comparator.comparing(Product::getName))
                .forEach(System.out::println);
    }

    public static void report5() {

        System.out.println(ANSI_CYAN);
        System.out.println("Report 5: Check if any product is out of stock." + ANSI_RESET);

        var productList = Product.getAllProducts();
        productList.stream()
                .filter(p -> !p.isInStock())
                .forEach(System.out::println);
    }

    public static void report6() {

        System.out.println(ANSI_CYAN);
        System.out.println("Report 6: Get the names of all products in Warehouse B." + ANSI_RESET);

        var warehousesList = Warehouse.getAllWarehouses();
        warehousesList.stream()
                .filter(w -> w.getLocation().equals("Warehouse B"))
                .flatMap(w -> w.getProducts().stream())
                .map(Product::getName)
                .forEach(System.out::println);
    }

    public static void report7() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 7: Find the most expensive product in each warehouse." + ANSI_RESET);

        var warehousesList = Warehouse.getAllWarehouses();
        //Solution 1:
//        var result = warehousesList.stream()
//                .collect(Collectors.toMap(Warehouse::getLocation,
//                        w -> w.getProducts().stream().map(Product::getPrice).reduce((a, b) -> Math.max(a,b)).get()));

        //Solution 2:
//        var result = warehousesList.stream()
//                .collect(Collectors.toMap(Warehouse::getLocation,
//                        w -> w.getProducts().stream()
//                                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
//                                .findFirst().map(Product::getName).get()));

        //Solution 3: The Best
        var result = warehousesList.stream()
                .collect(Collectors.toMap(Warehouse::getLocation,
                        w -> w.getProducts().stream()
                                .max(Comparator.comparingDouble(Product::getPrice))
                                .map(Product::getName).get()
                ));

        System.out.println(result);

    }

    public static void report8() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 8: Check if any warehouse has more than 10 products." + ANSI_RESET);

        var warehousesList = Warehouse.getAllWarehouses();

        var result = warehousesList.stream()
                .collect(Collectors.toMap(Warehouse::getLocation,
                        w -> w.getProducts().stream().count()));

        boolean flag = false;
        for (var item : result.entrySet()) {
            if (item.getValue() > 10) {
                System.out.println(item);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No warehouse has more than 10 products!");
        }

        System.out.println(result);
    }

    public static void report9() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 9: Group products by their categories." + ANSI_RESET);

        var productList = Product.getAllProducts();

        var result =
                productList.stream()
                        .collect(Collectors.groupingBy
                                (Product::getCategory, Collectors.mapping
                                        (Product::getName, Collectors.joining(", "))
                                ));

//        System.out.println(result);

        for (var item : result.entrySet()) {
            System.out.println(item.getKey() + " = {" + item.getValue() + "}");
        }
    }

    public static void report10() {

        System.out.println(ANSI_CYAN);
        System.out.println("Report 10: Find the cheapest product in the electronics category." + ANSI_RESET);

        var productList = Product.getAllProducts();

        var result =
                productList.stream()
                        .filter(p -> p.getCategory() == Category.ELECTRONICS)
                        .min(Comparator.comparingDouble(Product::getPrice))
                        .map(Product::getName).get();

        System.out.println("==> " + result);

    }

    public static void report11() {

        System.out.println(ANSI_CYAN);
        System.out.println("Report 11: Get the average price of all products in stock" + ANSI_RESET);

        var productList = Product.getAllProducts();

        var result = productList.stream()
                .filter(Product::isInStock)
                .map(Product::getPrice)
                .collect(Collectors.averagingDouble(Double::doubleValue));


        System.out.println("==> " + result);

    }

    public static void report12() {

        System.out.println(ANSI_CYAN);
        System.out.println("Report 12: Find the warehouse with the highest-priced product" + ANSI_RESET);

        var warehouseList = Warehouse.getAllWarehouses();

        var targetMap =
                warehouseList.stream()
                        .collect(Collectors.toMap
                                (Warehouse::getLocation, p -> p.getProducts().stream()
                                        .max(Comparator.comparingDouble(Product::getPrice))
                                        .map(Product::getPrice).get()
                                ));

        var result =
                targetMap.entrySet().stream()
                        .max(Comparator.comparingDouble(entry -> entry.getValue())).get();

        System.out.println(targetMap);
        System.out.println(result);

    }

    private static void report13() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 13: Check if all warehouses have at least one product in stock." + ANSI_RESET);

        var warehouseList = Warehouse.getAllWarehouses();

        var result = warehouseList.stream()
                .collect(Collectors.toMap(Warehouse::getLocation,
                        p -> p.getProducts().stream().map(Product::isInStock)
                                .filter(inStock -> inStock).findAny().orElse(false)));

        System.out.println(result);
    }

    private static void report14() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 14: Find the products with names containing the letter 'a'." + ANSI_RESET);

        var productList = Product.getAllProducts();

        var result = productList.stream()
                .filter(p -> p.getName().contains("a") || p.getName().contains("A"))
                .map(Product::getName)
                .collect(Collectors.toSet());

        System.out.println(result);
    }

    private static void report15() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 15: Get the number of products in each warehouse." + ANSI_RESET);

        var warehouseList = Warehouse.getAllWarehouses();

        var result = warehouseList.stream()
                .collect(Collectors.toMap(Warehouse::getLocation,
                        p -> p.getProducts().stream().filter(Product::isInStock).count()));

        System.out.println(result);
    }

    private static void report16() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 16: Find the warehouse with the largest number of products." + ANSI_RESET);

        var warehouseList = Warehouse.getAllWarehouses();

        var targetMap = warehouseList.stream()
                .collect(Collectors.toMap(Warehouse::getLocation,
                        p -> p.getProducts().stream().filter(Product::isInStock).count()));

        var result = targetMap
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .get();

        System.out.println(result);

    }

    private static void report17() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 17: Check if any warehouse has only one product." + ANSI_RESET);

        var warehouseList = Warehouse.getAllWarehouses();

        var targetMap = warehouseList.stream()
                .collect(Collectors.toMap(Warehouse::getLocation,
                        p -> p.getProducts().stream().count()));

        var result = targetMap
                .entrySet()
                .stream()
                .filter(p -> p.getValue() == 1).findAny().get();


        System.out.println(result);


    }

    private static void report18() {
        //Find the product with the lowest price in Warehouse A
        System.out.println(ANSI_CYAN);
        System.out.println("Report 18: Find the product with the lowest price in Warehouse A." + ANSI_RESET);

        var warehouseList = Warehouse.getAllWarehouses();

        var result = warehouseList.stream()
                .filter(w -> w.getLocation().equals("Warehouse A"))
                .flatMap(w -> w.getProducts().stream())
                .collect(Collectors.minBy(Comparator.comparing(Product::getPrice)))
                .get();

        System.out.println(result);

    }

    private static void report19() {
        //Sort the products by their prices in descending order
        System.out.println(ANSI_CYAN);
        System.out.println("Report 19: Sort the products by their prices in descending order." + ANSI_RESET);

        var productList = Product.getAllProducts();

        productList.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .forEach(System.out::println);


    }

    private static void report20() {

        //Find the names of all products in stock
        System.out.println(ANSI_CYAN);
        System.out.println("Report 20: Find the names of all products in stock." + ANSI_RESET);

        var productList = Product.getAllProducts();

        productList.stream()
                .filter(Product::isInStock)
                .map(Product::getName)
                .forEach(System.out::println);

    }
}





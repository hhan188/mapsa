package tamrin17;

import java.util.Comparator;
import java.util.OptionalDouble;

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

    }

    public static void report1() {
        System.out.println(ANSI_CYAN);
        System.out.println("Report 1: Find all products with a price greater than $50." + ANSI_RESET);

        var productList = Product.getAllProducts();

        productList.stream()
                .filter(p -> p.getPrice() > 50.0)
                .forEach(p -> System.out.println(p));

    }

    public static void report2() {

        System.out.println(ANSI_CYAN);
        System.out.println("Report 2: Find the total price of all products in Warehouse A." + ANSI_RESET);

        var warehousesList = Warehouse.getAllWarehouses();

        Double sum =
                warehousesList.stream()
                        .filter((w -> w.getLocation() == "Warehouse A"))
                        .flatMap((w -> w.getProducts().stream()))
                        .mapToDouble(p -> p.getPrice())
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
                        .mapToDouble(p -> p.getPrice())
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
                .filter(w -> w.getLocation() == "Warehouse B")
                .flatMap(w -> w.getProducts().stream())
                .map(p -> p.getName())
                .forEach(System.out::println);
    }


}





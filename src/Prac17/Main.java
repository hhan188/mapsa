package Prac17;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static List<Product> products = Product.getAllProducts();
    static List<Warehouse> warehouses = Warehouse.getAllWarehouses();

    public static void main(String[] args) {
        // 1- Find all products with a price greater than $50.
        System.out.println("1- Find all products with a price greater than $50.");
        List<Product> productsWithPriceGreater50 = findPriceGreater50();
        System.out.println("products with price greater than 50$ is : ");
        productsWithPriceGreater50.forEach(product -> System.out.println(product.getName()));
        System.out.println("=================================================================");

        // 2- Find the total price of all products in Warehouse A.
        System.out.println("2- Find the total price of all products in Warehouse A.");
        double sumProductsPricesA = sumAllProductsPricesWarehouseA();
        System.out.println("sum of prices of warehouse A products is : " + sumProductsPricesA);
        System.out.println("=================================================================");

        // 3- Find the average price of all electronics products.
        System.out.println("3- Find the average price of all electronics products.");
        double avgElcProducts = averageAllElectronicsProductsPrices();
        System.out.println("average of all products prices in electronics category is : " + avgElcProducts);
        System.out.println("=================================================================");

        // 4- Sort the products by their names in ascending order.
        System.out.println("4- Sort the products by their names in ascending order.");
        List<Product> productsSortedByNameAsc = sortProductsByNameAsc();
        System.out.println("sorted products by their names : ");
        productsSortedByNameAsc.forEach(product -> System.out.println(product.getName()));
        System.out.println("=================================================================");

        // 5- Check if any product is out of stock.
        System.out.println("5- Check if any product is out of stock.");
        boolean checkOutOfStockProducts = checkOutOfStockProducts();
        System.out.println("answer : " + checkOutOfStockProducts);
        System.out.println("=================================================================");

        // 6- Get the names of all products in Warehouse B.
        System.out.println("6- Get the names of all products in Warehouse B.");
        System.out.println("names of all products in warehouse b : ");
        List<String> warehouseBProductsNames = getProductNamesWarehouseB();
        warehouseBProductsNames.forEach(System.out::println);
        System.out.println("=================================================================");

        // 7- Find the most expensive product in each warehouse.
        System.out.println("7- Find the most expensive product in each warehouse.");
        Map<String, Product> mostExpensiveProductInWareHouses = findMostExpensiveProductInWareHouse();
        mostExpensiveProductInWareHouses.forEach((k, v) -> System.out.println(k + " : " + v.getName()));
        System.out.println("=================================================================");

        // 8- Check if any warehouse has more than 10 products.
        System.out.println("8- Check if any warehouse has more than 10 products.");
        boolean ifAnyWarehouseHasMoreThan10Products = checkWarehousesHasMoreThan10Products();
        System.out.println("answer is : " + ifAnyWarehouseHasMoreThan10Products);
        System.out.println("=================================================================");

        // 9- Group products by their categories.
        System.out.println("9- Group products by their categories.");
        Map<Category, List<Product>> groupedProducts = groupProductsByCategory();
        groupedProducts.forEach(
                (k, v) -> {
                    System.out.print(k + " : ");
                    v.forEach(product -> System.out.print(product.getName() + "-"));
                    System.out.println();
                });
        System.out.println("=================================================================");

        // 10- Find the cheapest product in the electronics category.
        System.out.println("10- Find the cheapest product in the electronics category.");
        Product cheapestProductElectronics = findCheapestProductElectronics();
        System.out.println("cheapest product in electronics category is : " + cheapestProductElectronics.getName());
        System.out.println("=================================================================");

        // 11- Get the average price of all products in stock.
        System.out.println("11- Get the average price of all products in stock.");
        double avgAllInstockProducts = avgPriceAllInstockProducts();
        System.out.println("avg is : " + avgAllInstockProducts);
        System.out.println("=================================================================");

        // 12- Find the warehouse with the highest-priced product.
        System.out.println("12- Find the warehouse with the highest-priced product.");
        Warehouse warehouseWithTheMostExipensiveProduct = findWarehouseWithTheMostExipensiveProduct();
        System.out.println("warehouse with most expensive product is : " + warehouseWithTheMostExipensiveProduct.getLocation());
        System.out.println("=================================================================");

        // 13- Check if all warehouses have at least one product in stock.
        System.out.println("13- Check if all warehouses have at least one product in stock.");
        boolean isAllWarehousesHaveProduct = checkIfWarehouseHasAnyProduct();
        System.out.println("answer is : " + isAllWarehousesHaveProduct);
        System.out.println("=================================================================");

        // 14- Find the products with names containing the letter 'a'.
        System.out.println("14- Find the products with names containing the letter 'a'.");
        List<Product> productStartWithLetterA = findProductWithLetterA();
        System.out.println("all products that contains letter a : ");
        productStartWithLetterA.forEach(p -> System.out.println(p.getName()));
        System.out.println("=================================================================");

        // 15- Get the number of products in each warehouse.
        System.out.println("15- Get the number of products in each warehouse.");
        Map<String, Integer> numberOfProductsInEachWarehouse = getProductNumbersByWareHouse();
        numberOfProductsInEachWarehouse.forEach((k, v) -> System.out.println(k + " : " + v));
        System.out.println("=================================================================");

        // 16- Find the warehouse with the largest number of products.
        System.out.println("16- Find the warehouse with the largest number of products.");
        Warehouse warehouseWithMostProducts = findWarehouseWithMostProducts();
        System.out.println("warehouse with most product is : " + warehouseWithMostProducts.getLocation());
        System.out.println("=================================================================");

        // 17- Check if any warehouse has only one product.
        System.out.println("17- Check if any warehouse has only one product.");
        boolean isAnyWarehouseHasOnlyOneProduct = checkAnyWarehouseHasOneProduct();
        System.out.println("answer is : " + isAnyWarehouseHasOnlyOneProduct);
        System.out.println("=================================================================");

        // 18- Find the product with the lowest price in Warehouse A.
        System.out.println("18- Find the product with the lowest price in Warehouse A.");
        Product cheapestProductInWarehouseA = findCheapestProductInWarehouseA();
        System.out.println("cheapes product in warehouse A is : " + cheapestProductInWarehouseA.getName());
        System.out.println("=================================================================");

        // 19- Sort the products by their prices in descending order.
        System.out.println("19- Sort the products by their prices in descending order.");
        List<Product> descSortedProductsByPrice = sortProductsByPriceDesc();
        descSortedProductsByPrice.forEach(product -> System.out.print(product.getName() + "-"));
        System.out.println();
        System.out.println("=================================================================");

        // 20- Find the names of all products in stock.
        System.out.println("20- Find the names of all products in stock.");
        List<String> namesOfInStockProducts = findNamesOfInStockProducts();
        namesOfInStockProducts.forEach(System.out::println);
        System.out.println("=================================================================");
    }

    /**
     * Find all products with a price greater than $50.
     *
     * @return all products with a price greater than $50.
     */
    static List<Product> findPriceGreater50() {
        return products.stream()
                .filter(p -> p.getPrice() > 50)
                .collect(Collectors.toList());
    }

    /**
     * Find the total price of all products in Warehouse A.
     *
     * @return total price of all products in Warehouse A.
     */
    static double sumAllProductsPricesWarehouseA() {
        return warehouses
                .stream()
                .filter(warehouse -> warehouse.getLocation().equals("A"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Warehouse not found"))
                .getProducts()
                .stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    /**
     * Find the average price of all electronics products.
     *
     * @return the average price of all electronics products.
     */
    static double averageAllElectronicsProductsPrices() {
        return products.stream()
                .filter(product -> product.getCategory() == Category.ELECTRONICS)
                .mapToDouble(Product::getPrice)
                .average()
                .orElseGet(() -> 0);
    }

    /**
     * Sort the products by their names in ascending order.
     *
     * @return Sorted products by their names in ascending order.
     */
    static List<Product> sortProductsByNameAsc() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .toList();
    }

    /**
     * Check if any product is out of stock.
     */
    static boolean checkOutOfStockProducts() {
        return products.stream()
                .anyMatch(product -> !product.isInStock());
    }

    /**
     * Get the names of all products in Warehouse B.
     *
     * @return the names of all products in Warehouse B.
     */
    static List<String> getProductNamesWarehouseB() {

        return warehouses.stream()
                .filter(warehouse -> warehouse.getLocation().equals("B"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Warehouse not found"))
                .getProducts().stream()
                .map(Product::getName)
                .toList();
    }

    /**
     * Find the most expensive product in each warehouse.
     */
    static Map<String, Product> findMostExpensiveProductInWareHouse() {
        return warehouses.stream()
                .collect(Collectors.toMap(
                        Warehouse::getLocation,
                        warehouse -> {
                            return warehouse.getProducts().stream()
                                    .max(Comparator.comparing(Product::getPrice))
                                    .orElseThrow(() -> new RuntimeException("not found"));
                        }
                ));
    }


    /**
     * Check if any warehouse has more than 10 products.
     *
     * @return if any warehouse has more than 10 products.
     */
    static boolean checkWarehousesHasMoreThan10Products() {
        return warehouses.stream()
                .anyMatch(
                        warehouse -> warehouse.getProducts().size() > 10
                );
    }

    /**
     * Group products by their categories.
     *
     * @return grouped products
     */
    static Map<Category, List<Product>> groupProductsByCategory() {
        return products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    /**
     * Find the cheapest product in the electronics category.
     *
     * @return cheapest product in the electronics category.
     */
    static Product findCheapestProductElectronics() {
        return products.stream()
                .filter(product -> product.getCategory() == Category.ELECTRONICS)
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    /**
     * Get the average price of all products in stock.
     *
     * @return average price of all products in stock.
     */
    static double avgPriceAllInstockProducts() {
        return products.stream()
                .filter(Product::isInStock)
                .mapToDouble(Product::getPrice)
                .average()
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    /**
     * Find the warehouse with the highest-priced product.
     */
    static Warehouse findWarehouseWithTheMostExipensiveProduct() {
        return warehouses.stream()
                .max(Comparator.comparing(
                        warehouse -> warehouse.getProducts().stream()
                                .mapToDouble(Product::getPrice)
                                .max()
                                .orElse(0d)
                )).orElseThrow(() -> new RuntimeException("not found"));
    }

    /**
     * Check if all warehouses have at least one product in stock.
     *
     * @return Check if all warehouses have at least one product in stock.
     */
    static boolean checkIfWarehouseHasAnyProduct() {
        return warehouses.stream()
                .allMatch(warehouse -> warehouse.getProducts().size() > 0);
    }

    /**
     * Find the products with names containing the letter 'a'.
     *
     * @return Find the products with names containing the letter 'a'.
     */
    static List<Product> findProductWithLetterA() {
        return products.stream()
                .filter(product -> product.getName().contains("a"))
                .toList();
    }

    /**
     * Get the number of products in each warehouse.
     *
     * @return the numbers of products in each warehouse.
     */
    static Map<String, Integer> getProductNumbersByWareHouse() {
        return warehouses.stream()
                .collect(Collectors.toMap(
                        Warehouse::getLocation,
                        warehouse -> warehouse.getProducts().size()
                ));
    }

    /**
     * Find the warehouse with the largest number of products.
     *
     * @return the warehouse with the largest number of products.
     */
    static Warehouse findWarehouseWithMostProducts() {
        return warehouses.stream()
                .max(
                        (a, b) -> {
                            return Integer.compare(a.getProducts().size(), b.getProducts().size());
                        }
                )
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    /**
     * Check if any warehouse has only one product.
     *
     * @return if any warehouse has only one product.
     */
    static boolean checkAnyWarehouseHasOneProduct() {
        return warehouses.stream()
                .anyMatch(
                        warehouse -> {
                            return warehouse.getProducts().size() == 1;
                        }
                );
    }

    /**
     * Find the product with the lowest price in Warehouse A.
     *
     * @return product with the lowest price in Warehouse A.
     */
    static Product findCheapestProductInWarehouseA() {
        return warehouses.stream()
                .filter(warehouse -> warehouse.getLocation().equals("A"))
                .flatMap(warehouse -> warehouse.getProducts().stream())
                .max(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new RuntimeException("not found"));
    }

    /**
     * Sort the products by their prices in descending order.
     *
     * @return Sorted products by their prices in descending order.
     */
    static List<Product> sortProductsByPriceDesc() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .toList();
    }

    /**
     * Find the names of all products in stock.
     *
     * @return names of all products in stock.
     */
    static List<String> findNamesOfInStockProducts() {
        return products.stream()
                .filter(Product::isInStock)
                .map(Product::getName)
                .toList();
    }
}

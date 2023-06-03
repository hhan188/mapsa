package Tamrin17Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Warehouse {
    private int id;
    private String location;
    private List<Product> products;

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

    //6 Get the names of all products in Warehouse B.
    public static List<String> getTheNamesOfAllProductsInWarehouse(Warehouse warehouse) {

      /*  List<Product> p = getAllWarehouses().stream().filter(warehouse1 -> warehouse1.getId() == warehouse.getId())
                .collect(Collectors.toList()).get(0).getProducts();
        return p.stream().map(Product::getName).collect(Collectors.toList());*/

        return getAllWarehouses().stream()
                .filter(value -> value.getId() == warehouse.getId())
                .flatMap(warehouse1 -> warehouse1.getProducts().stream().map(Product::getName))
                .collect(Collectors.toList());
    }

    // 7 Find the most expensive product in each warehouse.
    public static Map<String, Product> findTheMostExpensiveProductInEachWarehouse() {
        return getAllWarehouses().stream()
                .collect(Collectors.toMap(
                        Warehouse::getLocation,
                        warehouse -> {
                            return warehouse.getProducts().stream()
                                    .max(Comparator.comparing(Product::getPrice))
                                    .orElseThrow(() -> new RuntimeException("not found"));
                        }
                ));
    }


    //Check if any warehouse has more than 10 products.
    //13 Check if all warehouses have at least one product in stock.
    public static Map<String, Boolean> checkWarehousesHasMoreThan10Products() {
        return getAllWarehouses().stream()
                .collect(Collectors.toMap(
                        Warehouse::getLocation,
                        warehouse -> {
                            return warehouse.getProducts().size() > 3;
                        }));
    }

//12 Find the warehouse with the highest-priced product.
    public static Warehouse highestPrice(){
        return getAllWarehouses().stream().max(Comparator.comparing(
                warehouse -> warehouse.getProducts().stream()
                        .mapToDouble(Product::getPrice).max().
                        orElse(0))).orElseThrow(() -> new RuntimeException("not found"));
    }


    public static void main(String[] args) {
        //   List<String> p = getTheNamesOfAllProductsInWarehouse(getAllWarehouses().get(1));
        //   Map<String, Product>  map = findTheMostExpensiveProductInEachWarehouse();
        Map<String, Boolean> map = checkWarehousesHasMoreThan10Products();
    }

    public Warehouse(int id, String location, List<Product> products) {
        this.id = id;
        this.location = location;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public static List<Warehouse> getAllWarehouses() {
        return allWarehouses;
    }

    public static void setAllWarehouses(List<Warehouse> allWarehouses) {
        Warehouse.allWarehouses = allWarehouses;
    }
}

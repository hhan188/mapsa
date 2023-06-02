package Prac17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Warehouse {
    private int id;
    private String location;
    private List<Product> products;

    // write , getters, and setters
    // ...

    private static List<Warehouse> allWarehouses = new ArrayList<>(Arrays.asList(
            new Warehouse(1, "A", Arrays.asList(
                    Product.getAllProducts().get(0),
                    Product.getAllProducts().get(1),
                    Product.getAllProducts().get(2)
            )),
            new Warehouse(2, "B", Arrays.asList(
                    Product.getAllProducts().get(3),
                    Product.getAllProducts().get(4)
            )),
            new Warehouse(3, "C", Arrays.asList(
                    Product.getAllProducts().get(3),
                    Product.getAllProducts().get(4)
            )),
            new Warehouse(4, "D", Arrays.asList(
                    Product.getAllProducts().get(5)
            )),
            new Warehouse(5, "E", Arrays.asList(
                    Product.getAllProducts().get(6),
                    Product.getAllProducts().get(7),
                    Product.getAllProducts().get(8),
                    Product.getAllProducts().get(9)
            ))
    ));


    public  Warehouse(int i, String warehouseE, List<Product> asList) {
        this.id = i;
        this.location = warehouseE;
        this.products = asList;
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

    public static void setAllWarehouses(List<Warehouse> allWarehouses) {
        Warehouse.allWarehouses = allWarehouses;
    }

    public static List<Warehouse> getAllWarehouses() {
        return allWarehouses;
    }
}
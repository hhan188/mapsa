package practices.practice17;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Warehouse {
    private int id;
    private String location;
    private List<Product> products;

    public Warehouse(int id, String location, List<Product> products) {
        this.id = id;
        this.location = location;
        this.products = products;
    }


    // write , getters, and setters
    // ...


    public int getId() {
        return id;
    }

    public Warehouse setId(int id) {
        this.id = id;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Warehouse setLocation(String location) {
        this.location = location;
        return this;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Warehouse setProducts(List<Product> products) {
        this.products = products;
        return this;
    }

    public static List<Warehouse> getAllWarehouses() {
        return allWarehouses;
    }

    public static void setAllWarehouses(List<Warehouse> allWarehouses) {
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

            // hashCode and equals and toString


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warehouse warehouse)) return false;
        return Objects.equals(getLocation(), warehouse.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocation());
    }
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
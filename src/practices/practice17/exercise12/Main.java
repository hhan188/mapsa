package practices.practice17.exercise12;


import practices.practice17.Product;
import practices.practice17.Warehouse;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //12 Find the warehouse with the highest-priced product.

        var mostExpensiveProduct = Warehouse.getAllWarehouses()
                .stream()
                .collect(Collectors.toMap(Warehouse::getLocation
                        , item -> item.getProducts().stream().max(Comparator.comparingDouble(Product::getPrice))
                                .stream()
                                .collect(Collectors.toList())))
                .entrySet().stream()
                .toList()
                .stream()
                .map(w -> w.getValue().get(0))
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .toList();

        System.out.println(mostExpensiveProduct.stream().findFirst());


    }
}

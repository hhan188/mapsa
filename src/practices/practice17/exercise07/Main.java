package practices.practice17.exercise07;


import practices.practice17.Product;
import practices.practice17.Warehouse;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //7 Find the most expensive product in each warehouse.


        Map<String, List<Product>> expensiveWarehouses = Warehouse.getAllWarehouses()
                .stream()
                .collect(Collectors.toMap(Warehouse::getLocation
                        , item -> item.getProducts().stream().max(Comparator.comparingDouble(Product::getPrice))
                                .stream()
                                .sorted()
                                .collect(Collectors.toList())));


        expensiveWarehouses.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);


    }


}


package practices.practice17.exercise15;


import practices.practice17.Warehouse;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //15 Get the number of products in each warehouse.

        var numberOfProductsInEachWarehouse = Warehouse.getAllWarehouses().stream()
                .collect(Collectors.toMap(Warehouse::getLocation
                        , warehouse -> warehouse.getProducts().size()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey());


        numberOfProductsInEachWarehouse.forEach(System.out::println);


    }
}

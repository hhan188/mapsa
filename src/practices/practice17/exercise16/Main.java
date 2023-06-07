package practices.practice17.exercise16;


import practices.practice17.Warehouse;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //16 Find the warehouse with the largest number of products.


        List<Map.Entry<String, Integer>> LargestNumberOfProductsInEachWarehouse = Warehouse.getAllWarehouses()
                .stream()
                .collect(Collectors.toMap(Warehouse::getLocation
                        , warehouse -> warehouse.getProducts().size()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .toList();

        System.out.println(LargestNumberOfProductsInEachWarehouse.get(LargestNumberOfProductsInEachWarehouse.size() - 1));


    }
}

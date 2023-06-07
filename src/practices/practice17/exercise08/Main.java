package practices.practice17.exercise08;


import practices.practice17.Product;
import practices.practice17.Warehouse;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //8 Check if any warehouse has more than 10 products

        var sizeOfProductMoreThan10 = Warehouse.getAllWarehouses().stream()
                .filter(warehouse -> warehouse.getProducts().size() >10)
                .collect(Collectors.toMap(Warehouse::getLocation, Warehouse::getProducts));

        sizeOfProductMoreThan10.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .toList()
                .forEach(System.out::println);


    }
}

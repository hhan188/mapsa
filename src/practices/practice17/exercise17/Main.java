package practices.practice17.exercise17;


import practices.practice17.Warehouse;

import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //17 Check if any warehouse has only one product.

        var warehouseWithOneProduct = Warehouse.getAllWarehouses()
                .stream()
                .filter(l -> l.getProducts().size() == 1)
                .collect(Collectors.toMap(Warehouse::getLocation
                        , warehouse -> warehouse.getProducts().size()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .toList();

        System.out.println(warehouseWithOneProduct);

    }
}

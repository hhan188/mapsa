package practices.practice17.exercise07;


import practices.practice17.Warehouse;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//7 Find the most expensive product in each warehouse.

        System.out.println(Warehouse.getAllWarehouses().get(0).getProducts());
//        System.out.println(Warehouse.getAllWarehouses().get(1));
//        System.out.println(Warehouse.getAllWarehouses().get(2));
        Warehouse.getAllWarehouses()
                .stream()
//                .filter(warehouse -> warehouse.getProducts().stream().filter(product -> product.getPrice()).m)
                .map(Warehouse::getProducts)
                .collect(Collectors.toList());



    }
}

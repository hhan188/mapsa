package practices.practice17.exercise06;


import practices.practice17.Warehouse;

import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

//6 Get the names of all products in Warehouse B.
//
        Warehouse.getAllWarehouses()
                .stream()
                .filter(n -> n.getLocation().equals("Warehouse B"))
                .forEach(System.out::println);




    }
}

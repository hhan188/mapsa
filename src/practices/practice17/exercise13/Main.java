package practices.practice17.exercise13;


import practices.practice17.Warehouse;

public class Main {
    public static void main(String[] args) {

//13 Check if all warehouses have at least one product in stock.

        Warehouse.getAllWarehouses()
                .stream()
                .filter(warehouse -> warehouse.getProducts().size()>=1)
                .forEach(System.out::println);


    }
}

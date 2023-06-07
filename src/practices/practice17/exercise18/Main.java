package practices.practice17.exercise18;


import practices.practice17.Warehouse;

public class Main {
    public static void main(String[] args) {

        //18 Find the product with the lowest price in Warehouse A.

        var lowestPriceList = Warehouse.getAllWarehouses()
                .stream()
                .filter(warehouse -> warehouse.getLocation().equalsIgnoreCase("Warehouse A"))
                .map(Warehouse::getProducts);


        lowestPriceList.forEach(System.out::println);


//        System.out.println(lowestPriceList);


    }
}

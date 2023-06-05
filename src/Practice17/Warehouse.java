package Practice17;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class Warehouse {

    private int id;
    private String location;
    private List<Product> products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public static List<Warehouse> getAllWarehouses() {
        return allWarehouses;
    }

    public static void setAllWarehouses(List<Warehouse> allWarehouses) {
        Warehouse.allWarehouses = allWarehouses;
    }


    private static List<Warehouse> allWarehouses = new ArrayList<>(Arrays.asList(
            new Warehouse(1, "Warehouse A", Arrays.asList(
                    Product.getAllProducts().get(0),
                    Product.getAllProducts().get(1),
                    Product.getAllProducts().get(2)
            )),
            new Warehouse(2, "Warehouse B", Arrays.asList(
                    Product.getAllProducts().get(3),
                    Product.getAllProducts().get(4)
            )),
            new Warehouse(3, "Warehouse C", Arrays.asList(
                    Product.getAllProducts().get(3),
                    Product.getAllProducts().get(4)
            )),
            new Warehouse(4, "Warehouse D", Arrays.asList(
                    Product.getAllProducts().get(5)
            )),
            new Warehouse(5, "Warehouse E", Arrays.asList(
                    Product.getAllProducts().get(6),
                    Product.getAllProducts().get(7),
                    Product.getAllProducts().get(8),
                    Product.getAllProducts().get(9)
            ))
    ));

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", products=" + products +
                '}';
    }

    public Warehouse(int id, String location, List<Product> products) {
        this.id = id;
        this.location = location;
        this.products = products;
    }
    //2 Find the total price of all products in Warehouse A.
    public static void thetotalpriceWareHouseA(){
      //  System.out.println(allWarehouses.stream().filter(house -> house.getLocation().equals("Warehouse A")).flatMap(Warehouse -> Warehouse.getProducts().stream()).mapToDouble(Product::getPrice).sum());//forEach(n-> System.out.println(n));

    }

    //6 Get the names of all products in Warehouse B.
    public static void namesProductWareHouseB(){
        allWarehouses.stream().filter(Warehouse -> Warehouse.getLocation().equals("Warehouse B")).flatMap(Warehouse -> Warehouse.getProducts().stream()).forEach(product -> System.out.println(product.getName()));


    }

//    7 Find the most expensive product in each warehouse.
    public static Map<String, Product> mostExpensive(){
        return getAllWarehouses().stream()
                .collect(Collectors.toMap(
                        Warehouse::getLocation,
                        warehouse -> {
                            return warehouse.getProducts().stream()
                                    .max(Comparator.comparing(Product::getPrice))
                                    .orElseThrow(() -> new RuntimeException("not found"));
                        }
                ));


    }

    //8 Check if any warehouse has more than 10 products.
    public static void moreThan10Products(){
        allWarehouses.stream().filter(warehouse -> warehouse.getProducts().size()>3).forEach(t-> System.out.println(t.getLocation()));
    }

    //12 Find the warehouse with the highest-priced product.
    public static Warehouse highest(){
        return getAllWarehouses().stream().max(Comparator.comparing(
                warehouse -> warehouse.getProducts().stream()
                        .mapToDouble(Product::getPrice).max().
                        orElse(0))).orElseThrow(() -> new RuntimeException("not found"));
    }


    //13 Check if all warehouses have at least one product in stock.
    public static boolean method(){
        return allWarehouses.stream().allMatch(Warehouse->Warehouse.getProducts().size()>0);
    }

    //15 Get the number of products in each warehouse.
    public static Map<String,Integer> numberOfProducts() {
        return allWarehouses.stream().collect(Collectors.toMap(Warehouse::getLocation,Warehouse->Warehouse.getProducts().size()));
    }


    //16 Find the warehouse with the largest number of products.
    public static String largestProduct(){
        return allWarehouses.stream().max(Comparator.comparing(warehouse -> warehouse.getProducts().size())).map(Warehouse::getLocation).get();

    }


    //17 Check if any warehouse has only one product.
    public static void onlyOneProduct(){
        var result=allWarehouses.stream().anyMatch(Warehouse->Warehouse.getProducts().size()==1);
        System.out.println(result);
        allWarehouses.stream().filter(warehouse -> warehouse.getProducts().size()==1).map(Warehouse::getLocation).forEach(t-> System.out.println(t));
    }

    //18 Find the product with the lowest price in Warehouse A.
    public static void lowestPriceWarehouseA(){
      //  System.out.println(allWarehouses.stream().filter(warehouse -> warehouse.getLocation().equals("Warehouse A")).flatMap(Warehouse -> Warehouse.getProducts().stream()).min(Comparator.comparing(Product::getPrice)).get().getName());
    }



        public static void main(String[] args) {
           // thetotalpriceWareHouseA();
            //namesProductWareHouseB();
           // mostExpensive();
            //moreThan10Products();
            //lowestPriceWarehouseA();
            //System.out.println(mostExpensive());
            //System.out.println(method());
            //System.out.println(numberOfProducts());
            //System.out.println(largestProduct());
            onlyOneProduct();

        }

}

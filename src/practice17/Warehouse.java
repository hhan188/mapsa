package practice17;

import Practice8_3.jenerics.too.Option;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

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

    public static void main(String[] args) {
        //2


       var totalPriceWarehouseA = allWarehouses.stream()
               .filter(item->item.getLocation().equalsIgnoreCase("Warehouse A"))
               .flatMap(item -> item.getProducts().stream()).mapToDouble(Product::getPrice).sum();
        System.out.println("totalPriceWarehouseA :"+totalPriceWarehouseA);
        System.out.println("****************************************************");
        //6

        System.out.println(" the names of all products in Warehouse B is :"+getNamesAllWarehouse());

        System.out.println("CheckWarehouseHasMoreThan10Products" +
                " :"+CheckWarehouseHasMoreThan10Products());
        System.out.println("_________________________________________________________");
        //13
        System.out.println("Check Ware houses Have Product  : "+CheckWarehousesHaveProduct());
        System.out.println("__________________________________________________________");
        //15
        System.out.println("Get Products Warehouse : "+getProductsWarehouse());
        System.out.println("_____________________________________________________________");
        //16

        System.out.println("find Warehouse Number Products"+findWarehouseNumberProducts());
        System.out.println("____________________________________________________________");
        //17
        System.out.println("Check Any Warehouse Has Product : "+CheckAnyWarehouseHasProduct());
        System.out.println("_____________________________________________________________");
        //18
        System.out.println("find ProductLowest Price Warehouse A  :"+findProductLowestPriceWarehouseA());

    }

    //6
    public static List<String> getNamesAllWarehouse(){
       return allWarehouses.stream().filter(item->item.getLocation().equalsIgnoreCase("Warehouse B"))
                .flatMap(p->p.getProducts().stream().map(Product::getName)).collect(Collectors.toList());
    }
    //7

    public static Map<String, Product> findTheMostExpensiveProductInEachWarehouse() {
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

    //8
    public static Map<String,Boolean> CheckWarehouseHasMoreThan10Products(){
        return allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getLocation,item->item.getProducts().size()>=10));
    }

    //12
    public static Warehouse findWarehouseWithHighestPriced(){
       return allWarehouses.stream().max(Comparator.comparing(warehouse->warehouse
                .getProducts().stream().mapToDouble(Product::getPrice).max()
                . orElse(0))).orElseThrow(() -> new RuntimeException("not found"));
    }
    //13
    public static List<Warehouse>  CheckWarehousesHaveProduct(){
       return allWarehouses.stream().filter(p->p.getProducts().size()>0).collect(Collectors.toList());
    }
    //15
    public static Map<String,Integer> getProductsWarehouse(){
       return allWarehouses.stream()
               .collect(Collectors.toMap(p->p.getLocation(),i->i.getProducts().size()));

    }
    //16
    public static String findWarehouseNumberProducts(){
        return allWarehouses.stream()
               .max(Comparator.comparing(item->item.getProducts().size())).map(Warehouse::getLocation).get();


    }
    //17
    public static List<String> CheckAnyWarehouseHasProduct(){
       return allWarehouses.stream()
                .filter(p->p.getProducts().size()==1).map(v->v.getLocation()).toList();
    }

    //18
    public static List<String> findProductLowestPriceWarehouseA(){
       return allWarehouses.stream()
                .filter(p->p.getLocation().equalsIgnoreCase("Warehouse A"))
                .flatMap(v->v.getProducts().stream().min(Comparator.comparing(Product::getPrice))
                        .stream().map(Product::getName)).toList();
    }






}

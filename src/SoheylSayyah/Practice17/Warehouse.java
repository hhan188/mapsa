package SoheylSayyah.Practice17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Warehouse {
    private int id;
    private String location;
    private List<Product> products;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getLocation()
    {
        return location;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    public List<Product> getProducts()
    {
        return products;
    }
    public void setProducts(List<Product> products)
    {
        this.products = products;
    }
    public static List<Warehouse> getAllWarehouses()
    {
        return allWarehouses;
    }
    public static void setAllWarehouses(List<Warehouse> allWarehouses)
    {
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
    public Warehouse(int id, String location, List<Product> products)
    {
        this.id = id;
        this.location = location;
        this.products = products;
    }
    public static void main(String[] args)
    {
        //2
        var warehouseA = allWarehouses.stream()
                .filter(n -> n.getLocation().equalsIgnoreCase("Warehouse A"))
                .flatMap(item -> item.getProducts().stream()).mapToDouble(Product::getPrice).sum();
        System.out.println("Sum of All Products in WareHouse A is  " + warehouseA);
        System.out.println("************************************************************************");
        //6
        var productInWarehouseB = allWarehouses.stream()
                .filter(item -> item.getLocation().equalsIgnoreCase("Warehouse B"))
                .flatMap(n -> n.getProducts().stream()).map(Product::getName).toList();
        System.out.println("All Products in WareHouse B are " + productInWarehouseB);
        System.out.println("************************************************************************");
        //7
        var mostExpensiveProductInEachWarehouse = allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getLocation , item -> item.getProducts().stream().max(Comparator.comparingDouble(Product::getPrice)).get()));
        System.out.println(mostExpensiveProductInEachWarehouse);
        System.out.println("************************************************************************");
        //8
        var checkIfAnyWarehouseHasMoreThanTenProducts = allWarehouses.stream()
                        .collect(Collectors.toMap(Warehouse::getLocation , item -> item.getProducts().size() >= 10));
        System.out.println(checkIfAnyWarehouseHasMoreThanTenProducts);
        var test = allWarehouses.stream().filter(a -> a.getProducts().size() > 3)
                .collect(Collectors.toMap(Warehouse::getLocation , n -> n.getProducts().size() > 3));
        System.out.println(test);
        System.out.println("************************************************************************");
        //12
        var warehouseWithTheHighestPricedProduct = allWarehouses.stream()
                .max(Comparator.comparing(item -> item.getProducts().stream().mapToDouble(Product::getPrice).max().getAsDouble()))
                .map(Warehouse::getLocation).get();
        System.out.println(warehouseWithTheHighestPricedProduct);
        System.out.println("************************************************************************");
        //13
        var checkIfAllWarehousesHaveAtLeastOneProductInStock = allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getLocation , item -> item.getProducts().size() > 0));
        System.out.println(checkIfAllWarehousesHaveAtLeastOneProductInStock);
        System.out.println("************************************************************************");
        //15
        var numberOfProductsInEachWarehouse = allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getLocation , item -> item.getProducts().size()));
        System.out.println(numberOfProductsInEachWarehouse);
        System.out.println("************************************************************************");
        //16
        var theWarehouseWithTheLargestNumberOfProducts = allWarehouses.stream()
                .max(Comparator.comparing(item -> item.getProducts().size())).map(Warehouse::getLocation).get();
        System.out.println(theWarehouseWithTheLargestNumberOfProducts);
        System.out.println("************************************************************************");
        //17
        var checkIfAnyWarehouseHasOnlyOneProduct = allWarehouses.stream()
                .filter(n -> n.getProducts().size() == 1).map(Warehouse::getLocation).toList();
        System.out.println(checkIfAnyWarehouseHasOnlyOneProduct);
        System.out.println("************************************************************************");
        //18
        var productWithTheLowestPriceInWarehouseA = allWarehouses.stream().filter(n -> n.getLocation().equalsIgnoreCase("Warehouse A"))
                .flatMap(item -> item.getProducts().stream().min(Comparator.comparing(Product::getPrice)).stream().map(Product::getName)).toList();
        System.out.println(productWithTheLowestPriceInWarehouseA);
        System.out.println("************************************************************************");

    }
}
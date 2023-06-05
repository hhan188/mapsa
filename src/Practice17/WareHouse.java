package Practice17;

import Practice17.Product;

import java.util.*;
import java.util.stream.Collectors;

class Warehouse {
    private int id;
    private String location;
    private List<Product> products;
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
//                    Product.getAllProducts().get(10)
            ))
    ));

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

    public Warehouse(int id, String location, List<Product> products) {
        this.id = id;
        this.location = location;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", products=" + products +
                '}';
    }

    public static void main(String[] args) {
        /////Practice 2
        System.out.println("Practice 2/////////////////////////////////////////////////////////////////////////");
        double warehousesA=allWarehouses.stream()
                .filter(item->item.getLocation().equals("Warehouse A"))
                .findFirst()
                .orElseThrow(()->new RuntimeException("not find"))
                .getProducts()
                .stream()
                .mapToDouble(Product::getPrice).sum();
        System.out.println(warehousesA);
        System.out.println("Practice 6//////////////////////////////////////////////////////////////////////////");
        ///////////Practice 6
        var warehouseB=allWarehouses.stream()
                .filter(item->item.getLocation().equalsIgnoreCase("Warehouse B"))
                .flatMap(n->n.getProducts().stream()).map(Product::getName).collect(Collectors.toList());
        System.out.println(warehouseB);
        System.out.println("Practice 7//////////////////////////////////////////////////////////////////////////");
        ////Practice 7
        var mostExpensiveInEachWarehouse= allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getLocation, item->item.getProducts().stream()
                        .max(Comparator.comparing(Product::getPrice)).map(Product::getName).orElse("Not found")));
        System.out.println(mostExpensiveInEachWarehouse);
        System.out.println("Practice 8//////////////////////////////////////////////////////////////////////////");
        ///Practice8
        var anyWarehouseMoreThanTenProduct=allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getLocation,item->item.getProducts().size()>=10));
        System.out.println(anyWarehouseMoreThanTenProduct);
        System.out.println("Practice12///////////////////////////////////////////////////////////////////");
        var warehouseWithTheHighestPricedProduct =allWarehouses.stream()
                .max(Comparator.comparing(warehouse -> warehouse.getProducts()
                        .stream().mapToDouble(Product::getPrice).max()
                        .orElse(0))).orElseThrow(()->new RuntimeException("not found"));
        System.out.println(warehouseWithTheHighestPricedProduct);
        System.out.println("Practice 13//////////////////////////////////////////////////////////////////");
        var warehousesHaveAtLeastOneProductInStock = allWarehouses.stream()
                        .collect(Collectors.toMap(Warehouse::getId,warehouse -> warehouse.getProducts().size()>0));
        System.out.println(warehousesHaveAtLeastOneProductInStock);
        System.out.println("Practice 15/////////////////////////////////////////////////////////////////");
        Map<Integer,Integer> theNumberOfProductsInEachWarehouse=allWarehouses.stream()
                .collect(Collectors.toMap(Warehouse::getId,warehouse -> warehouse.getProducts().size()));
        System.out.println(theNumberOfProductsInEachWarehouse);
        System.out.println("Practice 16 /////////////////////////////////////////////////////////////////");
        int theWarehouseWithTheLargestNumberOfProducts = allWarehouses.stream()
                .max(Comparator.comparing(warehouse -> warehouse.getProducts().size())).map(Warehouse::getId).get();
        System.out.println("theWarehouseWithTheLargestNumberOfProducts is warehouse "+theWarehouseWithTheLargestNumberOfProducts);
        System.out.println("Practice 17//////////////////////////////////////////////////////////////////");
        var checkIfAnyWarehouseHasOnlyOneProduct=allWarehouses.stream()
                        .filter(warehouse -> warehouse.getProducts().size()==1).map(Warehouse::getId).collect(Collectors.toList());
        System.out.println("Warehouse with only one product is warehouse "+checkIfAnyWarehouseHasOnlyOneProduct);
        System.out.println("Practice 18 //////////////////////////////////////////////////////////////////");
        List<String> theProductWithTheLowestPriceInWarehouseA=allWarehouses.stream()
                .filter(warehouse -> warehouse.getId()==1)
                .flatMap(warehouse -> warehouse.getProducts()
                        .stream()
                        .min(Comparator.comparing(Product::getPrice))
                        .stream()
                        .map(Product::getName)).collect(Collectors.toList());
        System.out.println(theProductWithTheLowestPriceInWarehouseA);



        }

    }

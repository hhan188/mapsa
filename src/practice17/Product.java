package practice17;

import java.util.*;
import java.util.stream.Collectors;

import static practice17.Category.ELECTRONICS;

public class Product {
    private int id;
    private String name;
    private double price;
    private Category category;
    private boolean inStock;


    private static List<Product> allProducts = new ArrayList<>(Arrays.asList(

            new Product(1, "iPhone 12", 999.99, ELECTRONICS, true),
            new Product(2, "T-Shirt", 19.99, Category.CLOTHING, true),
            new Product(3, "Harry Potter", 14.99, Category.BOOKS, false),
            new Product(4, "Perfume", 59.99, Category.BEAUTY, true),
            new Product(5, "Football", 24.99, Category.SPORTS, true),
            new Product(6, "Laptop", 1299.99, ELECTRONICS, true),
            new Product(7, "Jeans", 49.99, Category.CLOTHING, true),
            new Product(8, "The Great Gatsby", 9.99, Category.BOOKS, true),
            new Product(9, "Shampoo", 12.99, Category.BEAUTY, true),
            new Product(10, "Basketball", 19.99, Category.SPORTS, false)
    ));

    public Product(int id, String name, double price, Category category, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
    }

    // write getters, and setters
    // ...


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public static void setAllProducts(List<Product> allProducts) {
        Product.allProducts = allProducts;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                ", inStock=" + inStock +
                '}';
    }

    public static List<Product> getAllProducts() {
        return allProducts;
    }

    public static void main(String[] args) {
        //1
        allProducts.stream().filter(p->p.getPrice()>50).collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("*******************************************************");

        //3
        allProducts.stream().filter(item->item.getCategory()==ELECTRONICS)
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("**********************************************************");

        //4
        var sort=allProducts.stream().sorted(Comparator.comparing(Product::getName))
                .toList();
        System.out.println("Sort the products :"+sort);
        System.out.println("************************************************************");
        //5
        System.out.println(" this product is out of stock :"+productIsOutOfStock());

        //9
        GroupProductsByCategories();
        System.out.println("*****************************************************************");

        //10
       // System.out.println("find Cheapest Product In  Electronics : "+findCheapestProductInElectronics());
        //System.out.println("_________________________________________________________________________");

        //11
        System.out.println("Average Price All Products In Stock  : "
                +averagePriceAllProductsInStock());

        //14
        System.out.println("find Products Names Containing (A) :"
                +findProductsNamesContainingA());
        System.out.println("**********************************************************************");
        //19
        System.out.println("Sorted Products Prices Descending :"+SortProductsPricesDescending());
        System.out.println("______________________________________________________________-");
        //20
        System.out.println("find Names All Products -->"+findNamesAllProducts());

    }
    //5
    public static List<Product> productIsOutOfStock(){
        return allProducts.stream().filter(item-> !item.inStock).collect(Collectors.toList());
    }
    //9
    public static void GroupProductsByCategories(){
        System.out.println("Group products by their categories ->   "+allProducts.stream()
                .collect(Collectors.groupingBy(Product::getCategory)));
    }
    //10

    public static void findCheapestProductInElectronics(){
         getAllProducts().stream().filter(item->item.getCategory().equals("ELECTRONICS"))
                .min(Comparator.comparing(Product::getPrice)).get();
    }
     //11
    public static double averagePriceAllProductsInStock(){
        return allProducts.stream().filter(Product::isInStock)
                .mapToDouble(Product::getPrice)
                .average().getAsDouble();

    }
    //14
    public static List<Product> findProductsNamesContainingA(){
        return allProducts.stream().filter(v->v.getName().contains("a")).toList();
    }

    //19
    public static List<Product> SortProductsPricesDescending(){
        return allProducts.stream()
                .sorted(Comparator.comparing(Product::getPrice)).toList();


    }
    //20
    public static List<String>  findNamesAllProducts(){
       return allProducts.stream()
                .map(Product::getName).toList();
    }


}

package Practice17;

import java.util.*;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String name;
    private double price;
    private Category category;
    private boolean inStock;

    private static List<Product> allProducts = new ArrayList<>(Arrays.asList(
            new Product(1, "iPhone 12", 999.99, Category.ELECTRONICS, true),
            new Product(2, "T-Shirt", 19.99, Category.CLOTHING, true),
            new Product(3, "Harry Potter", 14.99, Category.BOOKS, false),
            new Product(4, "Perfume", 59.99, Category.BEAUTY, true),
            new Product(5, "Football", 24.99, Category.SPORTS, true),
            new Product(6, "Laptop", 1299.99, Category.ELECTRONICS, true),
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


    public static List<Product> getAllProducts() {
        return allProducts;
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

    //1 Find all products with a price greater than $50.
    public static void productsPriceGreaterThan50() {
        List<Product> products = allProducts.stream()
                .filter(product -> product.getPrice() > 50)
                .collect(Collectors.toList());

        System.out.println(products);
    }

    //3 Find the average price of all electronics products.
    public static void averagePrice(){
        var result=allProducts.stream().filter(product -> product.getCategory().equals(Category.ELECTRONICS)).mapToDouble(Product::getPrice).sum();;
        System.out.println(result);
    }

    //4 Sort the products by their names in ascending order.
    public static void ascendimgOrder(){
        allProducts.stream().sorted(Comparator.comparing(Product::getName)).forEach(item-> System.out.println(item.getName()));
    }




    //5 Check if any product is out of stock.
    public static void isInStockCheck(){
        allProducts.stream().filter(product->product.inStock).forEach(t-> System.out.println(t.getName()));


    }

    //9 Group products by their categories.
    public static void groupingProducts(){
        var result=allProducts.stream().collect(Collectors.groupingBy(
                Product::getCategory));
        System.out.println(result);


    }
    //10 Find the cheapest product in the electronics category.
    public static void cheapestElectronic(){
        System.out.println(allProducts.stream().filter(product -> product.getCategory().equals(Category.ELECTRONICS)).min(Comparator.comparing(Product::getPrice)));

    }

    //11 Get the average price of all products in stock.
    public static void averageStock(){
        System.out.println(allProducts.stream().filter(product -> product.isInStock()).mapToDouble(item -> item.getPrice()).average());
    }

    //14 Find the products with names containing the letter 'a'.
    public static void letterA(){
        allProducts.stream().filter(product -> product.getName().contains("a")).forEach(t-> System.out.println(t.getName()));
    }
    //19 Sort the products by their prices in descending order.
    public static void descendingOrder(){
        allProducts.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(t-> System.out.println(t.getName()));
    }

    //20 Find the names of all products in stock.
    public static void allProductsinStock(){
        allProducts.stream().filter(product -> product.isInStock()).forEach(product -> System.out.println(product.getName()));
    }


    public static void main(String[] args) {
       // productsPriceGreaterThan50();
        // averagePrice();
        //ascendimgOrder();
       // isInStockCheck();
        //groupingProducts();
       // cheapestElectronic();
        //averageStock();
        //letterA();
        //descendingOrder();
        allProductsinStock();

    }


}




import java.util.*;
import java.util.stream.Collectors;

public class ProductUtils {
    public static void main(String[] args) {
        List<Product> products= ProductUtils.generateProductList();
       products.stream().filter(item->item.getPrice()>=50)
                .forEach(item-> System.out.println(item.getName()));
        System.out.println("======================================================");


      var avr= products.stream().filter(item->item.getCategory()==Product.Category.ELECTRONICS)
               .mapToDouble(item-> item.getPrice()).average();
        System.out.println(avr);
        System.out.println("======================================================");


        products.stream().sorted(Comparator.comparing(Product::getName))
                .forEach(item-> System.out.println(item.getName()));
        System.out.println("======================================================");

        products.stream().filter(item-> item.isInStock()==false).forEach(item-> System.out.println(item.getName()));
        System.out.println("======================================================");

       var expensive= products.stream().map(item->item.getPrice()).reduce((double) 0,(a, b)->Math.max(a,b));
        products.stream().filter(item->item.getPrice()==expensive).forEach(item-> System.out.println(item.getName()));
        System.out.println("======================================================");
        Map<Product.Category,String> myMappp= products.stream()
                .collect(Collectors.toMap(Product::getCategory, Product::getName ,(a,b)->a+ " " + b));
        System.out.println(myMappp);
        System.out.println("======================================================");
        var chipest=products.stream().filter(item->item.getCategory()==Product.Category.ELECTRONICS)
                .map(item->item.getPrice()).reduce((double) 10000,(a, b)->Math.min(a,b));
        System.out.println(chipest);
        products.stream().filter(item->item.getPrice()==chipest).forEach(item-> System.out.println(item.getName()));
        System.out.println("======================================================");
       var avrerage= products.stream().filter(item->item.isInStock()==true)
               .mapToDouble(item->item.getPrice()).average();
        System.out.println(avrerage);
        System.out.println("======================================================");
        products.stream().filter(item->item.getName().contains("a"))
               .forEach(item-> System.out.println(item.getName()));
        System.out.println("======================================================");
       products.stream().sorted(Comparator.comparing(Product::getPrice).reversed())
               .forEach(item-> System.out.println(item.getName()));

        System.out.println("======================================================");
        products.stream().filter(Product::isInStock).forEach(item-> System.out.println(item.getName()));
        System.out.println("======================================================");



    }
    public static List<Product> generateProductList() {
        Product pro1 = new Product(1, "iPhone 12", 999.99, Product.Category.ELECTRONICS, true);
        Product pro2 = new Product(2, "T-Shirt", 19.99, Product.Category.CLOTHING, true);
        Product pro3 = new Product(3, "Harry Potter", 14.99, Product.Category.BOOKS, false);
        Product pro4 = new Product(4, "Perfume", 59.99, Product.Category.BEAUTY, true);
        Product pro5 = new Product(5, "Football", 24.99, Product.Category.SPORTS, true);
        Product pro6 = new Product(6, "Laptop", 1299.99, Product.Category.ELECTRONICS, true);
        Product pro7 = new Product(7, "Jeans", 49.99, Product.Category.CLOTHING, true);
        Product pro8 = new Product(8, "The Great Gatsby", 9.99, Product.Category.BOOKS, true);
        Product pro9 = new Product(9, "Shampoo", 12.99, Product.Category.BEAUTY, true);
        Product pro10 = new Product(10, "Basketball", 19.99, Product.Category.SPORTS, false);
        List<Product> produc = new ArrayList<>();
        produc.add(pro1);
        produc.add(pro2);
        produc.add(pro3);
        produc.add(pro4);
        produc.add(pro5);
        produc.add(pro6);
        produc.add(pro7);
        produc.add(pro8);
        produc.add(pro9);
        produc.add(pro10);
        return produc;

    }
}

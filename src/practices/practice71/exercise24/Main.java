package practices.practice71.exercise24;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product shoes = new Product("Nike", 210);
        Product shoes1 = new Product("adidas", 400);
        Product shoes2 = new Product("PUMA", 99);
        Product pans = new Product("D&G", 520);
        Product pans1 = new Product("levis", 310);
        Product[] products = {shoes, shoes1, shoes2, pans, pans1};
        System.out.println(Arrays.toString(products));
        System.out.println("***********************");
        System.out.println("The Lowest Price Goes To: " + new ProductsUtils().lowestProduct(products));


    }
}

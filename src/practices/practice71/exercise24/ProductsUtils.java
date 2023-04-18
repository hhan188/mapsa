package practices.practice71.exercise24;

public class ProductsUtils {
    public Product lowestProduct(Product[] products) {
        Product product = new Product();
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getPrice() < min) {
                min = products[i].getPrice();
                product = products[i];
            }
        }
        return product;
    }
}

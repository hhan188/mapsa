package Practice7.twentyFour;

public class ProducObjects {
    public static void main(String[] args) {
        Product[] products = {new Product("Graphic card", 1500), new Product("Monitor", 300), new Product("Processor", 700)};
        System.out.println(lowestPrice(products));
    }

    public static String lowestPrice(Product[] products) {
        double lowestPrice = Double.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            if (lowestPrice > products[i].price)
                lowestPrice = products[i].price;
        }
        for (Product product : products) {
            if (lowestPrice == product.price)
                return product.name;
        }
        return null;

    }
}

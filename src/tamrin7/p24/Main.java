package tamrin7.p24;

public class Main {
    public static void main(String[] args) {

        Product[] products = new Product[5];
        products[0] = new Product("Milk", 27);
        products[1] = new Product("Sahar Bread", 15);
        products[2] = new Product("Flower", 20);
        products[3] = new Product("Chocolate", 150);
        products[4] = new Product("Olive Oil", 180);

        String lowPriceProduct = lowestPriceFinder(products);
        System.out.println("Lowest product name is: " + lowPriceProduct);
    }

    private static String lowestPriceFinder(Product[] products) {

        float lowestPrice = products[0].getPrice();
        int lowestPriceProductIndex = 0;

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() < lowestPrice){
                lowestPrice = products[i].getPrice();
                lowestPriceProductIndex = i;
            }
        }
        return products[lowestPriceProductIndex].getName();
    }
}

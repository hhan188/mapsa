package SoheylSayyah.Practice7.Exercise24;

public class UsingProduct {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Apple",5);
        products[1] = new Product("Banana",25);
        products[2] = new Product("Eggplant",15);
        System.out.println(getLowestPriceProduct(products));
    }
    public static String getLowestPriceProduct(Product[] products){
        String temp = "";
        int price = 100;
        for (Product product : products){
            if (product.getPrice() < price){
                price = product.getPrice();
                temp = product.getName();
            }
        }
        return temp;
    }
}

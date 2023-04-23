package tamrin8.p1;

public class Main {
    public static void main(String[] args) {

        //Store
        Store dreamsMarket = new Store("Dreams Market", new Item[10], new Customer[10] );

        //Define Items
        Item bread = new Item("Sahar Bread", 15.5,3);
        Item milk = new Item("Haraz Milk", 28.8,20);
        Item butter = new Item("Kaleh Butter 100g", 18.1,10);
        Item jam = new Item("Carrot Jam", 34.7,5);
        Item egg = new Item("Egg", 5.0,7);

        //Adding items to store
        dreamsMarket.addItem(bread);
        dreamsMarket.addItem(milk);
        dreamsMarket.addItem(butter);
        dreamsMarket.addItem(jam);
        dreamsMarket.addItem(egg);

        //Define Customers
        Customer ehsan = new Customer("Ehsan", 100.0, new Item[10]);
        Customer sally = new Customer("Sally", 150.0 , new Item[10]);

        //Adding customers to store
        dreamsMarket.addCustomer(ehsan);
        dreamsMarket.addCustomer(sally);

        //Print our market
        System.out.println("\nStatus Before Shopping:\n");
        System.out.println(dreamsMarket);

        //Customers item selection and moving to basket
        System.out.println("\nMessages while Shopping:\n");

        dreamsMarket.sellItem(ehsan,bread);
        dreamsMarket.sellItem(ehsan,bread);
        dreamsMarket.sellItem(ehsan,egg);
        dreamsMarket.sellItem(ehsan,egg);
        dreamsMarket.sellItem(ehsan,egg);
        dreamsMarket.sellItem(ehsan,egg);
        dreamsMarket.sellItem(ehsan,egg);
        dreamsMarket.sellItem(ehsan,milk);
        dreamsMarket.sellItem(ehsan,jam);

        dreamsMarket.sellItem(sally,bread);
        dreamsMarket.sellItem(sally,jam);
        dreamsMarket.sellItem(sally,butter);
        dreamsMarket.sellItem(sally,bread);
        dreamsMarket.sellItem(sally,egg);
        dreamsMarket.sellItem(sally,egg);
        dreamsMarket.sellItem(sally,egg);

        System.out.println("\nStatus After Shopping:\n");
        //Print customers status
        System.out.println(ehsan);
        System.out.println(sally);

        //Print stock status
        System.out.println(dreamsMarket.listMarketStock());
    }
}

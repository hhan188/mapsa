package Prac8.Project1;

public class Main {
    public static void main(String[] args) {
        //Create new items
        Item shir = new Item("shir", 5, 1);
        Item cake = new Item("cake", 3, 1);

        //Create new customers
        Customer sajjad = new Customer("sajjad", 4);
        Customer aghdas = new Customer("aghdas", 15);

        //Create new store
        Store store = new Store("hyperStar");

        //Add items and customers to store
        store.addItem(shir);
        store.addItem(cake);
        store.addCustomer(sajjad);
        store.addCustomer(aghdas);

        //Sell item to sajjad
        store.sellItem(sajjad, shir);
        store.sellItem(sajjad, cake);

        //Sell item to aghdas
        store.sellItem(aghdas, shir);
        store.sellItem(aghdas, cake);

        //Print customers balance and
        for (Customer customer : store.getCustomers()) {
            System.out.println();
            System.out.println(customer.getName() + " :");
            System.out.println("balance : " + customer.getBalance());
            System.out.println("items : " + customer.getItemsPurchased().toString());
            System.out.println();
        }
    }
}

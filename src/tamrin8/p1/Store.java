package tamrin8.p1;

import java.util.Arrays;

public class Store {
    private final String name;
    private final Item[] itemsInStock;
    //private ArrayList<Item> itemsInStock;
    private final Customer[] customers;

    public Store(String name, Item[] itemsInStock, Customer[] customers) {
        this.name = name;
        this.itemsInStock = itemsInStock;
        this.customers = customers;
    }

    public void addItem(Item item) {

        for (int i = 0; i < itemsInStock.length; i++) {
            if (itemsInStock[i] == null) {
                itemsInStock[i] = item;
                return;
            }
        }
            //itemsInStock array is full
            System.out.println("The item cannot be inserted, item stock is full!");
    }

    public void addCustomer(Customer customer) {

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
                return;
            }
        }
        //Customer array is full
        System.out.println("The customer cannot be inserted, store customers are full!");
    }

    public void sellItem(Customer customer, Item item) {

        Item pickedupItem;

        pickedupItem = addToBasket(item, 1);
        if (pickedupItem == null){
            System.out.println("Dear " + customer.getName() + ", the item " + item.getName() +
                    " cannot be selected!, Unfortunately it is out of stock!!!\n");
            return;
        }

        //Money operation
        boolean canAfford = canCustomerAfford(customer, pickedupItem);

        if (!canAfford) {
            System.out.println("Dear " + customer.getName() + ", you have not enough money to buy " +
                    item.getName() + "\n");
            return;
        }

        getMoneyFromCustomer(customer,pickedupItem);

        //Checkout operation
        stockCheckout(customer,pickedupItem, getItemStockIndex(pickedupItem));

    }

    public int isInStockEnough(Item item, int count) {
        for (int i = 0; i < itemsInStock.length; i++) {
            if (itemsInStock[i] == item
                    && itemsInStock[i].getQuantity() > 0
                    && itemsInStock[i].getQuantity() >= count) {
                return i;
            }
        }
        return -1;
    }
    public int getItemStockIndex(Item item) {
        for (int i = 0; i < itemsInStock.length; i++) {
            if (itemsInStock[i].getName() == item.getName()) {
                return i;
            }
        }
        return -1;
    }

    private boolean canCustomerAfford(Customer customer, Item item) {
        return item.getPrice() * item.getQuantity() <= customer.getBalance();
    }

    private void getMoneyFromCustomer(Customer customer, Item item) {
        customer.setBalance(customer.getBalance() - item.getQuantity() * item.getPrice());
    }

    private void stockCheckout(Customer customer, Item item, int itemStockIndex) {
        //Stock operation
        itemsInStock[itemStockIndex].setQuantity(itemsInStock[itemStockIndex].getQuantity() - item.getQuantity());

        //Customer Basket operation
        Item[] customerItemsPurchased = customer.getItemsPurchased();
        //Purchased before
        for (int i = 0; i < customerItemsPurchased.length; i++) {
            if (customerItemsPurchased[i] != null && customerItemsPurchased[i].getName() == item.getName()) {
                customerItemsPurchased[i].setQuantity(customerItemsPurchased[i].getQuantity() + item.getQuantity());
                customer.setItemsPurchased(customerItemsPurchased);
                return;
            }
        }
        //Not purchased yet
        for (int i = 0; i < customerItemsPurchased.length; i++) {
            if (customerItemsPurchased[i] == null) {
                customerItemsPurchased[i] = item;
                customer.setItemsPurchased(customerItemsPurchased);
                return;
            }
        }
    }

    public Item addToBasket(Item item, int count) {

        int itemIndex = isInStockEnough(item, count);

        if (itemIndex == -1) {
            System.out.println("Stock: There is not enough '" + item.getName() + "' in the stock!");
            return null;
        }

        return new Item(item.getName(), item.getPrice(), count);
    }

    @Override
    public String toString() {
        return " * * * * * * *    Welcome to "+ name + " Store    * * * * * *\n" +
                "Items that are in Stock are: \n" + Arrays.toString(itemsInStock) +
                "\n\n" +
                "Our customers are: \n" + Arrays.toString(customers) +
                "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n";
    }

    public String listMarketStock() {
        return "\nItems that are in Stock are \n" + Arrays.toString(itemsInStock) +
                "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n";
    }

}
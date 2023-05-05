package Practice8.One;

public class Store {
    String name;
    Item[] itemsInStock;
    Customer[] customers;

    int customerCounter = 0;
    int itemCounter = 0;

    public Store(String name, Item[] itemsInStock, Customer[] customers) {
        this.name = name;
        this.itemsInStock = itemsInStock;
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        customers[customerCounter] = customer;
        System.out.println("a customer has been added to the list of customers.");
        customerCounter++;
    }

    public void addItem(Item item) {
        itemsInStock[itemCounter] = item;
        System.out.println("an item has been added to the list of items.");
        itemCounter++;
    }

    public void sellItem(Customer customer, Item item) {
        boolean firstIfChecker = false;
        for (int i = 0; i < itemCounter; i++) {
            if (item.name.equals(itemsInStock[i].name)) {
                firstIfChecker = true;
                if (customer.balance >= item.price) {
                    if (item.quantity > 0) {
                        itemsInStock[i].quantity--;
                        customer.balance -= item.price;
                        for (int itemPurchasedCounter = 0; itemPurchasedCounter != -1; itemPurchasedCounter++) {
                            if (customer.itemsPurchased[itemPurchasedCounter] == null) {
                                customer.itemsPurchased[itemPurchasedCounter] = item;
                                customer.itemsPurchased[itemPurchasedCounter].quantity ++;
                                customer.itemsPurchased[itemPurchasedCounter].name = item.name;
                                customer.itemsPurchased[itemPurchasedCounter].price = item.price;
                                itemPurchasedCounter = -1;
                                System.out.println("customer " + customer.name + " successfully buy " + item.name + " " + "1 qty.");
                                return;
                            }
                        }
                    }
                } else
                    System.out.println("Item isn't available now");
            } else
                System.out.println("Customer " + customer.name + " doesn't have enough balance to purchase this item!");
        }
        if (!firstIfChecker)
            System.out.println("Item hasn't added to the store!");
    }

}

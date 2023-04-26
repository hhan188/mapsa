package com.tamrin8.firstPart.store;

public class Store
{
    private String name;
    private Item [] itemsInStock = new Item [50];
    private int itemCounter = 0;
    private Customer [] customers = new Customer[20];
    private int customerCounter = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(Item[] itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public Store(String name, Item[] itemsInStock, Customer[] customers)
    {
        this.name = name;
        this.itemsInStock = itemsInStock;
        this.customers = customers;
    }

    public Store()
    {

    }

    public boolean addCustomer(Customer customer)
    {
        if (customerCounter == customers.length)
        {
            return false;
        }

        Customer temp = new Customer(customer.getName(), customer.getBalance());

        customers [customerCounter] = temp;
        customerCounter++;
        return true;
    }

    public boolean addItem(Item item)
    {
        if (itemCounter == itemsInStock.length)
        {
            return false;
        }

        Item temp = new Item(item.getName(), item.getPrice(), item.getQuantity());

        itemsInStock [itemCounter] = temp;
        itemCounter++;
        return true;
    }

    public boolean sellItem(Customer customer, Item item)
    {
        if (customer.getBalance() > item.getPrice())
        {
            for (int i = 0; itemsInStock[i] != null; i++)
            {
                if (itemsInStock[i].getName().equalsIgnoreCase(item.getName()))
                {
                    customer.setItemsPurchased(item);
                    itemsInStock[i] = itemsInStock[itemCounter - 1];
                    itemCounter--;
                    customer.setBalance(customer.getBalance() - item.getPrice());
                    return true;
                }
            }
        }
        return false;
    }

    public void viewCustomers ()
    {
        if (customerCounter == 0)
        {
            System.out.println("*************");
            System.out.println("No Customer!");
            System.out.println("*************");
        }
        else
        {
            for (int i = 0; i < customerCounter; i++)
            {
//                Customer [] temp = getCustomers();
//                String output = "";
//                for (int j = 0; temp[i] != null; j++)
//                {
//                    output += "Item Name: " + temp[i].getItemsPurchased()[j].getName() + "Price: " + temp[i].getItemsPurchased()[j].getPrice() + "Quantity: " + temp[i].getItemsPurchased()[j].getQuantity();
//                }
                System.out.println(getCustomers()[i].toString());
                System.out.println();
            }
        }
    }

    public void viewItems ()
    {
        if (itemCounter == 0)
        {
            System.out.println("*************");
            System.out.println("No Item!");
            System.out.println("*************");
        }
        else
        {
            for (int i = 0; i < itemCounter; i++)
            {
                System.out.println(getItemsInStock()[i].toString());
                System.out.println();
            }
        }
    }
}

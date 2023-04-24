package com.tamrin8.firstPart.store.store;

public class Customer
{
    private String name;
    private double balance;
    private Item [] itemsPurchased = new Item[5];
    byte itemCounetr = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Item [] getItemsPurchased() {
        return itemsPurchased;
    }

    public void setItemsPurchased(Item item)
    {
        if (itemCounetr < itemsPurchased.length)
        {
            this.itemsPurchased[itemCounetr] = item;
            itemCounetr++;
        }
        else
        {
            System.out.println("Your Items Is Full");
        }
    }


    public Customer(String name, double balance, Item[] itemsPurchased)
    {
        this.name = name;
        this.balance = balance;
        this.itemsPurchased = itemsPurchased;
    }

    public Customer(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    public Customer()
    {

    }

    @Override
    public String toString()
    {
        Item [] custItems = getItemsPurchased();
        String output = "";
            for (int i = 0; getItemsPurchased()[i] != null; i++)
            {
                output += '{' + " Item Name: " + getItemsPurchased()[i].getName() + " | Price: " + getItemsPurchased()[i].getPrice() + " | Quantity: " + getItemsPurchased()[i].getQuantity() + " }" + "\n";
            }
        return "Customer Name: " + name + " | Balance: " + balance + "\nItems Purchased: \n" + output;
    }
}

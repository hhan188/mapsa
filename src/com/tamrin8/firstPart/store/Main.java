package com.tamrin8.firstPart.store;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Welcome To Your Store ***");
        System.out.println("*****************************\n");

        Store store = new Store();
        Item [] allItem = store.getItemsInStock();  //Getting Items to allItem Array

        while (true)
        {
            System.out.println("Your Menu:");
            System.out.println("---------------------------");
            System.out.println("1- Add Item");
            System.out.println("2- Add Customer");
            System.out.println("3- Sell Item");
            System.out.println("4- View Customers");
            System.out.println("5- View Item");
            System.out.println("6- Exit");

            Scanner sc = new Scanner(System.in);
            byte opt = sc.nextByte();
            boolean itemFlag = true;        //for Item Loop
            switch (opt)
            {
                case 1:
                    while (itemFlag)
                    {
                        System.out.println("Enter The Item Information");
                        System.out.println("******************************\n");

                        System.out.print("Enter Name: ");
                        String itemName = sc.next();
                        System.out.print("Enter Price: ");
                        double itemPrice = sc.nextDouble();
                        System.out.print("Enter Quantity: ");
                        int itemQuantity = sc.nextInt();

                        Item item = new Item(itemName, itemPrice, itemQuantity);

                        if(store.addItem(item))         //If Add Method of item Is Successful
                        {
                            System.out.println("*************");
                            System.out.println("Done!");
                            System.out.println("*************");
                            itemFlag = false;
                        }
                        else
                        {
                            System.out.println("*************");
                            System.out.println("Failed!");
                            System.out.println("*************");
                            itemFlag = false;
                        }
                    }
                    break;

                case 2:
                    boolean custFlag = true;        //For Customer Loop
                    while(custFlag)
                    {
                        System.out.println("Enter The Customer Information");
                        System.out.println("******************************\n");

                        System.out.print("Enter Name: ");
                        String customerName = sc.next();
                        System.out.print("Enter Balance: ");
                        double customerBalance = sc.nextDouble();

                        Customer temp = new Customer(customerName, customerBalance);

                        if(store.addCustomer(temp))     //If Add Method of Customer is Successful
                        {
                            System.out.println("*************");
                            System.out.println("Done!");
                            System.out.println("*************");
                            custFlag = false;
                        }
                        else
                        {
                            System.out.println("*************");
                            System.out.println("Failed!");
                            System.out.println("*************");
                            custFlag = false;
                        }
                    }
                    break;

                case 3:
                    boolean sellingFlag = true;     //For Selling Loop
                    while (sellingFlag)
                    {
                        boolean custTempFlag = false;
                        boolean itemTempFlag = false;

                        Customer[] allCustomers = store.getCustomers();
                        Customer custTemp = new Customer();

                        //------------------------------------------------------------ Searching For Customer
                        System.out.print("Enter Customer Name: ");
                        String custName = sc.next();

                        for (int i = 0; allCustomers[i] != null; i++)
                        {
                            if (allCustomers[i].getName().equalsIgnoreCase(custName))
                            {
                                custTemp = allCustomers[i];
                                custTempFlag = true;
                            }
                        }
                        if (!custTempFlag)
                        {
                            System.out.println("*****************");
                            System.out.println("User Not Found!");
                            System.out.println("*****************");
                            break;
                        }
                        //------------------------------------------------------------

                        //------------------------------------------------------------Searching for Item
                        System.out.print("Enter Item Name: ");
                        String bk = sc.next();

                        Item itemTemp = new Item();
                        for (int i = 0; store.getItemsInStock()[i] != null; i++)
                        {
                            if (allItem[i].getName().equalsIgnoreCase(bk))
                            {
                                itemTemp = allItem[i];

                                System.out.println("*************");
                                System.out.println("Done!");
                                System.out.println("*************");
                                itemTempFlag = true;
                                break;
                            }
                        }

                        if (!itemTempFlag)
                        {
                            System.out.println("*****************");
                            System.out.println("Item Not Found!");
                            System.out.println("*****************");
                            break;
                        }
                        store.sellItem(custTemp, itemTemp);
                        sellingFlag = false;
                    }
                    break;

                case 4:
                    System.out.println("Customers Info:");
                    System.out.println("*************************");
                    store.viewCustomers();
                    break;

                case 5:
                    System.out.println("Items Info:");
                    System.out.println("*************************");
                    store.viewItems();
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Wrong Choice!");
                    System.out.println("*************************");
            }
        }

    }
}

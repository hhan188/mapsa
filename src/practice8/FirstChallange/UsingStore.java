package practice8.FirstChallange;

import practice8.FirstChallange.Customer;
import practice8.FirstChallange.Item;
import practice8.FirstChallange.Store;
import practice8.secondChallange.Bank;

import java.util.ArrayList;

public class UsingStore {
                public static void main(String[] args) {
                    ArrayList<Item> items=new ArrayList<>();
                    Item firstItem=new Item("book",8_0,2);
                    Item secondItem=new Item("dress",12_0,1);
                    items.add(firstItem);
                    items.add(secondItem);

                    ArrayList<Customer> customers=new ArrayList<>();
                    Customer firstCustomer=new Customer("sadeghi",12_000);
                    Customer secondCustomer=new Customer("riazi",8_000);
                    customers.add(firstCustomer);
                    customers.add(secondCustomer);

                    Store store=new Store("mall",items,customers);
                    store.sellItem(firstCustomer,firstItem);
                    System.out.println(firstCustomer.getBalance());
                    System.out.println(firstCustomer.getItemsPurchased());



            }

}

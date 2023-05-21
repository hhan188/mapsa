//package Practic8.FirstProject.src;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Store {
//    private String name;
//    private Item[] itemStock;
//    private Customer[] customers;
//
//    public Store(String name, Item[] itemStock, Customer[] customers) {
//        this.name = name;
//        this.itemStock = itemStock;
//        this.customers = customers;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Item[] getItemStock() {
//        return itemStock;
//    }
//
//    public void setItemStock(Item[] itemStock) {
//        this.itemStock = itemStock;
//    }
//
//    public Customer[] getCustomers() {
//        return customers;
//    }
//
//    public void setCustomers(Customer[] customers) {
//        this.customers = customers;
//    }
//
//    public void addCustomer(Customer customer){
//        customers.add(customer);
//    }
//    public void addItem(Item item){
//
//        itemStock.add(item);
//    }
//    public void sellItem(Customer customer,Item item){
//        if (itemStock.contains(item)&&item.getPrice() <=customer.getBalance()){
//            itemStock.remove(item);
//            customer.getItemsPurchased().add(item);
//            customer.setBalance(customer.getBalance()-item.getPrice());
//        }
//       else {
//            System.out.println("you cant buy this item");
//        }
//    }
////    public  void printCustomersAndItemsPurchased() {
////        for (Customer customer : customers) {
////            System.out.println(customer.getName() + "'s final balance: $" + customer.getBalance());
////            System.out.println(customer.getName() + "'s items purchased:");
////            for (Item item : customer.getItemsPurchased()) {
////                System.out.println(item.getName() + " ($" + item.getPrice() + ")");
////            }
////            System.out.println();
////        }
////    }
//}
//

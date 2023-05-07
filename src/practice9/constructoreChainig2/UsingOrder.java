package practice9.constructoreChainig2;

public class UsingOrder {
    public static void main(String[] args) {
        Order order=new Order(12);
        System.out.println(order.getOrderNumber());

        Order order2=new Order(34, "sara");
        System.out.println(order2.getOrderNumber()+" "+order2.getCustomerName()+" "+ order2.getOrderTotal());

    }
}

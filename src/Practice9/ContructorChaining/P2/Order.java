package Practice9.ContructorChaining.P2;

public class Order {
    int orderNumber;
    String customerName;
    double orderTotal;

    public Order(int orderNumber, String customerName, double orderTotal) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }

    public Order(int orderNumber) {
        this(orderNumber, "Unknown",0);
    }

    public Order(int orderNumber, String customerName) {
        this(orderNumber, customerName,0);
    }
}

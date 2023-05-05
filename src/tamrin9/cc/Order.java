package tamrin9.cc;

public class Order {

    private int orderNumber;
    private String customerName;
    private double orderTotal;

    public Order (int orderNumber, String customerName, double orderTotal){
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }

    public Order(int orderNumber) {
        this(orderNumber, "Unknown", 0.0);
    }

    public Order(int orderNumber, String customerName) {
        this(orderNumber, customerName, 0.0);
    }
}

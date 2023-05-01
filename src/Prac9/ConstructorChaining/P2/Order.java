package Prac9.ConstructorChaining.P2;

public class Order {
    private int orderNumber;
    private String customerName;
    private double orderTotal;

    Order(int orderNumber, String customerName, double orderTotal) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.orderTotal = orderTotal;
    }

    Order(int orderNumber) {
        this(orderNumber, "unknown", 0);
    }

    Order(int orderNumber, String customerName) {
        this(orderNumber, customerName, 0);
    }
}

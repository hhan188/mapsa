package practice9.constructoreChainig2;

public class Order {
    private int orderNumber;
    private String customerName;
    private double orderTotal;

    public Order(int orderNumber,String customerName,double orderTotal) {
        this.orderNumber=orderNumber;
        this.customerName=customerName;
        this.orderTotal=orderTotal;
    }

    public Order(int orderNumber){
        this(orderNumber,"Sara",3.6);
    }

    public Order(int orderNumber,String customerName){
        this(orderNumber,customerName,5.4);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }
}

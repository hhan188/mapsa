package tamrin8.p2;

import java.text.NumberFormat;

public class Transaction {
    //Fields
    private String date;
    private String type;
    private double amount;
    private String description;

    //Constructor
    public Transaction(String date, String type, double amount, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }

    //Getters & Setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String formattedAmount(){
        NumberFormat n = NumberFormat.getNumberInstance();
        return  n.format(amount);
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nTransaction {" +
                "date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + formattedAmount() +
                ", description='" + description + '\'' +
                '}';
    }
}

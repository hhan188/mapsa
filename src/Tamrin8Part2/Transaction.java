package Tamrin8Part2;

import lombok.Data;

@Data
public class Transaction {
    //The Transaction class should have the following instance variables: date (a String),
    // type (a String), amount (a double), and description (a String).
    // It should also have a constructor that takes in values for each of these instance variables.

    private String date;
    private String type;
    private Double amount;
    private String description;

    public Transaction(String date, String type, Double amount, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }


}

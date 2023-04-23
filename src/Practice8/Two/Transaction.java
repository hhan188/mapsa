package Practice8.Two;

public class Transaction {
    String date;
    String type;
    double amount;
    String description;

    public Transaction(String date, String type, double amount, String description) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }
}

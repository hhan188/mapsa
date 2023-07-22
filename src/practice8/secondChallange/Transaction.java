package practice8.secondChallange;

public class Transaction {
    private String date ;
    private String type;
    private double amount ;
    private String description;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public Transaction(String date,String type,double amount, String description){
        this.date=date;
        this.type=type;
        this.amount=amount;
        this.description=description;


    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}

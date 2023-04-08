package practices.practice7.exercise23;

public class BankUtils {
    public double totalBalance(BankAccount[] bankAccounts) {
        double total = 0;
        for (BankAccount bankAccount : bankAccounts) {
            total += bankAccount.getBalance();
        }
        return total;
    }
}

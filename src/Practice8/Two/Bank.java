package Practice8.Two;

public class Bank {
    Account[] accounts;
    int currentAccountIndex;
    String currentDate = "4-23-2023";

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public void deposit(int accountNumber, double amount, String description) {
        boolean firstIfDeposit = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accountNumber == accounts[i].accountNumber) {
                firstIfDeposit = true;
                if (amount > 0) {
                    accounts[i].balance += amount;
                    Transaction transaction = new Transaction(currentDate, "deposit", amount, description);
                    for (int transactionCounter = 0; transactionCounter != -1; transactionCounter++) {
                        if (accounts[i].transactions[transactionCounter] == null) {
                            accounts[i].transactions[transactionCounter] = transaction;
                            System.out.println("Income!\namount of " + amount + "$ to t" + "his account :" + accountNumber + "\nYour balance now is : " + accounts[i].balance + "\ndescription :" + description);
                            transactionCounter = -2;
                        }
                    }
                } else System.out.println("amount must greater than 0 !!");
            }
        }
        if (!firstIfDeposit)
            System.out.println("Account number is incorrect, please try again.");
    }

    public void withdraw(int accountNumber, double amount, String description) {
        for (int i = 0; i < accounts.length; i++) {
            boolean firstIfWithdraw = false;
            if (accountNumber == accounts[i].accountNumber) {
                firstIfWithdraw = true;
                if (amount > 0) {
                    if (accounts[i].balance >= amount) {
                        accounts[i].balance -= amount;
                        Transaction transaction = new Transaction(currentDate, "Withdraw", amount, description);
                        for (int transactionCounter = 0; transactionCounter != -1; transactionCounter++) {
                            if (accounts[i].transactions[transactionCounter] == null) {
                                accounts[i].transactions[transactionCounter] = transaction;
                                System.out.println("Withdraw was successful! \nYour balance now is : " + accounts[i].balance + "\nDescription : " + description);
                                transactionCounter = -2;
                            }
                        }
                    } else
                        System.out.println("Account " + accounts[i].accountHolderName + " doesn't have enough balance!");
                } else System.out.println("amount must greater than 0 !!");
            }
            if (!firstIfWithdraw)
                System.out.println("Account number is incorrect, please try again.");
        }
    }

    public Account getAccount(int accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountNumber == accountNumber)
                return accounts[i];
        }
        return null;
    }

    public void incrementCurrentDate() {
        String[] dateArray = currentDate.split("-");
        if (Integer.parseInt(dateArray[1]) < 31) {
            int days = Integer.parseInt(dateArray[1]);
            dateArray[1] = Integer.toString(days += 1);
        } else if (Integer.parseInt(dateArray[1]) == 31) {
            int months = Integer.parseInt(dateArray[0]);
            dateArray[0] = Integer.toString(months += 1);
            dateArray[1] = "1";
        } else if (Integer.parseInt(dateArray[0]) == 13) {
            int years = Integer.parseInt(dateArray[2]);
            dateArray[2] = Integer.toString(years += 1);
            dateArray[0] = "1";
        }
        currentDate = dateArray[0] + "-" + dateArray[1] + "-" + dateArray[2];
        System.out.println(currentDate);
    }
}

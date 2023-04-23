package SoheylSayyah.Practice8.SecondProject;

public class Bank {
    private Account[] accounts;
    private int currentAccountIndex;
    private String currentDate;

    public Bank(Account[] accounts, int currentAccountIndex, String currentDate) {
        this.accounts = accounts;
        this.currentAccountIndex = currentAccountIndex;
        this.currentDate = currentDate;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getCurrentAccountIndex() {
        return currentAccountIndex;
    }

    public void setCurrentAccountIndex(int currentAccountIndex) {
        this.currentAccountIndex = currentAccountIndex;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }
}

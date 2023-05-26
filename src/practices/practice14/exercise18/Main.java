package practices.practice14.exercise18;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        System.out.println(bank.addCustomer("Adelaide", "Tim", 50.05));
        System.out.println(bank.addCustomer("Adelaide", "Mike", 175.34));
        System.out.println(bank.addCustomer("Adelaide", "Percy", 220.12));

        System.out.println(bank.findBranch("Adelaide"));

        System.out.println(bank.addCustomerTransaction("Adelaide", "Tim", 44.22));
        System.out.println(bank.addCustomerTransaction("Adelaide", "Tim", 12.44));
        System.out.println(bank.addCustomerTransaction("Adelaide", "Mike", 1.65));

        bank.listCustomers("Adelaide", true);
        System.out.println(bank.getBranches());


        System.out.println(bank.findBranch("Tim"));


    }
}

package tamrin6;
// Problem 16 solution
public class Main {

    public static void main(String[] args) {

        //Test Employee Class
        Employee employee1 = new Employee("Ali", "Programmer", 10_000);
        employee1.raiseSalary(10F);

        //Test PersonInfo
        PersonInfo pi1 = new PersonInfo("Mona", "Jahromi", (short) 35);
        pi1.getFullName();

        //Test Person
        Person p1 = new Person("Hanieh", (short) 28);
        Person p2 = new Person("Mona", (short) 35);
        String compPerson = p1.compareAges(p2);
        System.out.println("Comparison of ages: " + p1.getName() + " is " + compPerson + " than " + p2.getName());

        //Test Book
        Book b1 = new Book("C#", "Kane", 798);
        Book b2 = new Book("Java", "Lane", 1098);
        String compBook = b1.comparePages(b2);
        System.out.println("Comparison of pages: " + b1.getTitle() + " * " + compBook + " * " + b2.getTitle());

        //Test Rectangle
        Rectangle r1 = new Rectangle(3.0, 8.0);
        Rectangle r2 = new Rectangle(4.0, 6.0);
        String compRectangle = r1.compareAreas(r2);
        System.out.println("Comparison of areas: r1 * " + compRectangle + " * r2");

        //Test BankAccount
        BankAccount bankAccount1 = new BankAccount(100, "0016059001");
        BankAccount bankAccount2 = new BankAccount(300, "0016059001");
        bankAccount1.deposit(150);
        bankAccount2.withdraw(50);

        System.out.println("Comparison of bank accounts: bankAccount1 * "
                + bankAccount1.compareBalances(bankAccount2)
                + " * bankAccount2");

    }
}

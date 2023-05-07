package tamrin10.s7p38;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial pages count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + printer.getPagesPrinted());
    }
}

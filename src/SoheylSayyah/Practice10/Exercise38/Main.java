package SoheylSayyah.Practice10.Exercise38;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial Page Count : " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages Printed Was : " + pagesPrinted + " New Total Print Count For Printer : " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages Printed Was : " + pagesPrinted + " New Total Print Count For Printer : " + printer.getPagesPrinted());
    }
}

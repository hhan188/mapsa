package Practice10.Nine;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("intial page count = "+printer.getPagesPrint());
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was "+ pagesPrinted+ "new total count print for printer "+printer.getPagesPrint());
        pagesPrinted=printer.printPages(2);
        System.out.println("pages print was "+pagesPrinted+" new total count print for printer "+printer.getPagesPrint());
    }
}

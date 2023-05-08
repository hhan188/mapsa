package SoheylSayyah.Practice10.Exercise38;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    int pagesToPrint;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel <= -1 && tonerLevel > 100){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if (tonerAmount <= 0 || tonerAmount > 100 || tonerLevel + tonerAmount > 100){
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages){
        if (duplex){
            System.out.println("Printing in Duplex Mode");
            pagesToPrint = pages / 2;
            pagesPrinted += pagesToPrint;
        }else {
            pagesToPrint = pages;
        }
        return pagesToPrint;
    }

    public int getPagesToPrint() {
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

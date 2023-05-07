package tamrin10.s7p38;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        setTonerLevel(tonerLevel);
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    private void setTonerLevel(int tonerLevel) {

        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
            return;
        }
        this.tonerLevel = -1;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100)
            return -1;
        if (this.tonerLevel + tonerAmount <= 100)
            return this.tonerLevel + tonerAmount;
        else return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex)
            if (pages % 2 == 0)
                pagesToPrint = pages / 2;
            else
                pagesToPrint = pages / 2 + 1;

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

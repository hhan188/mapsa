package Practice10.tamrine9;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public void setTonerLevel(int tonerLevel) {
        if (tonerLevel <= -1 && tonerLevel > 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
    }


    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        }
        return -1;

    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex == true)
            if (pages % 2 == 0)
                pagesToPrint = pages / 2;

             else
                pagesToPrint = pages / 2 + 1;


            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;


    }


        public int getPagesPrinted () {
            return pagesPrinted;
        }

}

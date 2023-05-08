package Practice10.Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel<-1||tonerLevel>100){
            this.tonerLevel=-1;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted=0;
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {

        this.tonerLevel = tonerLevel;
    }


    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>100||tonerAmount<=0||tonerAmount+tonerLevel>100){
            return -1;
        }else {
            tonerLevel+=tonerAmount;
        }return tonerLevel;
    }
    int pagesToPrint;
    public int printPages(int pages){
        if (duplex){
            pagesToPrint=pages/2;
            pagesPrinted+=pagesToPrint;
        }else pagesToPrint=pages;
        return pagesToPrint;
    }

    public int getPagesToPrint() {
        return pagesToPrint;
    }
}

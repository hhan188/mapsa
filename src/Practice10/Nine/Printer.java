package Practice10.Nine;

public class Printer {
    private int tonerLevel;
    private int pagesPrint;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrint, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrint = pagesPrint;
        this.duplex = duplex;
        if (tonerLevel>100|| tonerLevel<-1){
            this.tonerLevel=-1;
        }
        if (pagesPrint<0){
            this.pagesPrint=0;
        }
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrint() {
        return pagesPrint;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount<0||tonerAmount>100){
            return -1;
        }
        if (tonerAmount+tonerLevel>100){
            return -1;
        }
        else
            tonerLevel+=tonerAmount;
        return tonerLevel;
    }
    public int printPages(int pages){
        if (duplex){
            int pagesToPrint=pages/2;
            pagesPrint+=pagesToPrint;
        }
        return pagesPrint;
    }
}

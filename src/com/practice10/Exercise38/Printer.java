package com.practice10.Exercise38;

public class Printer
{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    int pagesToPrint;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
        }
        else
        {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner (int tonerAmount)
    {
        if (tonerAmount > 0 || tonerAmount <= 100 || this.tonerLevel + tonerAmount > 100 )
        {
            return this.tonerLevel += tonerAmount;
        }
        else
        {
            return -1;
        }
    }

    public int printPages (int pages)
    {
        if (duplex)
        {
            System.out.println("Duplex Mode");
            pagesToPrint = pages/2;
            this.pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }

    public int getPrintPages ()
    {
        return this.pagesPrinted;
    }
}

package practices.practice10.exercise38;

import com.google.gson.Gson;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer() {
    }

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public Printer setTonerLevel(int tonerLevel) {
        if (!(tonerLevel > -1 && tonerLevel <= 100)) {
            tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        return this;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
        return this;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public Printer setDuplex(boolean duplex) {
        this.duplex = duplex;
        return this;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            setTonerLevel(getTonerLevel() + tonerAmount);
            return getTonerLevel();
        } else return -1;
    }

    public int printPages(int pages) {
        int temp = 0;
        if (isDuplex()) {
            temp += pages / 2;
            pagesPrinted += temp;
            return pages / 2;
        }
        pagesPrinted+=pages;
        return pages;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

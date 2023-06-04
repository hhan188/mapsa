package com.practice14.Excercise49;

public abstract class ListItem
{
    protected ListItem rightList;
    protected ListItem leftList;
    protected Object value;

    public ListItem(Object value)
    {
        this.value = value;
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }

    public abstract Object next();
    public abstract Object setNext();
    public abstract Object previous();
    public abstract Object setPrevious();
    public abstract Object compareTo();
}

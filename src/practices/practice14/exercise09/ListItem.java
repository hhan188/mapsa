package practices.practice14.exercise09;


public abstract class ListItem<T,O> implements Comparable<ListItem<T,O>> {
    protected T rightLink, leftLink;
    protected O value;




    public abstract T next();

    public abstract void setNext(T rightLink);

    public abstract T previous();

    public abstract void setPrevious(T leftLink);

    public abstract O getValue();

    public abstract void setValue(O value);




}

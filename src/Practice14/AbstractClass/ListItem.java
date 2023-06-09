package Practice14.AbstractClass;

public abstract class ListItem<T extends Comparable<T>> {
    public ListItem(T value) {
        this.value = value;
    }

    protected ListItem<T> rightLink;
    protected ListItem<T> leftLink;
    protected T value;

    abstract ListItem<T> next();

    abstract void setNext(ListItem<T> listItem);

    abstract ListItem<T> previous();

    abstract void setPrevious(ListItem<T> listItem);

}

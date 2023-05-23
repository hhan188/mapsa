package Prac14.P49;

public abstract class ListItem<T extends Comparable<T>> {
    protected ListItem<T> rightLink, leftLink;
    protected T value;

    public ListItem(T value) {
        this.value = value;
    }
    public ListItem(T value, ListItem<T> next, ListItem<T> pervious) {
        this.value = value;
        this.rightLink = next;
        this.leftLink = pervious;
    }

    abstract ListItem<T> next();
    abstract ListItem<T> pervious();
    abstract void setNext(ListItem<T> next);
    abstract void setPervious(ListItem<T> pervious);
    abstract int compareTo(ListItem<T> target);

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

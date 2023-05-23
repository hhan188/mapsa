package Prac14.P49;

public interface NodeList<T extends Comparable<T>> {
    ListItem<T> getRoot();
    boolean addItem(T item);
    boolean removeItem(T item);
    void traverse();
}

package Prac14.P49;

public class Node<T extends Comparable<T>> extends ListItem<T>{
    public Node(T value) {
        super(value);
    }

    public Node(T value, ListItem<T> next, ListItem<T> pervious) {
        super(value, next, pervious);
    }

    @Override
    ListItem<T> next() {
        return rightLink;
    }

    @Override
    ListItem<T> pervious() {
        return leftLink;
    }

    @Override
    void setNext(ListItem<T> next) {
        rightLink = next;
    }

    @Override
    void setPervious(ListItem<T> pervious) {
        leftLink = pervious;
    }

    @Override
    int compareTo(ListItem<T> target) {
        return value.compareTo(target.value);
    }
}

package Practice14.AbstractClass;

public class Node<T extends Comparable<T>> extends ListItem<T> {

    public Node(T o) {
        super(o);
    }

    public Node(T o, ListItem<T> perv, ListItem<T> next) {
        super(o);
        rightLink = next;
        leftLink = perv;
    }


    @Override
    ListItem<T> next() {
        return rightLink;
    }

    @Override
    void setNext(ListItem<T> listItem) {
        this.rightLink = listItem;
    }

    @Override
    ListItem<T> previous() {
        return leftLink;
    }

    @Override
    void setPrevious(ListItem<T> listItem) {
        leftLink = listItem;
    }


}
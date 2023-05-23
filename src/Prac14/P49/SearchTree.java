package Prac14.P49;

import java.util.TreeSet;

public class SearchTree<T extends Comparable<T>> implements NodeList<T>{
    private ListItem<T> root;

    public SearchTree() {}

    public SearchTree(T item) {
        root = new Node<T>(item);
    }

    @Override
    public ListItem<T> getRoot() {
        return root;
    }

    @Override
    public boolean addItem(T item) {
        root = insert(root, item);
        return true;
    }

    private ListItem<T> insert(ListItem<T> root, T item) {
        if (root == null) {
            root = new Node<T>(item);
            return root;
        }

        if (root.getValue().compareTo(item) > 0)
            root.setPervious(insert(root.pervious(), item));
        else if (root.getValue().compareTo(item) < 0)
            root.setNext(insert(root.next(), item));

        return root;
    }

    @Override
    public boolean removeItem(T item) {
       root = delete(root, item);
       return true;
    }

    private ListItem<T> delete(ListItem<T> root, T item) {
        if (root == null)
            return null;

        if (root.getValue().compareTo(item) > 0)
            root.setPervious(delete(root.pervious(), item));
        else if (root.getValue().compareTo(item) < 0)
            root.setNext(delete(root.next(), item));
        else {
            if (root.pervious() == null)
                return root.next();
            else if (root.next() == null)
                return root.pervious();

            root.setValue(findMin(root.next()));

            root.setNext(delete(root.next(), root.getValue()));
        }

        return root;
    }
    private T findMin(ListItem<T> root) {
        T minv = root.getValue();
        while (root.pervious() != null) {
            minv = root.pervious().getValue();
            root = root.pervious();
        }
        return minv;
    }
    @Override
    public void traverse() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(ListItem<T> node) {
        if (node == null)
            return;

        printInOrder(node.pervious());

        System.out.print(node.getValue() + " -> ");

        printInOrder(node.next());
    }
}

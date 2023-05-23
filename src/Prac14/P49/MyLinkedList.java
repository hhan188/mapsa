package Prac14.P49;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList<T extends Comparable<T>> implements NodeList<T>{
    private ListItem<T> root;

    public MyLinkedList(){}

    public MyLinkedList(T root) {
        this.root = new Node<>(root);
    }

    @Override
    public ListItem<T> getRoot() {
        return root;
    }

    @Override
    public boolean addItem(T item) {
        ListItem<T> currentNode = root;

        if (this.root == null) {
            root = new Node<T>(item);
        } else {
            while (currentNode.next() != null) {
                currentNode = currentNode.next();
            }
            currentNode.setNext(new Node<T>(item, null, currentNode));
        }
        return true;
    }

    @Override
    public boolean removeItem(T item) {
        for (ListItem<T> x = root; x != null; x = x.next()) {
            if (x.value.equals(item)) {
                x.pervious().setNext(x.next());
                x.next().setPervious(x.pervious());
                x.setNext(null);
                x.setPervious(null);
                return true;
            }
        }
        System.err.println("item not found in list");
        return false;
    }

    @Override
    public void traverse() {
        if (root == null) {
            System.err.println("The list is empty");
            return;
        }

        for (ListItem<T> x = root; x != null; x = x.next()) {
            System.out.print(x.next() != null ? x.value + " -> " : x.value);
        }
        System.out.println();
    }
}

package Practice14.AbstractClass;


public class MyLinkedList<T extends Comparable<T>> implements NodeList<T> {
    ListItem<T> root;

    public MyLinkedList(T root) {
        this.root = new Node<>(root);
    }

    public ListItem<T> getRoot() {
        return root;
    }
    @Override
    public boolean addItem(T listItem) {
        ListItem<T> currentNode = root;
        while (currentNode.next() != null)
            currentNode = currentNode.next();

        currentNode.setNext(new Node<T>(listItem, currentNode, null));
        return true;
    }

    @Override
    public void removeItem(T listItem) {
        ListItem<T> currentNode = root;
        while (currentNode != null) {
            currentNode = currentNode.next();
            if (currentNode.value == listItem) {
                currentNode.previous().setNext(currentNode.next());
                currentNode.next().setPrevious(currentNode.previous());
                currentNode.setPrevious(null);
                currentNode.setNext(null);
            }
        }
    }

    @Override
    public void traverse() {
        if (root == null)
            System.out.println("The list is empty");
        ListItem<T> currentNode = root;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next();
        }
    }

}

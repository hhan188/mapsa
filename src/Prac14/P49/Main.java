package Prac14.P49;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(1);
        MyLinkedList<Integer> linkedList2 = new MyLinkedList<>();
        linkedList.addItem(3);
        linkedList.addItem(5);
        linkedList.traverse();
        linkedList.removeItem(3);
        linkedList.traverse();
        linkedList.removeItem(85);
        linkedList2.traverse();
        linkedList2.addItem(85);
        linkedList2.traverse();

        /*
        Binary Search Tree
         */
        SearchTree<Integer> searchTree = new SearchTree<>();
        searchTree.addItem(50);
        searchTree.addItem(30);
        searchTree.addItem(20);
        searchTree.addItem(40);
        searchTree.addItem(70);
        searchTree.addItem(60);
        searchTree.addItem(80);
        System.out.println("traverse inorder before deletion");
        searchTree.traverse();
        searchTree.removeItem(20);
        System.out.println("after delete 20");
        searchTree.traverse();
        searchTree.removeItem(30);
        System.out.println("after delete 30");
        searchTree.traverse();
        searchTree.removeItem(50);
        System.out.println("after delete 50");
        searchTree.traverse();
    }
}

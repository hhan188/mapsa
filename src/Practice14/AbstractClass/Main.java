package Practice14.AbstractClass;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> intList = new MyLinkedList<>(4);
        intList.addItem(5);
        intList.addItem(7);
        intList.traverse();

    }

}

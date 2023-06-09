package Practice14.AbstractClass;

public interface NodeList<T extends Comparable<T>> {

    ListItem<T> getRoot();
    boolean addItem(T listItem);
    void removeItem(T listItem);
    void traverse();

}

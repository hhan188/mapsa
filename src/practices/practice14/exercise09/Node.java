package practices.practice14.exercise09;

public class Node extends ListItem<ListItem,Object>{

    @Override
    public ListItem next() {
        return rightLink;
    }

    @Override
    public void setNext(ListItem rightLink) {
        super.rightLink=rightLink;

    }

    @Override
    public ListItem previous() {
        return super.leftLink;
    }

    @Override
    public void setPrevious(ListItem leftLink) {
        super.leftLink=leftLink;

    }

    @Override
    public Object getValue() {
        return super.value;
    }

    @Override
    public void setValue(Object value) {
        super.value=value;

    }

    @Override
    public int compareTo(ListItem listItem) {
        return 0;
    }
}

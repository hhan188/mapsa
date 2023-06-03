package SoheylSayyah.Practice14.Exercise13;

abstract class ListItem
{
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;
    public ListItem(Object value)
    {
        this.value = value;
    }
    abstract void next();
    abstract void setNext();
    abstract void previous();
    abstract void setPrevious();
    abstract void compareTo();
}

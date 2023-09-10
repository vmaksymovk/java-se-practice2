package pl.globallogic.exercises;

public abstract class ex46ListItem {
    protected ex46ListItem rightLink = null;
    protected ex46ListItem leftLink = null;
    protected Object value;

    public ex46ListItem(Object value) {
        this.value = value;
    }

    abstract ex46ListItem next();
    abstract ex46ListItem setNext(ex46ListItem item);
    abstract ex46ListItem previous();
    abstract ex46ListItem setPrevious(ex46ListItem item);
    abstract int compareTo(ex46ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

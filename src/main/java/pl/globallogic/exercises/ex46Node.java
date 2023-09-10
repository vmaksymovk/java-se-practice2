package pl.globallogic.exercises;

public class ex46Node extends ex46ListItem {
    public ex46Node(Object value) {
        super(value);
    }

    @Override
    ex46ListItem next() {
        return this.rightLink;
    }

    @Override
    ex46ListItem setNext(ex46ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ex46ListItem previous() {
        return this.leftLink;
    }

    @Override
    ex46ListItem setPrevious(ex46ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ex46ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}

package pl.globallogic.exercises;

public class ex46MyLinkedList implements ex46NodeList {
    private ex46ListItem root = null;

    public ex46MyLinkedList(ex46ListItem item) {
        this.root = item;
    }

    @Override
    public ex46ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ex46ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ex46ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.previous().setNext(newItem);
                    currentItem.setPrevious(newItem);
                } else {
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ex46ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ex46ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // Found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ex46ListItem root) {
        if (root == null) {
            System.out.println("The list is empty.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }

    public static void main(String[] args) {
        ex46ListItem item1 = new ex46Node("Item 1");
        ex46ListItem item2 = new ex46Node("Item 2");
        ex46ListItem item3 = new ex46Node("Item 3");

        ex46MyLinkedList list = new ex46MyLinkedList(item2);
        list.addItem(item1);
        list.addItem(item3);
        list.traverse(list.getRoot());
    }
}


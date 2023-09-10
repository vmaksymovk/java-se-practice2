package pl.globallogic.exercises;

interface ex46NodeList {
    ex46ListItem getRoot();
    boolean addItem(ex46ListItem item);
    boolean removeItem(ex46ListItem item);
    void traverse(ex46ListItem root);
}
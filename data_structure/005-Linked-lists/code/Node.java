package LinkedList;

public class Node {
    private int value;
    private Node next;

    // ####################
    // Constructor
    // ####################

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    // ####################
    // GETTER & SETTERS
    // ####################

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }


    // ####################
    // To String
    // ####################
    public String toString(){
        return value + "";
    }
}

package LinkedList;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private int listSize = 0;

    // ####################
    // Constructor
    // ####################

    public MyLinkedList() {
        super();
    }

    // ####################
    // Methods
    // ####################
    public void addTail(Node newNode){
        if (listSize == 0){
            head = newNode;
        } else
            tail.setNext(newNode);
        tail = newNode;
        listSize++;
    }

    public void addHead(Node newNode){
        if(listSize == 0){
            tail = newNode;
        } else
            newNode.setNext(head);
        head = newNode;
        listSize++;
    }

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public void printList(){
        Node aux = head;
        System.out.println("\n\n");
        String border = "+-------------+-------------+-------------+-------------+";

        System.out.println(border);
        System.out.printf("| %-19s %s %18s |\n", "", "My Linked List", "");
        System.out.println(border);
        do{
            System.out.print("[ " + aux.getValue() + " ] --> ");
            aux = aux.getNext();
        }while(aux != null);
        System.out.println("null");
        System.out.println(border);
    }

}

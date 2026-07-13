package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op = 9;
        Scanner read = new Scanner(System.in);
        MyLinkedList myLinkedList = new MyLinkedList();

        while (op != 0){
            String border = "+-------------+-------------+";

            System.out.println(border);
            System.out.printf("| %-9s %s %9s |\n", "", "MENU ", "");
            System.out.println(border);
            System.out.printf("| %d | %-21s |\n", 1, "Add item in tail");
            System.out.printf("| %d | %-21s |\n", 2, "Add item in head");
            System.out.printf("| %d | %-21s |\n", 3, "Add after specific");
            System.out.printf("| %d | %-21s |\n", 4, "Remove from tail");
            System.out.printf("| %d | %-21s |\n", 5, "Remove from head");
            System.out.printf("| %d | %-21s |\n", 6, "Remove specific");
            System.out.printf("| %d | %-21s |\n", 7, "Print my linked list");
            System.out.println(border);
            System.out.printf("| %s | %-21s |\n", 7, "Choose your option:");
            System.out.println(border);
            System.out.print("Option --> ");
            op = read.nextInt();

            switch (op){
                case 0:
                    break;
                case 1:
                    System.out.println("Type the value to be add in the tail: ");
                    int valueTail = read.nextInt();
                    Node nodeTail = new Node(valueTail, null);
                    myLinkedList.addTail(nodeTail);
                    break;
                case 2:
                    System.out.println("Type the value to be add in the head: ");
                    int valueHead = read.nextInt();
                    Node nodeHead = new Node(valueHead, null);
                    myLinkedList.addHead(nodeHead);
                    break;
                case 7:
                    myLinkedList.printList();
                    break;
                default:
                    System.out.println("Other options");
            }
        }
    }
}

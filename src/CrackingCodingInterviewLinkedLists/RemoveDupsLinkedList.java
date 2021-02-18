package CrackingCodingInterviewLinkedLists;

import java.util.HashSet;
import java.util.Hashtable;

public class RemoveDupsLinkedList {
    /*
    Write code to remove duplicates from an unsorted linked list.
     */
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        System.out.println(h.isEmpty());

        Node n1 = createList1234();
        n1.appendToTail(3);
        printList(n1);

        System.out.println();
      //  Node t1 = deleteNode(n1, 2);
        Node t1 = removeDups(n1);
        printList(t1);
    }
    public static Node createList1234() {
        Node n = new Node(1);
        n.appendToTail(2);
        n.appendToTail(3);
        n.appendToTail(4);
        return n;
    }
    public static void printList(Node head){
        Node n = head;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
    public static Node deleteNode(Node head, int del) {
        Node n = head;
        if (n.data == del) {
            return head.next;
        }

        while(n.next != null){
            if (n.next.data == del) {
                n.next = n.next.next;
            }
            n = n.next;

        }
        return head;
    }
    public static Node removeDups(Node head) {
        HashSet<Integer> h = new HashSet<>();
        Node n = head;
        Node prev = null;
        while(n != null) {
            if (h.contains(n.data)) {
                prev.next =  n.next;
            } else {
                h.add(n.data);
                prev = n;
            }
            n = n.next;
        }
        return n;
    }
}

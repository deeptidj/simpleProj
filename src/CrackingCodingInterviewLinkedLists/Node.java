package CrackingCodingInterviewLinkedLists;

public class Node {
    int data;
    Node next = null;
    Node(int d) {
        this.data = d;
    }
    void appendToTail( int k) {
        Node n = new Node(k);
        Node curr = this;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;

    }
}

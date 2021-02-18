package com.company.DataStructuresLinkedLists;

public class LinkedList {
    Node head = null;
    Node tail = null;

    public void addNode(int newNodeData) {
        Node n = new Node(newNodeData);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }
    public void display() {
        Node curr = this.head;
        if (curr == null) {
            System.out.println("List is empty.");
        }
        while(curr != null) {
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public void displayListFRomThisNode(Node node) {
        Node curr = node;
        if (curr == null) {
            System.out.println("List is empty.");
        }
        while(curr != null) {
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public int countNodes() {
        Node curr = new Node();
        curr = head;
        int countNodes=0;
        while(curr != null) {
            countNodes++;
            curr = curr.next;
        }
        return countNodes;
    }
    ///Reverses list from node h1 to node t1, if you need until the end then give t1 as null.
    public Node reverse(Node h1, Node t1) {

        if (h1 == null) {
            System.out.println("List is empty.");
        }

        Node prev = new Node();
        prev = null;

        while(h1 != t1) {
            Node next_node = h1.next;
            h1.next = prev;
            prev = h1;
            h1 = next_node;
        }
        h1 = prev;
        return h1;
    }
    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            if (head == tail) {
                head = tail;
            }
            else {
                head = head.next;
            }
        }
    }
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head == tail) {
            System.out.println("List has only one node");
            return;
        }
        Node curr = head;
        while(curr.next != tail) {
            System.out.println("data = " +curr.data);
            curr = curr.next;
        }
       tail = curr;
        tail.next = null;

    }
    public void deleteFromMiddle() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (head == tail) {
            System.out.println("List has only one node");
            return;
        }
        int mid = (this.countNodes()%2 == 0) ? this.countNodes()/2 : (this.countNodes()+1)/2 ;
        Node curr = head; Node prev= curr; int count = 0;
        while(curr != null) {
            if(count == mid) {
                System.out.println("** Middle **");
                prev.next = curr.next;
            }
            count++;
            prev = curr;
            curr = curr.next;

        }
    }
    public boolean isPalindrome(LinkedList l1, LinkedList l2) {
        if (l1 == null || l2 == null) {
            System.out.println("List is empty");
            return false;
        }
        if (l1.countNodes() != l2.countNodes()) {
            System.out.println("They are nopt of same length so not palindromes");
            return false;
        }

        Node c1 = l1.head;
        Node c2 = l1.reverse(l2.head, null);

        while(c1 != null) {
            if(c1.data != c2.data) {
                return false;
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        return true;
    }
    public int maxValue(LinkedList l) {
        int max ;
        if (l.head == null) {
            System.out.println("List is empty");
        }
        Node curr = l.head;
        max = curr.data;
        while(curr != null) {
            max = curr.data > max ? curr.data : max;
            curr = curr.next;
        }
        return max;
    }

    public int minValue(LinkedList l) {
        int min ;
        if (l.head == null) {
            System.out.println("List is empty");
        }
        Node curr = l.head;
        min = curr.data;
        while(curr != null) {
            min = curr.data < min ? curr.data : min;
            curr = curr.next;
        }
        return min;
    }
    public int searchElement(int search) {
        Node curr = head; int count = 1;
        while(curr != null) {
            if (curr.data == search) {
                return count;
            }
            count++;
            curr = curr.next;
        }
        return  -1;
    }
    //index starting from 0
    public Node addNewNodeAt(int d, int index) {
        Node curr = head;
        Node newNode = new Node(d);
        if (curr == null && index == 0) {
            System.out.println("List is empty, creating new list");
            head = newNode;
            tail = newNode;
            return newNode;
        } else if (curr != null && index == 0) {
            //wants to add a node at the start of the list.
            newNode.next = head;
            head = newNode;
        }
        int noOfNodes = this.countNodes();
        int count = 0;
        Node prev = curr;
        while (curr.next != null) {
            if(index <= count) {
                newNode.next = prev.next;
                prev.next = newNode;
                return head;
            } else if (index > noOfNodes) {
                tail.next = newNode;
                tail = newNode;
                return head;
            }
            count++;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
    public int findNthToLast(int n) {
        Node curr =head; Node runner = head; int count = 0;
        while(runner != null) {
            if (n == count) {
                break;
            }
            count++;
            runner = runner.next;
        }
        while(runner != null) {
            curr = curr.next;
            runner = runner.next;
        }
        return curr.data;
    }
    public boolean deleteNode(Node n) {
        Node next_node = n.next;
        n.data = next_node.data ;
        n.next = next_node.next;
        return true;
    }

    public LinkedList sum(LinkedList l1, LinkedList l2) {
        Node c1 = l1.head;
        Node c2 = l2.head;
        int sum = 0 ; int carry = 0;
        while(c1 != null) {
            int totSum = (c1.data + c2.data);
           // carry = sum % 10 ?  : ;
            c1 = c1.next;
        }

        return null;
    }
    public static void main(String[] args) {
      //  LinkedList sList = new LinkedList();
        //Add nodes to the list
//        sList.addNode(11);
//        sList.addNode(22);
//        sList.addNode(33);
//        sList.addNode(44);
//        sList.addNode(55);
//        sList.addNode(66);
//        sList.addNode(77);
//
//        sList.addNewNodeAt(88,8);
//        sList.display();
        //Displays the nodes present in the list
//        sList.display();
//        System.out.println("No. of nodes = "+sList.countNodes());
//
//        sList.addNewNodeAt(5,0);
//        sList.display();
//
//        sList.addNewNodeAt(25,2);
//        sList.display();
//
//        sList.addNewNodeAt(35,4);
//        sList.display();

//        System.out.println(sList.findNthToLast(1));
//        Node n = sList.head.next.next;
//        System.out.println(sList.deleteNode(n));
//        sList.display();
        //System.out.println(sList.searchElement(35));
        //sList.deleteFromStart();
        //sList.display();
        //System.out.println(sList.countNodes());

//        System.out.println();
//        Node reversedHead = sList.reverse(sList.head, sList.tail);
//        sList.display(reversedHead);

//        sList.deleteFromMiddle();
//        sList.display();
//
//        sList.deleteFromEnd();

//        sList.display();

      //  sList.isPalindrome(sList);

//        Node reversed = sList.reverse(sList.head, null);
//        sList.displayListFRomThisNode(reversed);

//        LinkedList l1 = new LinkedList();
//        LinkedList l2 = new LinkedList();
//        l1.addNode(1);
//        l1.addNode(2);
//        l1.addNode(3);
//        l1.addNode(3);
//        l1.addNode(23);
//        l1.addNode(-4);

//        l2.addNode(4);
//        l2.addNode(3);
//        l2.addNode(2);
//        l2.addNode(1);
//        boolean result = l1.isPalindrome(l1,l2);
//        System.out.println("palindromes = "+result);


//        System.out.println("Max Value "+l1.maxValue(l1));
//        System.out.println("Min Value "+l1.minValue(l1));

//        LinkedList l = new LinkedList();
//        Node n= l.addNewNodeAt(11,0);
//        l.addNewNodeAt(1,0);
//        l.addNewNodeAt(2,1);
//        l.addNewNodeAt(22,2);
//        l.addNewNodeAt(33,3);
//        l.display();

         LinkedList l1 = new LinkedList();
         l1.addNode(3);
        l1.addNode(1);
        l1.addNode(5);
         LinkedList l2 = new LinkedList();
         l2.addNode(5);
        l2.addNode(9);
        l2.addNode(2);


    }
}

package LinkedList;

public class circularLL {

    private Node head;
    private Node tail;


    public circularLL() {
        this.head = null;
        this.tail = null;
    }

    //insertion 
    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        } 
        tail.next = node;
        node.next = head;
        tail = node;

    
    }

    public void delete() {
        Node node = head;
        if(head == null) {
            return;
        }
        if(head == tail) {
            head = null;
            tail = null;
            return;
        }
        while(node.next != tail) {
            node = node.next;
        }
        node.next = head;
        tail = node;
    }

   public void display() {
        Node node = head;
        if(head == null) {
            return;
        }
        do {
            System.out.print(node.value + " ");
            node = node.next;
        } while(node != head);
        System.out.println("End");
    }
  

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


    
}

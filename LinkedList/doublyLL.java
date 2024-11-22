package LinkedList;

public class doublyLL {

    private Node head;

    //insertion at the beginning
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
        
    }

    //insertion at the end
    public void insertAtLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        
        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }


    public void display() {
        Node node = head;
        Node last = null; //to store the last node
        System.out.print("Print in forward: ");
        while(node != null) {
            last = node; // this is to store the last node
            System.out.print(node.value + "->");
            node = node.next;
            
        }
        System.out.println("END");

        System.out.print("Print in reverse: ");
        while(last != null) {
            System.out.print(last.value + "->");
            last = last.prev;
        }

        System.out.println("END");


    }



    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next, Node prev) {
        //     this.value = value;
        //     this.next = next;
        //     this.prev = prev;
        // }
    }
    
}

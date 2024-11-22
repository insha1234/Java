package LinkedList;

public class singlyLL {

    private Node head;
    private Node tail;
    private int size;

    public singlyLL() {
        this.size=0;
    }

    //insertion at the beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;  // here we are telling the new node to point to the head
        head = node; // here we are making the new node as the head

        if(tail == null) { // if the tail is null that means the list is empty
            tail = head;
        }

        size++;

    }

    //insertion at the end
    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;// here we are telling the tail to point to the new node
        tail = node; // here we are making the new node as the tail
        size++;

    }


    //insertion at a given position
    public void inserAtPos(int val , int index) {
        if(tail == null) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        Node node = head;
        for(int i=1;i<index;i++) { //we have not started from 0 because we have already taken the head node
            node = node.next;
        }

        Node temp = new Node(val , node.next); // here we have taken node.next because we want to insert the new node at the given index
        node.next = temp;
        size++;

    } 

    //deletion at the beginning
    public int deleteFirst() {
        int val = head.value; // storing the value of the head node
        head = head.next; // making the next node as the head
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    //deletion at the end
    public Node get(int index) {
        Node node = head;
        for(int i=0;i<index;i++) {
            node = node.next;
        }
        return node;
    }
    
    public int deleteLast() {
        if(size == 1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        secondLast.next = null;
        tail = secondLast;

        size--;
        return val;
    }

    public int deleteAtPos(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size-1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }


    //display the list
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size: " + getSize());
    }
    
    public int getSize() {
        return size;
    }

    public Node find(int val) {
        Node node = head;
        while(node!=null) {
            if(node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value , Node next) {
            this.value = value;
            this.next = next;
        }

    }
    
}

// time complexity of insertFirst() and insertLast() is O(1) and display() is O(n) where n is the number of nodes in the list



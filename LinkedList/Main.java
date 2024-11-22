package LinkedList;

public class Main {

    public static void main(String[] args) {
        singlyLL list = new singlyLL();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertLast(50);
        list.inserAtPos(25, 2);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtPos(1));
        list.display();

        System.out.println(list.find(30));


        doublyLL list2 = new doublyLL();

        list2.insertAtFirst(10);
        list2.insertAtFirst(20);
        list2.insertAtFirst(30);
        list2.insertAtFirst(40);
        list2.insertAtLast(50);
        list2.display();

        circularLL list3 = new circularLL();

        list3.insert(10);
        list3.insert(20);
        list3.insert(30);
        list3.insert(40);
        list3.display();
        list3.delete();

        list3.display();
    }
    
}

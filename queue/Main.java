package queue;

public class Main {

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        
            queue.insert(10);
            queue.insert(20);
            queue.insert(30);
            queue.insert(40);
            queue.insert(50);

            
            queue.display();
    
    }
    
}

package stack;

public class CustomStack {
    protected int[] data; //array to store the elements of the stack
    private static final int DEFAULT_CAPACITY = 10;//default capacity of the stack

    public CustomStack() {
        this(DEFAULT_CAPACITY); 
    }
     
    public CustomStack(int capacity) {
        this.data = new int[capacity]; //initializing the array with the given capacity
    }

    int ptr = -1;

    public boolean push(int item) {

        if(ptr == data.length-1) { //if the stack is full
            System.out.println("Stack is full");  
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return data[ptr];
    }

    private boolean isEmpty() {
        return ptr == -1;
    }



    
}

package stack;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int capacity) {
            super(capacity);
    }

    @Override
    public boolean push(int item) {
        if(ptr == data.length-1) {
            int[] temp = new int[data.length*2];
            for(int i=0; i<data.length; i++) {
                temp[i] = data[i];
            }
            data = temp; //assigning the new array to the data array
        }
        
        return super.push(item);

    }
    

    
}

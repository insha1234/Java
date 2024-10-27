package arrays;
import java.util.*;

public class leftRotByOneBA {
    public static void leftRotateByOne(int[] arr) {
        int temp=arr[0];
        int n= arr.length;
        for(int i=0;i<n-1;i++) {
            arr[i] = arr[i+1];

        }
        arr[n-1]=temp;

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array after left rotating by one is: " );
        leftRotateByOne(arr);


        sc.close();
    }
    
}


// Time Complexity: O(N)
// Space Complexity: O(1) because we are not using any extra space. We are just rotating the elements of the array.
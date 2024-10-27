//using reversal algorithm

package arrays;
import java.util.*;

public class leftRotbyK {

    public static void reverse(int[] arr , int start , int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr , int n, int k) {
        reverse(arr , 0 , k-1);
        reverse(arr , k , n-1);
        reverse(arr , 0 , n-1);
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
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        leftRotate(arr , n , k);
        sc.close();
        

    }

    
}

// Time Complexity: O(N)
// Space Complexity: O(1) because we are not using any extra space. We are just rotating the elements of the array.

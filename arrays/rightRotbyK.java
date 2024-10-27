package arrays;
import java.util.*;


public class rightRotbyK {
    public static void rotate(int[] arr , int n , int k) {
        int temp[] = new int[n];
        for(int i=0;i<n;i++) {
            if(i<k) {
                temp[i] = arr[n-(k-i)];
            }
            else {
                temp[i] = arr[i-k];
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(temp[i]+" ");
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
        System.out.println("The array after right rotating by k is: ");
        rotate(arr,n,k);
        sc.close();
    }
    
}

// Time Complexity: O(N)
// Space Complexity: O(N) because we are using an extra array to store the rotated elements of the array.

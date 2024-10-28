package arrays;
import java.util.*;

public class maxConsecOne {

    public static int maxConsecOnes(int[] arr) {
        int n = arr.length;
        int count = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                
            }
            res = Math.max(res, count);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
       
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum number of consecutive ones in the array is: " + maxConsecOnes(arr));

        sc.close();
    }
}

// Time complexity: O(N)
// Space complexity: O(1) because we are not using any extra space. We are just iterating through the array.

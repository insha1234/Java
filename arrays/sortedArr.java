package arrays;
import java.util.Scanner;

public class sortedArr {
    public static boolean ifArrySorted(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++) {
            if(arr[i-1]>arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean sorted = ifArrySorted(arr);
        if(sorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
       
    }
    
}

/*
 Time Complexity: O(N)

Space Complexity: O(1)
 */
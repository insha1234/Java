package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void sorting(int[] arr) {
        int n=arr.length;

        for(int i=0;i<n-1;i++) { // this loop is for the number of passes
            for(int j=i+1;j>0;j--) { // this loop is for the number of comparisons for each pass
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }

     }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        sorting(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    
}

// Time Complexity of Insertion Sort: O(n^2)
// Best Case Time Complexity of Insertion Sort: O(n)
// Space Complexity of Insertion Sort: O(1)

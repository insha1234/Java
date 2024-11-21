package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {

    public static void sorting(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for(int i=0;i<n;i++) { // this loop is for the number of passes
            swapped = false;
            for(int j=1;j<n-i;j++) { // this loop is for the number of comparisons for each pass
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
        if(!swapped) {
            break;
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

// Time Complexity of Bubble Sort: O(n^2)
// Space Complexity of Bubble Sort: O(1)

package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void sorting(int[] arr) {
        int n=arr.length;

        for(int i=0;i<n;i++) {

        int last = n-i-1;
        int maxIndex = getMaxIndex(arr, 0, last);
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
        }
    }

    public static int getMaxIndex(int[] arr, int start , int last) {
        int maxIndex = start;
        for(int i=start;i<=last;i++) {
            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }

        }
        return maxIndex;
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

// Time Complexity of Selection Sort: O(n^2)
// Space Complexity of Selection Sort: O(1)

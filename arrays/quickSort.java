package arrays;

public class quickSort {

    static void QuickSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int s= start;
        int e = end;
        int mid = (start + end) / 2;
        int pivot = arr[mid];

        while(s <= e) {
            while(arr[s] < pivot) {
                s++;
            }
            while(arr[e] > pivot) {
                e--;
            }
            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        QuickSort(arr, start, e);
        QuickSort(arr, s, end);
    }

          public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort(arr, 0, arr.length-1);
        System.out.println(java.util.Arrays.toString(arr));
    }
    
    
}

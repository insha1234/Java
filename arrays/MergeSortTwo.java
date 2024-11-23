package arrays;

import java.util.Arrays;

public class MergeSortTwo {

    static void mergeSortInPlace(int[] arr, int start, int end) {
        if(end - start == 1) {
            return;
        }
            int mid = (start + end) / 2;
            mergeSortInPlace(arr, start, mid);
            mergeSortInPlace(arr, mid , end);

            mergeInPlace(arr, start, mid, end);
        
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
       int[] mix = new int[e-s];

       int i=s;
       int j=m;
       int k=0;

       while(i<m && j<e) {
           if(arr[i] < arr[j]) {
               mix[k] = arr[i];
               i++;
           }
           else {
               mix[k] = arr[j];
               j++;
           }
           k++;
       }

         while(i<m) {
              mix[k] = arr[i];
              i++;
              k++;
         }

            while(j<e) {
                mix[k] = arr[j];
                j++;
                k++;
            }

            for(int l=0; l<k; l++) {
                arr[s+l] = mix[l];
            }

    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}

//time complexity: O(nlogn)
//space complexity: O(n) 


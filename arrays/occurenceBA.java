//using XOR operator to find the single element in the array.

package arrays;

public class occurenceBA {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
    
}

// Time complexity: O(N)
// Space complexity: O(1) because we are not using any extra space. We are just XORing the elements of the array.

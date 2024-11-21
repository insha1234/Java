package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][4];
        
        // input
        for(int row=0;row<arr.length;row++) { // arr.length will give the number of rows
            for(int col=0;col<arr[row].length;col++) { // arr[row].length will give the number of columns in the row
                arr[row][col] = sc.nextInt();
            }
        }

        // output
        for(int row=0;row<arr.length;row++) {
            for(int col=0;col<arr[row].length;col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        for(int[] a : arr) { // enhanced for loop for 2D array
            System.out.println(Arrays.toString(a));
        }
        sc.close();
        
    }


    
}

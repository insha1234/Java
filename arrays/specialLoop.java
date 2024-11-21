package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class specialLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int num: arr) { // here we are using enhanced for loop , num is the variable that will store the value of the array element
            System.out.print(num+" ");
            
        }
        System.out.println(Arrays.toString(arr)); // this will print the array in the form of string
        sc.close();
    }
   
}

package arrays;
import java.util.*;


public class removeDupl {
    public static int removeDuplicates(int[] arr) {
        HashSet <Integer> set = new HashSet < > ();
        for(int i=0;i<arr.length;i++) {
            set.add(arr[i]);
        }
        int k=set.size();
        int j=0;
        for(int i:set) {
            arr[j]=i;
            j++;
        }
        return k;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicates is: ");
        for(int i=0;i<k;i++) {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    

}

/*Time complexity: O(n*log(n))+O(n) 

Space Complexity: O(n) */

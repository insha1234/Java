// using two pointer approach to find the union of two arrays

package arrays;
import java.util.*;

public class UnionBA {
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
       ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
       while (i < n && j < m) {
         if (arr1[i] <= arr2[j]) // Case 1 and 2
         {
           if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
             Union.add(arr1[i]);
           i++;
         } else // case 3
         {
           if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
             Union.add(arr2[j]);
           j++;
         }
       }
       while (i < n) // IF any element left in arr1
       {
         if (Union.get(Union.size()-1) != arr1[i])
           Union.add(arr1[i]);
         i++;
       }
       while (j < m) // If any elements left in arr2
       {
         if (Union.get(Union.size()-1) != arr2[j])
           Union.add(arr2[j]);
         j++;
       }
       return Union;
     }




    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        ArrayList <Integer> ans = FindUnion(arr1, arr2, m, n);
        System.out.println("The union of the two arrays is: "); 
        for(int i:ans) {
            System.out.print(i+" ");
        }
        sc.close();

    }
    
}

//Time Complexity: O(m+n) where m is the size of the first array and n is the size of the second array
//Space Complexity: O(m+n) where m is the size of the first array and n is the size of the second array

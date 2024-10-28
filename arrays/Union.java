//using HashSet to find the union of two arrays

package arrays;
import java.util.*;

public class Union {
    public static ArrayList<Integer> FindUnion(int[] arr1 , int[] arr2 , int m, int n) {
        HashSet <Integer> set = new HashSet<>();
        ArrayList <Integer> ans = new ArrayList<>();

        for(int i=0;i<m;i++) {
            set.add(arr1[i]);
        }
        for(int i=0;i<n;i++) {
            set.add(arr2[i]);
        }
        for(int i:set) {
            ans.add(i);
        }
        return ans;

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

//Time Compleixty : O( (m+n)log(m+n) )  where m is the size of the first array and n is the size of the second array
//Space Complexity : O(m+n) where m is the size of the first array and n is the size of the second array

package Strings;

import java.util.Scanner;

public class palind {
    public static boolean isPalind(String str) {
        if(str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();

        for(int i=0;i<str.length()/2;i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(isPalind(str));
        sc.close();
    }
    
}

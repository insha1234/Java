package Strings;

import java.util.Scanner;

public class replaceIII {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter the index: ");

        int index = sc.nextInt();
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0); // way to take character input from user by taking string input and then converting it to character using charAt(0)

        

        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(index, ch);

        System.out.println(sb);

        sc.close();
    }
    
}

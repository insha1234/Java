package Strings;

import java.util.ArrayList;

public class concatenate {
    public static void main(String[] args) {
        
        System.out.println("a" + "b");
        System.out.println(("a" + 1)); // same as "a" + "1"
        System.out.println('a' + 'b');
        System.out.println('a' + 1);
        System.out.println((char)('a' + 1));

        System.out.println("a" + new ArrayList<>());
        // System.out.println(("a" + new Integer(9)));
        // String ans = new Integer(9) + " " + new ArrayList<>();

        // System.out.println(ans);
    }
    
}

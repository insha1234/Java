package Strings;
import java.util.Stack;

public class reverseIII {

    public static void main(String[] args) {
        
        String str = "Javaisbeast";
        String rev = "";

        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++) {
            s.push(str.charAt(i));
        }

        while(!s.isEmpty()) {
            rev += s.pop();
            

        }
        System.out.println(rev);



    }
    
}

package Strings;

public class reverse {
    public static void main(String[] args) {
        
        String str = "Insha";
        String rev="";

        for(int i=str.length()-1;i>=0;i--) {
            char ch = str.charAt(i); // getting the character at position i of str

            String ch1 = Character.toString(ch); // converting char to string

            rev = rev.concat(ch1); // concatenating the string
        }
        System.out.println(str);
        System.out.println(rev);
    }
    
}

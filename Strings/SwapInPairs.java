package Strings;

public class SwapInPairs {

    public static String Swap(String str) {

        if(str == null || str.length() == 0) {
            return str;
        }

        char[] ch = str.toCharArray();

        for(int i=0;i<ch.length-1;i+=2) {
            char temp = ch[i];
            ch[i] = ch[i+1];
            ch[i+1] = temp;


        }

        return new String(ch);


    }

    public static void main(String[] args) {
        String str = "Insha";
        System.out.println(Swap(str));
    }
    
}

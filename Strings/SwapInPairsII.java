package Strings;

public class SwapInPairsII {

    public static String Swap(String str) {

        if(str == null || str.length() == 0) {
            return str;
       
        }

        int length = str.length();

        StringBuffer sb = new StringBuffer(length);
        
        for(int i=0;i<length-1;i+=2) {
            sb.append(str.charAt(i+1));
            sb.append(str.charAt(i));
        }

        if(length % 2 != 0) {
            sb.append(str.charAt(length-1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Insha";
        System.out.println(Swap(str));
    }


    
}

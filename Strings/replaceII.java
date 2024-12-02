package Strings;

public class replaceII {

    public static void main(String[] args) {
        
        String str = "Insha";
        int index = 3;
        char ch = 'i';

        str = str.substring(0 , index) + ch + str.substring(index+1);

        System.out.println(str);
    }
}


// time complexity: O(n)
// space complexity: O(n) 
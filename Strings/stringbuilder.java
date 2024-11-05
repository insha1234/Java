package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++) {
            char c = (char)('a' + i);
            sb.append(c);

        }

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb); 

    }
    
}

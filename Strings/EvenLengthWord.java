package Strings;

public class EvenLengthWord {

    public static void printWords(String s) {
        String[] w = s.split(" ");

        int[] len = new int[w.length];

        for(int i=0;i<w.length;i++) {
            len[i] = w[i].length();
        }

        for(int i=0;i<w.length;i++) {
            if(len[i] % 2 == 0) {
                System.out.println(w[i]);
            }
        }


    }

    public static void main(String[] args) {
        String s = "This is a test string";
        printWords(s);
    }
    
}

package OOPS.polymorphism.CompileTimePoly;

public class Sum {

    void add(int a, int b) {
        System.out.println(a+b);
    }

    int add(int a , int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        s.add(2, 3);
        System.out.println(s.add(2, 3, 4));
    }


    
}



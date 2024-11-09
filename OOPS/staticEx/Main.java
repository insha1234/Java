package OOPS.staticEx;

public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("John", 20, false);
        Human h2 = new Human("Jane", 22, true);
        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.married);
        System.out.println(h2.name);
        System.out.println(h2.age);
        System.out.println(h2.married);
        System.out.println(Human.population);
        

    }
    
}

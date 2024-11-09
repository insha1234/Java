package OOPS.staticEx;

public class Human {

    String name;
    int age;
    boolean married;
    static long population;

    public Human(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
        Human.population += 1;
        
    }
    
}

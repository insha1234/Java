package OOPS;

public class basic {
    public static void main(String[] args) {
        
        class Student {
            int rollno;
            String name;
            int age;
            int marks = 90;
        }   

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.age = 20;

        System.out.println(s1.rollno+" "+s1.name+" "+s1.age);
        System.out.println(s1.marks);
    }
    
}

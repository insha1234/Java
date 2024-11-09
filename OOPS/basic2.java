package OOPS;

public class basic2 {
    public static void main(String[] args) {
        
    

    class Student {
        int rollno;
        String name;
        int age;
        
        Student() {
            this.rollno = 1;
            this.name = "John";
            this.age = 20;
        }
    }

    Student s1 = new Student(); 
    System.out.println(s1.rollno);
    System.out.println(s1.name);
    System.out.println(s1.age);
    }

}

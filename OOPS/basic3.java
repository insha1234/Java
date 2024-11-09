package OOPS;

public class basic3 {
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

            void display() {
                System.out.println("Hell0 " + name);
            }
        }

        Student s1 = new Student();
        s1.display();

        System.out.println(s1.rollno);
        System.out.println(s1.age);

    }
    
}

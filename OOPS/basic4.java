package OOPS;

public class basic4 {

    public static void main(String[] args) {
        
        class Student {
            int rollno;
            String name;
            int age;
            
            Student() { //non-parameterized constructor
                this.rollno = 1;
                this.name = "John";
                this.age = 20;
            }

            Student(int rollno, String name, int age) { //parameterized constructor
                this.rollno = rollno;
                this.name = name;
                this.age = age;
            }

            void display() {
                System.out.println("Hell0 " + name);
            }
        }

        Student s1 = new Student(15, "Insha ", 20);
        Student s2 = new Student();
        s1.display();
      

        System.out.println(s1.rollno);
        System.out.println(s1.age);

        s2.display();
    }
    
    
}

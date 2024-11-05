package Strings;

public class basics {

    public static void main(String[] args) {
        String a = "Insha"; //object created in the string pool becuase both the string objects are same.
        String b = "Insha";

        System.out.println(a == b); // true because both the string objects are same.

        String name1 = new String("Insha"); // new keyword creates a new object in the heap memory.
        String name2 = new String("Insha"); //explicitly creating a new object outisde the string pool. 

        System.out.println(name1 == name2); // false because both the string objects are different because of new keyword.

        System.out.println(name1.equals(name2)); // true because equals method compares the content/value of the string objects.

        System.out.println(name1.compareTo(name2)); // 0 because both the string objects are same.

        System.out.println(name1.charAt(0)); // I

    }
    
}

package OOPS.polymorphism.RuntimePoly;

public class Main {
    public static void main(String[] args) {
        
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.draw();
        circle.draw();
        square.draw();
        triangle.draw();

        Shapes f1 = new Circle(); // Upcasting
        f1.draw(); // Calls the draw method of Circle class , this is called overriding
        // this will not give error as we are upcasting Circle object to Shapes object

         // Circle c1 = new Shapes(); // what happens if we do this?
        // This will give an error as we are trying to downcast a Shapes object to Circle object

    }
    
}

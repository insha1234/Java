package OOPS.Box;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10);
        Box b3 = new Box(10, 20, 30);
        Box b4 = new Box(b3);
        Boxweight bw1 = new Boxweight();
        System.out.println(b1.l + " " + b1.b + " " + b1.h);
        System.out.println(b2.l + " " + b2.b + " " + b2.h);
        System.out.println(b3.l + " " + b3.b + " " + b3.h);
        System.out.println(b4.l + " " + b4.b + " " + b4.h);
        System.out.println(bw1.l + " " + bw1.b + " " + bw1.h + " " + bw1.w);
    }
    
}

class Box {
    double l, b, h;

    Box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(double side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box x) {
        this.l = x.l;
        this.b = x.b;
        this.h = x.h;
    }
}

class Boxweight extends Box { // Boxweight is a subclass of Box or Boxweight is derived from Box
    double w;

    Boxweight() {
        this.w = -1;
    }

    Boxweight(double l, double b, double h , double w) {
        super(l,b,h); // super is used to call the constructor of the superclass
        this.w = w;

    }

}

class Shape {  // base class or parent class
    public void area () {
        System.out.println("display area");
    }
}

class Triangle extends Shape {
// child class or sub class

public void area (int l, int h) {
    System.out.println(1/2*l*h);
}
}

class EquilateralTriangle extends Triangle {
    public void area (int l, int h) {
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape {
    public void area (int r) {
        System.out.println((3.14)*r*r);
    }
}

public class OOPs7 {
    public static void main(String[] args) {
        
        //inheritance

        // types 
        // 4. Hybrid inheritance
        // Hybrid inheritance is a combination of 
        // simple, multiple inheritance and hierarchical inheritance. 
    }
}
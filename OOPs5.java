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

public class OOPs5 {
    public static void main(String[] args) {
        
        //inheritance

        // types 
        // 2. Multi-level inheritance
        // Multilevel inheritance is a process of deriving a class from another derived class. 
    }
}
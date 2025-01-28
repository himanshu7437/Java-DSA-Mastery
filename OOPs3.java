class Shape {  // base class or parent class
    String color;
}

class Triangle extends Shape {
// child class or sub class
}

public class OOPs3 {
    public static void main(String[] args) {
        
        //inheritance
        // Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes. 
        // In Java, the class which inherits the members of another class is called derived class and the class whose members are inherited is called base class. The derived class is the specialized class for the base class. 

        Triangle t1 = new Triangle();
        t1.color = "red";

    }
}

class Students {
    String name;
    int age;

    public void printInfo(String Studentname) {
        System.out.println(Studentname);
    }

    public void printInfo(int Studentage) {
        System.out.println(Studentage);
    }

    public void printInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

}

public class OOPs2 {
    public static void main(String[] args) {

        // polymorphism
        // Polymorphism is the ability to present the same interface for differing
        // underlying forms (data types). With polymorphism, each of these classes will
        // have different underlying data. Precisely, Poly means ‘many’ and morphism
        // means ‘forms’.

        // Types of Polymorphism IMP
        // 1. Compile Time Polymorphism (Static)
        // 2. Runtime Polymorphism (Dynamic)

        // Compile Time Polymorphism : The polymorphism which is implemented at the
        // compile time is known as compile-time polymorphism. Example - Method
        // Overloading

        // Method Overloading : Method overloading is a technique which allows you to
        // have more than one function with the same function name but with different
        // functionality. Method overloading can be possible on the following basis:
        // 1. The type of the parameters passed to the function.
        // 2. The number of parameters passed to the function.

        // Runtime Polymorphism : Runtime polymorphism is also known as dynamic
        // polymorphism. Function overriding is an example of runtime polymorphism.
        // Function overriding means when the child class contains the method which is
        // already present in the parent class. Hence, the child class overrides the
        // method of the parent class. In case of function overriding, parent and child
        // classes both contain the same function with a different definition. The call
        // to the function is determined at runtime is known as runtime polymorphism.

        Students s1 = new Students();
        s1.name = "himansu";
        s1.age = 18;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }
}

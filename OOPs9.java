abstract class Animal {
    abstract void walk();
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walk on four legs.");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walk on two legs.");
    }
}

public class OOPs9 {

    public static void main(String[] args) {

        // abstraction - its about hiding some sort of information(or class) which is
        // irrelevant to access.
        // *An abstract class must be declared with an abstract keyword.
        // *It can have abstract and non-abstract methods.
        // *It cannot be instantiated.
        // *It can have constructors and static methods also.
        // *It can have final methods which will force the subclass not to change the
        // body of the method.

        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        // Animal animal = new Animal();
        // animal.walk(); ----> Animal is abstract; cannot be instantiated
    }
}

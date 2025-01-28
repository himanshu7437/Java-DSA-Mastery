
interface  Animal {
    int eyes =2; // fixed and public 
    void walk(); // it is already public and abstract whether we use public or not
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {   // Multiple-Inheritance
    public void walk() {
        System.out.println("Walks on four legs.");
    }
}



public class OOPs10 {
    public static void main(String[] args) {
        
        // interfaces
        // All the fields in interfaces are public, static and final by default.
        // All methods are public & abstract by default.
        // A class that implements an interface must implement all the methods declared in the interface.
        // Interfaces support the functionality of multiple inheritance.


        Horse horse = new Horse();
        horse.walk();

    }
}

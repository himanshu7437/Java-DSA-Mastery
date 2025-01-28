
class Student {
    String name;
    int age;

public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
}

Student(Student s2) {
    this.name = s2.name;
    this.age = s2.age;
}

Student() {
// to generate objects
}
    
}


public class OOPs1 {
    public static void main(String[] args) {
        
        // Classes and objects

        Student s1 = new Student();
        s1.name = "himansu";
        s1.age = 18;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}

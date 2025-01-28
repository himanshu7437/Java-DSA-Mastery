
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

        Students s1 = new Students();
        s1.name = "himansu";
        s1.age = 18;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name , s1.age);
    }
}

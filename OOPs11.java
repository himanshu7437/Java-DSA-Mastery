class Studentss {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

public class OOPs11 {
    public static void main(String[] args) {
        // static :
        // Static can be :
        // Variable (also known as a class variable)
        // Method (also known as a class method)
        // Block
        // Nested class

        Studentss.school = "ABC";
        Studentss student1 = new Studentss();
        student1.name = "tony";
        System.out.println(student1.school);


    }
}

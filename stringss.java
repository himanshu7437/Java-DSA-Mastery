
public class stringss {
    public static void main(String[] args) {
        
    // Strings declaration
    // String name = "Tony";
    // String fullName = "Tony Stark";
    // String sentence = "My name is Tony Stark.";

    // // taking string input as
    // Scanner sc = new Scanner(System.in);
    // String yourName = sc.next(); // single word, nextLine() --> for complete line
    // System.out.println("your name is " + yourName);

    // Concatenation
    String firstName = "Himanshu";
    String secondName = "Sharma";
    String fullName = firstName + " " + secondName;
    System.out.println(fullName);

    //length
    System.out.println(fullName.length());

    // printing seperate letters (charAt)
     for (int i = 0; i < fullName.length(); i++) {
        System.out.println(fullName.charAt(i));
     }


    }
}


class Account {
    public String name;
    protected String email;
    private String password;

    // we cannot directly access protected info. for this we have to define setters and getters

    // getter
    public String getPassword() {
        return this.password;
    }

    // setter
    public void setPassword(String pass) {
        this.password = pass;
    }
}


public class bankPackage {
    public static void main(String[] args) {
        // this is file is made as a Package to used in OOps8.
        Account account1 = new Account();
        account1.name = "Hacker Boy";
        account1.email = "hackerboy1234@gmail.com";
        account1.setPassword("helloWorld");
        System.out.println(account1.getPassword());

        //Encapsulation -
        // Encapsulation is the process of combining data and functions into a single unit called class. In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java). 
    }
}

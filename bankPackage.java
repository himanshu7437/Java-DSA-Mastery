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

        //Encapsulation - making Data and functions in a class to data hiding is known as Encapsulation. (Data hiding - using different access modifier)
        
    }
}

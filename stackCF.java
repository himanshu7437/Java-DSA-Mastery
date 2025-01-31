import java.util.*;

public class stackCF {
    
    public static void main(String[] args) {
        
        // java collection framework

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) { 
            System.out.println(s.peek());
            s.pop();
        }
    }
}

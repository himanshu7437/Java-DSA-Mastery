
import java.util.HashSet;
import java.util.Iterator;



public class hashSetInJava {
    
    public static void main(String[] args) {
        
        // Hashset in java
        HashSet <Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        System.out.println("size of the set is "+ set.size());

        //print all the elements
        System.out.println(set);

        //iterator 
        Iterator it = set.iterator();
        
        while (it.hasNext()) { 
            System.out.println(it.next());
        }


        // search - contans
        // if(set.contains(1)){
        //     System.out.println("set contains 1");
        // }
        // if(!set.contains(6)){
        //     System.out.println("set doesn't contains 6 ");
        // }

        // //delete
        // set.remove(1);
        // if(!set.contains(1)){
        //     System.out.println("set doesn't contains 1.");
        // }
    }
}

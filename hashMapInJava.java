
import java.util.*;

public class hashMapInJava {
    
    public static void main(String[] args) {
        
        //hashMap
        HashMap <String , Integer> map = new HashMap<>();

        // insertion
        map.put("china", 1200);
        map.put("india", 100);
        map.put("Us", 10);

        System.out.println(map);

        map.put("china", 150);  // if already exist, update the value.
        System.out.println(map);

        // search
        // if (map.containsKey("china")) {
        //     System.out.println("key is present in the map");
        // } else {
        //     System.out.println("key is not present in the map");

        // }

        // to get the value
        // System.out.println(map.get("china")); // key exist -> value
        // System.out.println(map.get("Nepal")); // key not exist -> null

        // iteration - on array
        // int arr[] = {12, 14 ,23};
        // for (int i = 0; i < 3; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for (int val : arr) {
        //     System.out.print(val+ " ");
        // }
        // System.out.println();

        // using that iteration on hashmap

        for ( Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " "+ map.get(key));
        }

        map.remove("china");
        System.out.println(map);
    }
}

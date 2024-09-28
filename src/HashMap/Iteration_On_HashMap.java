package HashMap;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Iteration_On_HashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // put(key,value)
        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("China", 150);
        hm.put("Dubai", 5);
        hm.put("France", 10);
        hm.put("Germany", 90);

        // keySet() O(1)
        Set<String> keys = hm.keySet();

        for (String k : keys) {
            System.out.println("Keys = " + k + ", value = " + hm.get(k));
        }

        System.out.println();
        System.out.println();
        // entrySet()
        for (Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry);
        }
    }
}

package HashMap;

import java.util.HashMap;

public class HashMap_Operations {

    public static void main(String[] args) {
        // put(key,value) O(1)
        // get(key) O(1)
        // containsKey(key) O(1)
        // removeKey(key) O(1)
        // size() O(1)

        HashMap<String, Integer> hm = new HashMap<>();

        // put(key,value)
        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("China", 150);

        System.out.println(hm);

        // get(key)
        // System.out.println(hm.get("India"));

        // containsKey(key)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Dubai"));

        // removeKey(key)
        // System.out.println(hm.remove("India"));
        // System.out.println(hm);

        // size()
        System.out.println(hm.size());

        //clear() && isEmpty()
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}

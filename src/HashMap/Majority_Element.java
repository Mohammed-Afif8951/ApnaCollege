/*
 * Given an interger array of size n, find all elements that appear more than [n/3] times.
 * 
 * nums[] = {1,3,2,5,1,3,1,5,1}
 * output: 1
 * 
 * nums[] = {1,2}
 * output: 1,2
 */
package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Majority_Element {

    public static void majority_Element(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {

            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        // Set<Integer> key = hm.keySet();
        for (Integer key : hm.keySet()) {
            if (hm.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        // int nums[] = {1,3,2,5,1,3,1,5,1};
        int nums[] = {1,2};
        majority_Element(nums);
    }
}

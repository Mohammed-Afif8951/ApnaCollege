package HashMap;

import java.util.HashSet;

public class Count_Distinct_Element {

    public static int count_Distinct_Elements(int arr[]) {
        HashSet<Integer> hm = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hm.add(arr[i]);
        }

        return hm.size();
    }

    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        // ans = 7;
        System.out.println(count_Distinct_Elements(nums));
    }
}

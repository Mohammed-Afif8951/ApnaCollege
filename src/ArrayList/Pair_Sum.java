/*
 * Find if any pair in a sorted ArrayList has a target sum
 * list = [1,2,3,4,5,6] target = 5
 */
package ArrayList;

import java.util.ArrayList;

public class Pair_Sum {

    public static boolean pair_Sum_BruteForce(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int pair = list.get(i) + list.get(j);
                if (pair == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // ----------------------Two PointerMethod-----------------------------------------------------
    public static boolean pair_Sum_Optimized(ArrayList<Integer> list, int target) {
        int lp = 0; // left pointer
        int rp = list.size() - 1; // right pointer
        while (lp < rp) {
            int pair = list.get(lp) + list.get(rp);
            if (pair == target) {
                return true;
            }

            if (pair < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }



    public static boolean target_SortedAndRotated(ArrayList<Integer> list, int target) {
        // list = [11,15,6,8,9,10];
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int mid = (lp + rp) / 2;
            if (list.get(mid) == target) {
                return true;
            }

            if (list.get(mid) > list.get(lp) && list.get(mid) < list.get(rp) && target < list.get(mid)) {
                rp = mid - 1;
            } else {
                lp = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        // System.out.println(pair_Sum_BruteForce(list, 5));
        // System.out.println(pair_Sum_Optimized(list, 3));
        System.out.println(target_SortedAndRotated(list2, 6));
    }
}

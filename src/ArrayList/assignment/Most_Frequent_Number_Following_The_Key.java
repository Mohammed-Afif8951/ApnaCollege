/*
 * Question 3 :Most Frequent Number following Key(EASY)
 * You are given an integer Arraylist nums. You are also given an integer key, which is present in nums.For every unique integer target in nums, count the number of times target immediately follows an occurrence of key in nums.
 * 
 *  In other words, count the number of indices i such that: 
 * 0 <= i <= nums.size() - 2,
 * nums.get(i) == key and,
 * nums.get(i+1) == target.
 * 
 * Return the target with the maximum count.(Assumption- that the target with maximum count is unique.)
 * 
 * Sample Input 1:nums = [1,100,200,1,100], key = 1
 * Sample Output 1:  100
 * 
 * Explanation :For target = 100, there are 2 occurrences at indices 1 and 4 which follow an occurrence of key.No other integers follow an occurrence of key, so we return 100.
 * 
 * 
 * 
 * Sample Input 2: nums = [2,2,2,2,3], key = 2
 * Sample Output 2:  2
 * 
 * Explanation :For target = 2, there are 3 occurrences at indices 1, 2, and 3 which follow an occurrence of key.For target = 3, there is only one occurrence at index 4 which follows an occurrence of key.
 * 
 * target=2
 * has the maximum number of occurrences following an occurrence of key, so were turn 2.
 * 
 * Constraints:
 * ●2 <= nums.size() <= 1000
 * ●1 <= nums.get(i) <= 1000
 * 
 * ●Assume that the answer is unique.
 * 
 * Hints: Count the number of times each target value follows the key in the arraylist.Choose the target with the maximum count and return it. 
 */
package ArrayList.assignment;

import java.util.ArrayList;

public class Most_Frequent_Number_Following_The_Key {

    public static int most_Frequent_Number(ArrayList<Integer> list, int key) {
        int count[] = new int[1001];
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key) {
                count[list.get(i + 1)]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // * Sample Input 1:nums = [1,100,200,1,100], key = 1
        // * Sample Output 1: 100

        // * Sample Input 2: nums = [2,2,2,2,3], key = 2
        // * Sample Output 2: 2
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        System.out.println(most_Frequent_Number(list, 1));

        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(2);
        // list.add(3);
        // System.out.println(most_Frequent_Number(list, 2));

    }
}

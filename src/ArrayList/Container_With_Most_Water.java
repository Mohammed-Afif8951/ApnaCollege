/*
 * For given lines on x-axis, use 2 lines to form a container such that 
 * it holds maximum water
 * height = [1,8,6,2,5,4,8,3,7]
 */
package ArrayList;

import java.util.*;
import java.util.ArrayList;

public class Container_With_Most_Water {

    public static int container_With_Most_Water_BruteForce(ArrayList<Integer> height) {
        int maxWater = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int width = j - i;
                int len = Math.min(height.get(i), height.get(j));
                int curWater = width * len;
                maxWater = Math.max(maxWater, curWater);
            }
        }
        return maxWater;
    }

    public static int container_With_Most_Water_Optimized(ArrayList<Integer> height) {
        int maxWater = Integer.MIN_VALUE;
        int lp = 0; // Left Pointer
        int rp = height.size() - 1; // Right Pointer
        while (lp < rp) {
            int width = rp - lp;
            int len = Math.min(height.get(rp), height.get(lp));
            int curWater = width * len;
            maxWater = Math.max(maxWater, curWater);

            if (lp < rp) {
                lp++;
            } else {
                rp++;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        // height = [1,8,6,2,5,4,8,3,7]
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(container_With_Most_Water_BruteForce(height));
        System.out.println(container_With_Most_Water_Optimized(height));
    }
}

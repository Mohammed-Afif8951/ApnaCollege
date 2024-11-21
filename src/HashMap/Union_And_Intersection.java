package HashMap;

import java.util.HashSet;

public class Union_And_Intersection {

    public static void union_And_Intersection(int arr1[], int arr2[]) {
        HashSet<Integer> hs = new HashSet<>();

        // union
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }
        System.out.println("Union : " + hs.size());

        
        // Intersection
        hs.clear();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                count++;
                hs.remove(arr2[i]);
            }
        }
        System.out.println("Intersection : " + count);
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        // union = 6 //{7,3,9,6,2,4}
        // Intersection = 2 //{3,9}
        union_And_Intersection(arr1, arr2);

    }
}

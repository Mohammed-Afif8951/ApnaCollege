/*
    Question 2 :Given an array nums of size n, return the majority element. (MEDIUM)
    The majority element is the element that appears more than ⌊n/2⌋ times.
    You may assume that the majority element always exists in the array. 
    Sample Input 1: nums = [3,2,3]
    Sample Output 1: 3

    Sample Input 2: nums = [2,2,1,1,1,2,2] 
    Sample Output 2: 2
    
    Constraints(extra Conditions):
    ● n == nums.length 
    ● 1 <= n <= 5 * 104
    ●-109 <= nums[i] <= 109
 */
package Divide_And_Conquer.assignment;

public class Find_Majority_Element {

    /* ------------------------------This method is wrong------------------------------------ */

    //create a frequency array of size 110
    static int max = -1;
    static int freq[] = new int[110];
    public static void find_Majority_Element(int arr[], int si, int ei){

        //create a frequency array of size 110
        // iterate through the array and increase the count of frequency 
        if(si > ei){
            System.out.println(max);
            return;
        }
        int curElem = arr[si];
        freq[curElem]++;
        if(freq[arr[si]] > max){
            max = curElem;
        }
        find_Majority_Element(arr, si+1, ei);
        // when all the elements are iterated 
        //find the max frequency in frequency array and return i

    }



/*------------------------------------This method os right------------------------------------------------- */

// Recursive function to count occurrences of a specific element in a given range
    public static int countOccurrences(int[] arr, int element, int si, int ei) {
        if (si > ei) {
            return 0;
        }
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == element) {
                count++;
            }
        }
        return count;
    }

    // Recursive function to find the majority element in a given range
    public static int findMajorityElement(int[] arr, int si, int ei) {
        // Base case: If there is only one element, return it
        if (si == ei) {
            return arr[si];
        }

        // Split the array into two halves
        int mid = si + (ei - si) / 2;
        int leftMajority = findMajorityElement(arr, si, mid);
        int rightMajority = findMajorityElement(arr, mid + 1, ei);

        // If both halves agree on the majority element, return it
        if (leftMajority == rightMajority) {
            return leftMajority;
        }

        // Otherwise, count occurrences of each element and return the one with higher count
        int leftCount = countOccurrences(arr, leftMajority, si, ei);
        int rightCount = countOccurrences(arr, rightMajority, si, ei);

        return (leftCount > rightCount) ? leftMajority : rightMajority;
    }

    public static void main(String[] args) {
        // Test case 1
        int arr1[] = {3, 2, 3};  
        System.out.println(findMajorityElement(arr1, 0, arr1.length - 1)); // Output: 3

        // Test case 2
        int arr2[] = {2, 2, 1, 1, 1, 2, 2}; 
        System.out.println(findMajorityElement(arr2, 0, arr2.length - 1)); // Output: 2
        // Test case 3
        int arr3[] = {2, 2, 3, 3}; 
        System.out.println(findMajorityElement(arr3, 0, arr3.length - 1)); // Output: 3
    }
}

  


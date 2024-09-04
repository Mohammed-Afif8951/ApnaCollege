/* Question1: For a given integer array of size N. You have to find all the occurrences(indices)
    of a given element(Key) and print them. Use a recursive function to solve this problem.
    Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2 
    Sample Output: 1 5 7 8 
*/
package Recursion.assignment;

public class Indices_Of_Occurence {

    public static void indices_Of_Occurence(int arr[], int i, int key){
        if(i == arr.length){
            return;
        }
        //Kaam
        if(key == arr[i]){
            System.out.print(i+" ");
        }
        indices_Of_Occurence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        indices_Of_Occurence(arr, 0, 2);
    }
}

package Basic_Sorting;
import java.util.Arrays;
import java.util.Collections;
public class Insertion_sort{

    public static void insertion_sort(int arr[]){
        //pick an element form the unsorted array and place in the right position in the sorted

        for(int i=1; i<arr.length; i++){
            int cur = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > cur){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insert into right position 
            arr[prev+1] = cur;
        }
    }


    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        // insertion_sort(arr);
        // for(int a : arr){
        //     System.out.print(a+" ");

        
        // Arrays.sort(arr);
        // Arrays.sort(arr,0,3);
        Integer arr1[] = {5,4,1,3,2};
        // Arrays.sort(arr1,0,3,Collections.reverseOrder());
        Arrays.sort(arr1,Collections.reverseOrder());
        for(int a : arr1){
            System.out.print(a+" ");
        }
    }
}



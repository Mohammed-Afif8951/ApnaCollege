/* Largest and Smallest Element in the Array  */
package Arrays;

public class LargestAndSmallest {

    public static int getLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getSmallest(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,10,56,2,8,9,78};
        int max = getLargest(arr);
        System.out.println("The largest number in the array is "+max);

        int min = getSmallest(arr);
        System.out.println("The Smallest number in the array is "+min);
    }
}

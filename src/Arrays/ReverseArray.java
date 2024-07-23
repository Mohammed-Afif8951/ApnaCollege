package Arrays;

public class ReverseArray {

    public static void reverseArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        reverseArray(arr);
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}

//Time complexcity = O(n)
//Space Complexcity = O(1)
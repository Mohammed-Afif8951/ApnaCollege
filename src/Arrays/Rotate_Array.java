package Arrays;

public class Rotate_Array {

    public static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] LeftrotateArray(int[] arr, int k) {
        // Write your code here.
        int n = arr.length;
        // algorithm

        // 1. reverse the whole array
        reverseArray(arr, 0, n - 1);

        // 2. reverse the first k element
        reverseArray(arr, 0, k - 1);

        // 3. reverse the k+1 elements
        reverseArray(arr, k, n - 1);

        return arr;
    }

    public static int[] right_RotateArray(int arr[], int k) {
        int n = arr.length;

        // 1. first reverse first k elements
        reverseArray(arr, 0, k - 1);

        // 2. reverse k+1 to n-1 elements
        reverseArray(arr, k, n - 1);

        // 3. reverse whole array
        reverseArray(arr, 0, n - 1);

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // int Larr[] = LeftrotateArray(arr, 2);
        int Rarr[] = right_RotateArray(arr, 2);

        for (int a : Rarr) {
            System.out.print(a + " ");
        }

    }
}

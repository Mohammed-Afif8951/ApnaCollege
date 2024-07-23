package Array2D;
import java.util.Scanner;
public class largestAndSmallest {
    public static void LargestAndSmallest(int arr[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                largest = Math.max(largest,arr[i][j]);
                smallest = Math.min(smallest, arr[i][j]);
            }
        }
        System.out.println("The largest :"+largest);
        System.out.println("The Smallest :"+smallest);

    }
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        System.out.println("Enter the value for the array(9):");
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        LargestAndSmallest(arr);
    }
}

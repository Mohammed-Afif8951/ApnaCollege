// Kadanes Algorith :-  if the sum value becomes < 0 then turn the sum value to 0

package Arrays;

public class MaxSubArraySum_Kadanes_Algorittm {
    public static void maxSubArraySum_Kadanes_Algoritm(int arr[]){
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        if(arr.length == 0){
            System.out.println("The Array is Empty");
        }
        else
        {
            for(int i=0; i<arr.length; i++){
                curSum = curSum  + arr[i];
                if(curSum < 0){
                    curSum = 0;
                }
                max = Math.max(curSum, max);
            }
            if(max == 0){
                max = Integer.MIN_VALUE;
                for(int j=0; j<arr.length; j++){
                    max = Math.max(max, arr[j]);
                }
            }
            System.out.println("Maximum Sum of SubArray is :"+ max);
        
        }
    }
    public static void main(String[] args) {
        //int arr[] = {-10,-2,-5};
        //int arr[] = {};
        //int arr[] = {1,3,6};
        //int arr[] = {1,-2,6,-1,3};
        //int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        int arr[] = {-1,-2,-3,0};
        maxSubArraySum_Kadanes_Algoritm(arr);
    }
}

//Time Complexity - O(n)
//Space Complexity - O(1)
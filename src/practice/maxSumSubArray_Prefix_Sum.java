package practice;

public class maxSumSubArray_Prefix_Sum {
    public static void MaxSumSubArray_Prefix_Sum(int arr[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        // calculate prefix sum
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){//Start from this location 
            int start = i;
            for(int j=i; j<arr.length; j++){//end in this location like from arr[1] to arr[3] = -2+6+(-1) =3 for 1 iteration 
                int end = j; 
                curSum = start  == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < curSum){
                    maxSum = curSum;
                }
            }
        }
        System.out.println("The Maximum Sum of SubArray : "+maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        MaxSumSubArray_Prefix_Sum(arr);
    }

}

package Arrays;

public class MaxSumOfSubArray_PrefixSum {
    public static void maxSumOfSubArray_PrefixSum(int arr[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        //Calculate Prefix Sum
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                
                if(start == 0){
                    curSum = prefix[end];
                }else{
                    curSum = prefix[end] - prefix[start - 1];
                }

               // curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            
               if(maxSum < curSum){
                maxSum = curSum;
               } 
                
            }
            
        }
        System.out.println("Maximum Sum of SubArrays : "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSumOfSubArray_PrefixSum(arr);
    }

}

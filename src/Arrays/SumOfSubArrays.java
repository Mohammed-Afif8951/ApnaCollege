//Find the sum of subArrays and find Min and Max of it
package Arrays;
import java.util.Arrays;

public class SumOfSubArrays {
    public static void sumOfSubArrays(int arr[]){
        int count = 0;
        int n = arr.length;
        int ts = (n*(n+1))/2;
        int sum[] = new int[ts];
        Arrays.fill(sum,0);
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        //Find subArrays
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    sum[count] = arr[k] + sum[count];
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
       

        //Sum of subArrays
        for(int l=0; l<ts; l++){
            if(sum[l]>Max){
                Max = sum[l];
            }
            if(sum[l]<Min){
                Min = sum[l];
            }
       
        }

        for(int z=0; z<sum.length; z++){
            System.out.println("The Sum of SubArray["+z+"] : "+sum[z]);
        }
        System.out.println();
        System.out.println("The Maximum Sum of SubArray : "+Max);
        System.out.println("The Minimum Sum of SubArray : "+Min);
    }
    
        
    

    public static void main(String[] args) {
        int arr[] = {1,3,6};
        sumOfSubArrays(arr);
    }
}

package Arrays;

public class SubArray {
    public static void subArray(int arr[]){
        int ts = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays : "+ts);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        subArray(arr);
    }

}

//formula for Total subArrays (sum of n) = (n*(n+1))/2
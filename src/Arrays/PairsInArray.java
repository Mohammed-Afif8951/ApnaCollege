package Arrays;

public class PairsInArray {
    public static void pairsInArray(int arr[]){
        int tp =0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+tp);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        pairsInArray(arr);
        int n =arr.length;
        System.out.println("Total Pairs: "+(n*(n-1)/2));

    }

}
// Formula for Total Number of Pairs = (n*(n-1)/2
//Time Complexity = O(n^2))
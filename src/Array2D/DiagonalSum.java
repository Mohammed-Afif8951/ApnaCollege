package Array2D;

public class DiagonalSum {
    public static int diagonalSum(int arr[][]){
        int n = arr.length-1;
        int primarySum = 0;
        int secondarySum = 0;

        //calculate primary sum
        for(int i=0; i<=n; i++){
            primarySum += arr[i][i];
        }

        //calculate secondary sum
        int j=0;
       for(int i=n; i>=0; i--){
        secondarySum += arr[i][j];
        j++;
       }
        
        System.out.println("Primary Sum:"+primarySum); 
        System.out.println("Secondary Sum:"+secondarySum); 

        return primarySum+secondarySum;
    }

    public static void diagonalSum1(int arr[][]){
        int primarySum = 0;
        int secondarySum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
               if(i == j){
                   primarySum += arr[i][i];
               }
               else if(i+j == arr.length-1){
                    secondarySum += arr[i][j];
               }
            }
        }
        System.out.println("Primary Sum:"+primarySum); 
        System.out.println("Secondary Sum:"+secondarySum);
        System.out.println(primarySum+secondarySum);
    }

    public static void diagonalSumOptimized(int arr[][]){
        int primarySum = 0;
        int secondarySum = 0;
        for(int i=0; i<arr.length; i++){
            //primary sum
            primarySum += arr[i][i];
            //secondary sum
            if(i != arr.length-1-i){
                secondarySum += arr[i][arr.length-1-i];
            }
        }

        System.out.println("Primary Sum:"+primarySum); 
        System.out.println("Secondary Sum:"+secondarySum);
        System.out.println(primarySum+secondarySum);
    }

    public static void main(String[] args) {
        // int arr[][] = { {1 , 2,  3,  4},
        //                 {5,  6,  7,  8},
        //                 {9, 10, 11, 12},
        //                 {13,14, 15, 16}};


        // int arr[][] = { {1 , 2,  3},
        //                 {5,  6,  7},
        //                 {9, 10, 11},};

        int arr[][] = { {1 , 2},
                        {5,  6}};
    //    int sum =  diagonalSum1(arr);
    diagonalSumOptimized(arr);
    }
}

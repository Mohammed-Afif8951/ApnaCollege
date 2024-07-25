package Array2D;
public class SpiralMatrix {

    public static void spiralMatrix(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        int startrow = 0;
        int endrow = r-1;
        int startcol = 0;
        int endcol = c-1;

      while(startrow<=endrow && startcol<=endcol){
          //print first row
          for(int i=startcol; i<=endcol; i++){
            System.out.print(arr[startrow][i]+" ");
        }
        startrow++;
        //print last column
        for(int i=startrow; i<=endrow; i++){
            System.out.print(arr[i][endcol]+" ");
        }
        endcol--;
        //print last row
        if(startrow<=endrow){
            for(int i=endcol; i>=startcol; i--){
                System.out.print(arr[endrow][i]+" ");                
            }
        }
        endrow--;
        //print first column
        if(startcol<=endcol){

            for(int i=endrow; i>=startrow; i--){
                System.out.print(arr[i][startcol]+" ");
            }
        }
        startcol++;
      }
    }




    public static void spiralMatrix1(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        int startrow = 0;
        int endrow = r-1;
        int startcol = 0;
        int endcol = c-1;

        while(startrow <= endrow && startcol <= endcol){
            // print first row
            for(int i = startcol; i <= endcol; i++){
                System.out.print(arr[startrow][i] + " ");
            }
            // print last column
            for(int i = startrow + 1; i <= endrow; i++){
                System.out.print(arr[i][endcol] + " ");
            }
            // print last row
            if(startrow < endrow) {
                for(int i = endcol - 1; i >= startcol; i--){
                    System.out.print(arr[endrow][i] + " ");
                }
            }
            // print first column
            if(startcol < endcol) {
                for(int i = endrow - 1; i > startrow; i--){
                    System.out.print(arr[i][startcol] + " ");
                }
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static void main(String[] args) {
        int arr[][] = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};


        // int arr[][] = { {1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12}};


        // int arr[][] = { {1,2,3},
        //                 {5,6,7},
        //                 {9,10,11}};


        // int arr[][] = { {1,2,3},
        //                 {5,6,7},
        //                 {9,10,11},
        //                 {12,13,14}};
        spiralMatrix1(arr);
    }
}

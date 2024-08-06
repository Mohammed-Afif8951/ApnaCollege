/*Question 1 :Print the number of 7’s that are inthe 2d array.
Example :Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2 */
package Array2D.assignment;

import Array2D.largestAndSmallest;

public class Find_No_Of_Element_In_2D_Array {

//     public static int find_No_Of_Element_In_2D_Array(int arr[][],int key){
//         int count =0;
//         for(int i=0; i<arr.length; i++)
//             for(int j=0; j<arr[0].length; j++){
//                 if(arr[i][j] == key){
//                     count++;
//                 }
//             }
//             return count;
//     }


/* Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18 */

    // public static int findSum(int arr[][],int row){
    //     int sum = 0;
    //     for(int i=0; i<arr[row].length; i++){
    //         sum += arr[row][i];
    //     }
    //     return sum;
    // }



/*Question 3 :Write a program to FindTransposeofa Matrix.
What is Transpose?Transpose of a matrix is the process of swapping the 
rows to columns. For a 2x3 matrix,
Matrix
a11    a12    a13   |1  2   3
a21    a22    a23   |4  5   6  

Transposed Matrix
a11    a21      |   1   4
a12    a22      |   2   5
a13    a23      |   3   6

*/


    public static int[][] transpose_Of_Matrix(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int num[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                num[j][i] = arr[i][j];
            }
        }
        return num;
    }
    public static void main(String[] args) {
        // int arr[][] = {{4,7,8},{8,8,7}};
        // int key = 1;
        // System.out.println(key+" Appears "+find_No_Of_Element_In_2D_Array(arr, key)+" times");

        // Question Number 2
        // int arr[][] =  {{1,4,9},{11,4,3},{2,2,3}};
        // int row = 1;
        // System.out.println("The sum of all the elements in "+(row+1)+" row is "+findSum(arr, row));


        //Question Number 3
        int arr[][] = {{1,2,3},{4,5,6}};
        int transpose_Of_arr[][] = transpose_Of_Matrix(arr);
        for(int i=0; i<transpose_Of_arr.length; i++){
            for(int j=0; j<transpose_Of_arr[0].length; j++){
               System.out.print(transpose_Of_arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

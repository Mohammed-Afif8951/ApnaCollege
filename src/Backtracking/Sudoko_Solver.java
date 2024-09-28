package Backtracking;

public class Sudoko_Solver {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //vertical check
        for(int i=0; i<9; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        //horizontal check
        for(int i=0; i<9; i++){
            if(sudoku[row][i] == digit){
                return false;
            }
        }

        //check in 3x3 box (grid)
        int startRow = (row/3)*3;
        int startCol = (col/3)*3;
        for(int i=startRow; i<startRow+3; i++){
            for(int j=startCol; j<startCol+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudoko_Solver(int sudoku[][], int row, int col){

        //base case
        if(row == 9 && col == 0){
            return true;
        }

        //initialize nextRow and nextCol
        int nextRow = row, nextCol = col + 1;
        if(col + 1 == 9){
            nextRow = row+1;
            nextCol = 0;  
        }

        //if element already exists in that position don't change
        if(sudoku[row][col] != 0){
            return sudoko_Solver(sudoku, nextRow, nextCol);
        }
        for(int digit = 1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudoko_Solver(sudoku, nextRow, nextCol)){ 
                    // Solution exists
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSudoko(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        

        int sudoku[][] = {
        {0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};

        if(sudoko_Solver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoko(sudoku);
        }
        else{
            System.out.println("Sudoku does not exist");
        }
    }
}

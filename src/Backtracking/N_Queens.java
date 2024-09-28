package Backtracking;

public class N_Queens {

    public static boolean isSafe(char board[][], int row, int col){
        //check vertical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //check diagonal left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //check diagonal right 
        for(int i=row-1, j=col+1; i>=0 && j<=board.length-1; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void nQueens_Rough(char board[][], int row){
        //Base Case
        if(row == board.length){
            System.out.println("-----ChessBoard----");
            printBoard(board);
            return;
        }

        // Column Loop
        for(int j=0; j<board.length; j++){
           
                board[row][j] = 'Q';
                nQueens_Rough(board, row+1);
                board[row][j] = 'X';
            
        }
    }

    public static void nQueens(char board[][], int row){
        //Base Case
        if(row == board.length){
            System.out.println("-----ChessBoard----");
            printBoard(board);
            return;
        }

        // Column Loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens(board, row+1);
                board[row][j] = 'X';
            }
        }
    }

   
    public static void nQueens_CountAllSolutions(char board[][], int row){
        //Base Case
        if(row == board.length){
            //System.out.println("-----ChessBoard----");
            //printBoard(board);
            count++;
            return;
        }

        // Column Loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueens_CountAllSolutions(board, row+1);
                board[row][j] = 'X';
            }
        }  
    }
   
    public static boolean nQueens_Print_1_Solution(char board[][], int row){
        //Base Case
        if(row == board.length){
            //System.out.println("-----ChessBoard----");
            //printBoard(board);
            count++;
            return true;
        }

        // Column Loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(nQueens_Print_1_Solution(board, row+1)){
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;  
    }
    public static void printBoard(char board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char chessBoard[][] = new char[n][n];
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard.length; j++){
                chessBoard[i][j] = 'X';
            }
        }
        //nQueens_Rough(chessBoard, 0);
        //nQueens(chessBoard, 0);

        //nQueens_CountAllSolutions(chessBoard, 0);
        if(nQueens_Print_1_Solution(chessBoard, 0)){
            printBoard(chessBoard);
        }
        
        System.out.println("The Total No.of Solution for N-Queens is "+count);
       
    }
}

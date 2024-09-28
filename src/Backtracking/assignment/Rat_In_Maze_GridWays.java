/*
 * Question 1 :Rat in a Maze 
 * You are given a starting position for a rat which is stuck in a maze at an initial point(0,0)
 * (the maze can be thought of as a 2-dimensional plane).
 * The maze would be given in the form of a square matrix of order N*N where the cells with value 0
 * represent the maze’s blocked locations while value 1 is the open/available path that the rat can 
 * take to reach its destination.The rat's destination is at (N - 1, N - 1).
 * Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze.The possible 
 * directions that it can take to move in the maze are'U'(up) i.e.(x,y-1),'D'(down)i.e. (x, y + 1) , 
 * 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).(This problem is similar to Grid ways.)
 * 
 * 
 * 
 * Sample Input: int maze[][] = { 
 *      { 1, 0, 0, 0 },
 *      { 1, 1, 0, 1 }, 
 *      { 0, 1, 0, 0 },
 *      { 1, 1, 1, 1 } 
 * };
 * 
 * 
 * 
 * Sample Output: 1  0  0  0
 *                1  1  0  0
 *                0  1  0  0
 *                0  1  1  1
 */



 /*
  * Algorithm 
  1.Create a solution matrix, initially filled with 0’s.
  2.Create a recursive function, which takes the initial matrix, output matrix and position of rat (i, j).
  3.if the position is out of the matrix or the position is not valid then return.
  4.Mark the position output[i][j] as 1 and check if the current position is destination or not.
    If destination is reached print the output matrix and return.
  5.Recursively call for position (i+1, j) and (i, j+1).
  6.Unmark position (i, j), i.e output[i][j] = 0.
  */
package Backtracking.assignment;

public class Rat_In_Maze_GridWays {

    public static boolean isSafe(int maze[][], int x, int y){
        //if (x, y outside maze) return false
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length 
        && maze[x][y] == 1);
    }

    //-------------This prints only one solution for the give grid-----------------
    public static boolean solveMaze(int maze[][]){
        int N = maze.length;
        int sol[][] = new int[N][N];
        if(solveMazeUtil(maze,0,0,sol) == false){
            System.out.println("Solution doesn't exists");
            return false;
        }
        printSolution(sol);
        return true;
    }

    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]){
        if(x == maze.length-1 && y == maze.length - 1 && maze[x][y] == 1){
            sol[x][y] = 1;
            return true;
        }

        //check if maze[x][y] is valid
        if(isSafe(maze,x,y) == true){
            if(sol[x][y] == 1){
                return false;
            }
            sol[x][y] = 1;
            if(solveMazeUtil(maze, x+1, y, sol)){
                return true;
            }
            if(solveMazeUtil(maze, x, y+1, sol)){
                return true;
            }
            sol[x][y] = 0;
            return false;
        }
        return false;

    }
    //----------------------------------------------

    public static boolean IsSafe(int maze[][], int x, int y, int sol[][]){
        //if (x, y outside maze) return false
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length 
        && maze[x][y] == 1 && sol[x][y] == 0);
    
}
    public static void printSolution(int sol[][]){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }



    //------------For printing all availble solution for the given grid-------------------------------
    public static void solve_Maze(int maze[][]){
        int n = maze.length;
        int sol[][] = new int[n][n];
        
        solve_Maze_Util(maze, 0, 0, sol, n);
    }

    public static void solve_Maze_Util(int maze[][], int x, int y, int sol[][], int n){
        // base case
        if(x == n-1 && y == n-1 && maze[x][y] == 1){
            sol[x][y] = 1;
            printSolution(sol);
            sol[x][y] = 0;
            return;
        }

        //check if the maze[x][y] is a valid move or not
        if(IsSafe(maze, x, y,sol)){
            // mark the current cell as a part of solution
            sol[x][y] = 1;

            //move in directions (down, right, up, leftd)
            
            //move down
            if(y+1 < n){
                solve_Maze_Util(maze, x, y+1, sol, n);
            }
            //move right 
            if(x+1 < n){
                solve_Maze_Util(maze, x+1, y, sol, n);
            }
            //move up
            if(y-1 >= 0){
                solve_Maze_Util(maze, x, y-1, sol, n);
            }
            //move left 
            if(x-1 >= 0){
                solve_Maze_Util(maze, x-1, y, sol, n);
            }

            //backtracking step
            // Unmark this step as a part of solution 
            sol[x][y] = 0;

        }
    }
    public static void main(String[] args) {
        
        int maze[][] ={
            {1,0,0,0},
            {1,1,0,1},
            {0,1,1,0},
            {1,1,1,1},
        };
        int n = maze.length-1;
        solve_Maze(maze);
        //solveMaze(maze);


    }
}

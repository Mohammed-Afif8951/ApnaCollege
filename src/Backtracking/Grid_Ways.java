package Backtracking;

public class Grid_Ways {

    public static int grid_Ways(int i, int j, int n, int m){

        if(i == n-1 && j == m-1){
            return 1;
        }
        else if(i == n || j == m){
            return 0;
        }
        int w1 = grid_Ways(i+1, j, n, m);
        int w2 = grid_Ways(i, j+1, n, m);

        return w1 + w2;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(grid_Ways(0, 0, n, m));
    }
}

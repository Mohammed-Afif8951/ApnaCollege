package Recursion;

public class Tiling_Promblem {

    public static int tiling_Problem(int n){

        // Base Case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertically placed
        int fnm1 = tiling_Problem(n-1);

        //horizontally placed
        int fnm2 = tiling_Problem(n-2);

        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tiling_Problem(n));
    }
}

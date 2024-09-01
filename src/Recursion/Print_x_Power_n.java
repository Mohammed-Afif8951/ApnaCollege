package Recursion;

public class Print_x_Power_n {

    public static double xPow_n(int x, int n){
        if(n == 0){
            return 1;
        }
        double xnm1 = xPow_n(x, n-1);
        double xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(xPow_n(x, n));

    }
}

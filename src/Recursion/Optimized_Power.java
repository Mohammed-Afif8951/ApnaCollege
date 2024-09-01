package Recursion;

public class Optimized_Power {

    public static int optimized_Power(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimized_Power(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        // n is odd
        if((n%2) != 0){
            return x * halfPowerSq;
        }
        
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2, n = 10;
        System.out.println(optimized_Power(x, n));
    }
}

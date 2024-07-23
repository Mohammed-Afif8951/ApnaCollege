package Functions_And_Method;

import java.util.Scanner;

public class Prime {
    // Factorial
    

    //check prime(optimized)
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    //Prime in a Range
    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
                System.out.println();
            }
        }
        
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        // System.out.println("isPrime "+ isPrime(n));
        primeInRange(n);
    }
}

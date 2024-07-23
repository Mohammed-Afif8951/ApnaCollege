package Functions_And_Method;

import java.util.Scanner;

public class BinomialCoefficient {
    // Factorial
    public static int  factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f*=i;
        }
        // System.out.println(f);
        return f;
    }

    // Bionomial Coefficients
    //nCr = n!/r!(n-r)! 
    public static void bionomial_Coefficients(int n, int r){
        System.out.println((factorial(n)/(factorial(r)*(factorial(n-r)))));
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        // int n = in.nextInt();
        // factorial(n);
        // System.out.println("Enter the value of n and r");
        // int n = in.nextInt();
        // int r = in.nextInt();
        // bionomial_Coefficients(n, r);
        
       
    }
}

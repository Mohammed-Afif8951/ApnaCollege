package Functions_And_Method;

import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalToBinary(int n){
        int Num = n;
        int pow = 0;
        int bin = 0;
        while(n>0){
            int rem = n % 2;
            bin = bin + (int)(rem * Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the value of n: ");
            int n = in.nextInt();
            decimalToBinary(n); 
    }
}

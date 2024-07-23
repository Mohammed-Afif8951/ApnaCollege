package Functions_And_Method;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void binaryToDecimal(int bin){
        int Num = bin;
        int pow = 0;
        int dec = 0;

        while(bin>0){
            int lastDigit = bin % 10;
            dec = dec +(int) (lastDigit * Math.pow(2, pow));
            pow++;
            bin = bin/10;
        }
        System.out.println("The decimal equivalent of "+Num+" is "+dec);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        binaryToDecimal(n);
    }

}

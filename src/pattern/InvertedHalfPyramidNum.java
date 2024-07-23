package pattern;

import java.util.Scanner;

public class InvertedHalfPyramidNum {
    public static void invertedHalfPyramidNum(int n) {
        int tnol = n;
        int cnol = 1;
        int num = n;
        while (cnol <= tnol) {
            // num
            for (int i = 1; i <= num; i++) {
                System.out.print(i);
            }
            // prepare for next line
            System.out.println();
            cnol++;
            num--;
        }
    }

    public static void invertedHalfPyramidNum1(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        invertedHalfPyramidNum1(n);
    }
}

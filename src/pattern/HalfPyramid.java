package pattern;

import java.util.Scanner;

public class HalfPyramid {
    public static void halfPyramid(int n){
        int tnol = n;
        int cnol = 1;
        int num = 1;
        while(cnol<=tnol){
            for(int i=1; i<=num; i++){
                
                System.out.print(i);

        }
            //prepare for next line
            cnol++;
            System.out.println();
            num++;

        }
    }
    public static void half_Pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = in.nextInt();
    half_Pyramid(n);
    }

}

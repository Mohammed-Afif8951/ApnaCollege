package pattern;

import java.util.Scanner;

public class NumberPyramid {
    public static void numberPyramid(int n){
        int tnol = n;
        int cnol = 1;
        int st = 1;
        int sp = n-1;
        while(cnol <= tnol){
            //spaces 
            for(int i=1; i<=sp; i++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=st; j++){
                System.out.print(st+" ");
            }
            //prepare for next line
            System.out.println();
            cnol++;
            st++;
            sp--;
        }
    }

public static void numberPyramid1(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=2*n; j++){
            
        }
    }
}
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        numberPyramid(n);
}
}

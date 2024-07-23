package pattern;

import java.util.Scanner;

public class InvertedRotatedHalfPyramid {
   public static void invertedRotatedHalfPyramid(int n){
    int tnol = n;
    int cnol = 1;
    int st = 1;
    int sp = n-1;
    while(cnol<=tnol){
        //spaces
        for(int i=1; i<=sp; i++){
            System.out.print(" ");
        }
        //Stars
        for(int j=1; j<=st; j++){
            System.out.print("*");
        }
        //prepare for next line
        System.out.println();
        cnol++;
        sp--;
        st++;

    }
   }

   public static void invertedRotatedHalfPyramid1(int n){
    for(int i=1; i<=n; i++){
       // spaces
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        //stars
        for(int k=1; k<=i; k++){
            System.out.print("*");
        }

        //   for(int j=1; j<=n; j++){
        //     if(j<=n-i){
        //         System.out.print(" ");
        //     }
        //     else{
        //         System.out.print("*");
        //     }
        // }

        System.out.println();
    }
   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        invertedRotatedHalfPyramid1(n);
    }
}


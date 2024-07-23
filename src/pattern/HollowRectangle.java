package pattern;

import java.util.Scanner;

public class HollowRectangle {
    // public static void hollowRectangle(int n){
    //     int tnol = n;
    //     int cnol = 1;
    //     int st1 = n+1;
    //     int sp = n-1;
    //     while(cnol <= tnol){
    //         if(cnol == tnol || cnol == 1){
    //             for(int i=1; i<=st1; i++){
    //                 System.out.print("* ");
    //             }
    //         }
    //         else{
    //             for(int k=1; k<=1; k++){
    //                 System.out.print("* ");
    //             }

    //             for(int j=1; j<=sp; j++){
    //                 System.out.print("  ");
    //             }
    //             for(int k=1; k<=1; k++){
    //                 System.out.print("* ");
    //             }
    //         }
    //         System.out.println();
    //         cnol++;


    //     }
    // }

    public static void hollow_Rectangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1; j++){
                if(i == 1 || i == n || j == 1 || j ==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        hollow_Rectangle(n);
    }
}

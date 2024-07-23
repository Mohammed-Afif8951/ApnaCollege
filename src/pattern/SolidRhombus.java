package pattern;

import java.util.Scanner;

public class SolidRhombus {
    public static void solidRhombus(int n){
        int tnol = n;
        int cnol = 1;
        int sp = n-1;
        while(cnol<=tnol){
            //spaces
            for(int i=1; i<=sp; i++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            //prepare for next line 
            System.out.println();
            cnol++;
            sp--;

        }
    }
    public static void solidRhombus1(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n+(i-1); j++){
                if(j<=i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        solidRhombus1(n);
}
}

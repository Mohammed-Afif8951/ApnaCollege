package pattern;

import java.util.Scanner;


public class ButterflyPattern {
    public static void butterflyPattern(int n){
        int tnol = 2*n;
        int cnol = 1;
        int st = 1;
        int sp = (2*n)-2;
        while(cnol<=tnol){
            //stars
            for(int i=1; i<=st; i++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            //stars
            for(int k=1; k<=st; k++){
                System.out.print("* ");
            }
            //prepare for next line

            System.out.println();
            cnol++;
            if(cnol <= tnol/2){
                st++;
                sp=sp-2;
            } else if(cnol == (tnol/2)+1){
                
            }
            else{
                st--;
                sp= sp+2;
            }

        }
    }

    public static void butterflyPattern1(int n){
        for(int i=1; i<=2*n; i++){
            for(int j=1; j<=2*n; j++){
               
                    if(j<=i || j>(2*n)-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                
                   // if(i==n || )

            }
            //System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        butterflyPattern1(n);
    }
}

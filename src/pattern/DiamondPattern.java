package pattern;

import java.util.Scanner;

public class DiamondPattern {
    public static void diamondPattern(int n){
        int tnol = 2*n;
        int cnol = 1;
        int st = 1;
        int sp = n-1;
        while(cnol<=tnol){
            //space
            for(int i=1; i<=sp; i++){
                System.out.print("  ");
            }
            //star
            for(int j=1; j<=st; j++){
                System.out.print("* ");
            }
            //prepare for next line
            cnol++;
            System.out.println();
            if(cnol<=n){
                st+=2;
                sp--;
            }else if(cnol == n+1){

            }
            else{
                st-=2;
                sp++;
            }
        }
    }
    public static void diamondPattern1(int n){
        for(int i=1; i<=2*n; i++){
            //spaces
            for(int j=n; j>=1; j--){
                System.out.print(" ");
            }
            //stars
            for(int k=1; k<=2*n; k++){
               // dsfg
            }
        }
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        diamondPattern1(n);
}
}

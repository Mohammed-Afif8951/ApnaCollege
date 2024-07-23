package pattern;

import java.util.Scanner;

public class HollowRhombus {
    public static void hollowRhombus(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n+(i-1); j++){
                 if(j==i || j == n+(i-1) || i==1 || (i==n && j>n)){ // from  i==1 || (i==n && j>n) its for first and last line
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        hollowRhombus(n);
    }
}

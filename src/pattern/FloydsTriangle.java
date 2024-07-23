package pattern;

import java.util.Scanner;

public class FloydsTriangle {

    public static void floydsTriangle(int n){
        int tnol = n;
        int cnol = 1;
        int num = 1;
        int st = 1;
        while(cnol<=tnol){
            for(int i=1; i<=st; i++){
                System.out.print(num++ +" ");
            }
            //prepare for next line
            System.out.println();
            cnol++;
            st++;
        }
    }

    public static void floydsTriangle1(int n){
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        floydsTriangle1(n);
    }
}

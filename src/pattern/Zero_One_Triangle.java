package pattern;

import java.util.Scanner;

public class Zero_One_Triangle {
    public static void zero_One_Triangle(int n){
        int start = 1;
        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                start = 0;
            }
            else{
                start = 1;
            }
            for(int j=1; j<=i; j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }

    }

    public static void zero_One_Triangle1(int n){
        int tnol = n;
        int cnol = 1;
        int st = 1;
        int num = 1;
        while(cnol<=tnol){
            if(cnol%2 == 0){
                num = 0;
            }
            else{
                num = 1;
            }
            for(int i=1; i<=st; i++){
                System.out.print(num+" ");
                num = 1-num;
            }
            //prepare for next line
            System.out.println();
            cnol++;
            st++;
            
        }
    }

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        zero_One_Triangle1(n);
    }
}

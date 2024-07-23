package Functions_And_Method.assignment;

import java.util.Scanner;

public class AvgOfThreeNumber {
    public static double avgOfThreeNumber(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of A, B and C: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("Average of :\n"+" a: "+a+"\n b: "+b+"\n c: "+c+"\n Avg ="+avgOfThreeNumber(a, b, c));
    }

}

package Functions_And_Method.assignment;

import java.util.Scanner;

public class CheckPalindrome {
    public static void checkPalindrome(int n){
        int temp , Num  = n;
        int rev = 0;
        while(n!=0){
            temp = n%10;
            rev = rev * 10 + temp;
            n = n/10;
        }
        if(rev == Num){
            System.out.println(Num+" is a Palindrome");
        }
        else{
            System.out.println(Num+" is not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        checkPalindrome(n);
    }

}

/*
    You are given a number(eg - 2019), convert it into s String of 
    english like "two zero one nine". Use a recursion function to solve 
    this problem.

    Note - the digits of the number will only be in the range 0-9 and 
    the last digit of a number can't be 0.

    Sample Input: 1947
    Sample Output: "one nine four seven"
 */
package Recursion.assignment;

public class Convert_Int_TO_English_String {

    static String num[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void convert_Int_TO_English_String(int n){
        if(n == 0){
            return;
        }
        //Kaam
        int lastDigit = n%10;
        convert_Int_TO_English_String(n/10);
        System.out.print(num[lastDigit]+" ");
        

    }
    public static void main(String[] args) {
        int n = 1940;
        convert_Int_TO_English_String(n);
    }
}

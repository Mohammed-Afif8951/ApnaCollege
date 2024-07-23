/*Question2: Write a method named is Even that
 accepts an int argument. The method should
  return true if the argument is even, or 
  false otherwise. Also write a program to 
  test your method. */

package Functions_And_Method.assignment;

import java.util.Scanner;

public class Even {

    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        if(isEven(n)){
            System.out.println(n+" is Even");
        }
        else{
            System.out.println(n+" is Odd");
        }
    }
}

/*
    Write a program to find Length of a String using Recursion.
 */
package Recursion.assignment;

public class Find_Length_Of_String {

    public static int find_Length_Of_String(String str){
        if(str.length() == 0){
            return 0;
        }

        return find_Length_Of_String(str.substring(1))+1;
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(find_Length_Of_String(str));
    }
}

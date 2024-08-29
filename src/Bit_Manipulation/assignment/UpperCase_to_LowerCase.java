package Bit_Manipulation.assignment;

public class UpperCase_to_LowerCase {

    public static void main(String[] args) {
        for(char ch='A'; ch<='Z'; ch++){
            System.out.print((char)(ch|' ')+" ");
        }
    }
}

package Bit_Manipulation;

public class Check_For_Odd_Or_Even {

    public static void check_OddEven(int n){
        int bitmask = 1;
        if( (n&bitmask) == 1){
            System.out.println("It is Odd");
        }
        else{
            System.out.println("It is Even");
        }
    }
    public static void main(String[] args) {
        check_OddEven(10);
    }

}

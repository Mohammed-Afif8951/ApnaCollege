package Bit_Manipulation;

public class Clear_Range_Of_Bits {

    public static int clear_Range_Of_Bits(int n, int i, int j){
        int a = (~0)<<j+1;
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear_Range_Of_Bits(10, 2, 4));
    }
}

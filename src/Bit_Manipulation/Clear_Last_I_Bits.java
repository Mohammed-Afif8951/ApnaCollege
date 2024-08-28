package Bit_Manipulation;

public class Clear_Last_I_Bits {

    public static int clear_Last_I_Bits(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clear_Last_I_Bits(15,2));
    }
}
